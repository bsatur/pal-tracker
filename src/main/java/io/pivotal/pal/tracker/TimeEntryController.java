package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeEntryController {

    
    private  final TimeEntryRepository timeEntryRepository;


    public TimeEntryController(TimeEntryRepository timeEntryRepository) {

        this.timeEntryRepository = timeEntryRepository;
    }


    public ResponseEntity create(TimeEntry timeEntryToCreate) {

        return null;
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {

        return  null   ;
    }

    public ResponseEntity<List<TimeEntry>> list() {

        return null;
    }

    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        return  null;
    }

    public ResponseEntity delete(long timeEntryId) {

        return  null;
    }
}
