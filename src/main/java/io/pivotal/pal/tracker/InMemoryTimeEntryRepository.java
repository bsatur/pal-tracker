package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.List;


public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    private List<TimeEntry> timeEntryList;

    private long newID ;

    public InMemoryTimeEntryRepository(){
        this.newID = 1L;
        this.timeEntryList = new ArrayList<TimeEntry>();


    }

    @Override
    public TimeEntry create(TimeEntry newTimeEntry) {


        if (newTimeEntry.getId() == 0) {
            newTimeEntry.setId(newID);
            newID++;
        }

        timeEntryList.add(newTimeEntry);
        return newTimeEntry;
    }

    @Override
    public TimeEntry find(long timeEntryId) {
        if (timeEntryList == null){
            return null;
        }
        for (TimeEntry timeEntry : timeEntryList) {

            if (timeEntry.getId() == timeEntryId) {
                return timeEntry;
            }
        }
        return null;
    }

    @Override
    public List<TimeEntry> list() {

        return timeEntryList;


    }

    @Override
    public TimeEntry update(long id, TimeEntry newTimeEntry) {
        TimeEntry timeEntry;
        if (timeEntryList == null) {
            return null;
        }
        for (int i = 0 ; i < timeEntryList.size(); i++) {

            timeEntry = timeEntryList.get(i);

            if (timeEntry.getId() == id) {
                newTimeEntry.setId(id);
                timeEntryList.set(i, newTimeEntry);
                return newTimeEntry;

            }
        }
        return null;
     }

    @Override
    public void delete(long timeEntryId) {
        if (timeEntryList == null) {
            return ;
        }

        TimeEntry timeEntry;
        for (int i = 0 ; i < timeEntryList.size(); i++) {
            timeEntry = timeEntryList.get(i);
            if (timeEntry.getId() == timeEntryId) {
                timeEntryList.remove(i);

                return;

            }
        }

    }
}
