package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 */
public class TimeEntry {

    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;

    public TimeEntry(Object id, long projectId, long userId, LocalDate date, int hours) {
        this.id = (long) id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    private int hours;

    public TimeEntry( long projectId, long userId, LocalDate date, int hours) {
        this.id = 0;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry() {

    }

    public Long getId() {

        return  this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return
                projectId == timeEntry.projectId &&
                userId == timeEntry.userId &&
                hours == timeEntry.hours &&
                date.isEqual(timeEntry.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, userId, date, hours);
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }
}

