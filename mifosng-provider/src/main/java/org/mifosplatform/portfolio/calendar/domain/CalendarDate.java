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
@Table(name = "ct_meeting_dates")
public class CalendarDate extends AbstractPersistable<Long> {
	
	@Column(name = "entity_id", nullable = false)
    private Long entityId;

    @Column(name = "entity_type_id", nullable = false)
    private Integer entityTypeId;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "meeting_date", nullable = false)
    private final Date meetingDate;

	public CalendarDate(final LocalDate endOfBalanceDate, final Integer entityTypeId, final Long entityId) {
        this.meetingDate = endOfBalanceDate.toDate();
        this.entityId = entityId;
        this.entityTypeId = entityTypeId;
    }
	
	public Long getEntityId() {
	    return this.entityId;
	}
	
	public Integer getEntityTypeId() {
	    return this.entityTypeId;
	}
	
	public Date getMeetingDate() {
		return this.meetingDate;
	}
}
