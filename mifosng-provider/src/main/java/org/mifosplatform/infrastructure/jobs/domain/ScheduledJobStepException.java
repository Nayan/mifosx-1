package org.mifosplatform.infrastructure.jobs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "job_error_log")
public class ScheduledJobStepException extends AbstractPersistable<Long> {

	@Column(name = "job_id", nullable = false)
    private Long jobId;
	
	@Column(name = "start_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
	
	@Column(name = "entity_id", nullable = false)
    private Long entityId;

    @Column(name = "entity_type_id", nullable = false)
    private Integer entityTypeId;

    @Column(name = "error_message")
    private String errorMessage;

    protected ScheduledJobStepException() {

    }

    public ScheduledJobStepException(final Long jobId, final Date startTime,
    		final String errorMessage, final Long entityId,
    		final Integer entityTypeId) {
    	this.jobId = jobId;
    	this.startTime = startTime;
        this.entityId = entityId;
        this.entityTypeId = entityTypeId;
        this.errorMessage = errorMessage;
    }

}