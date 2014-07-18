package org.mifosplatform.portfolio.calendar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.LocalDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "ct_calendar_dates")
public class CalendarDate extends AbstractPersistable<Long> {
	
	@Column(name = "calendar_instance_id", nullable = false)
    private Long calendarInstanceId;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "meeting_date", nullable = false)
    private final Date meetingDate;
	
	public CalendarDate() {
		this.meetingDate = null;
        this.calendarInstanceId = null;
	}

	public CalendarDate(final LocalDate endOfBalanceDate, final Long calendarInstanceId) {
        this.meetingDate = endOfBalanceDate.toDate();
        this.calendarInstanceId = calendarInstanceId;
    }
	
	public Long getCalendarInstanceId() {
	    return this.calendarInstanceId;
	}
	
	public Date getMeetingDate() {
		return this.meetingDate;
	}
}
