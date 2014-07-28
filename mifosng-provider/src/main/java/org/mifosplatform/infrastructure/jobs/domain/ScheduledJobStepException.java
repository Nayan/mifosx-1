package org.mifosplatform.infrastructure.jobs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "job_error_log")
public class ScheduledJobStepException extends AbstractPersistable<Long> {

	@ManyToOne
    @JoinColumn(name = "job_run_history_id")
    private ScheduledJobRunHistory scheduledJobRunHistory;
	
	@Column(name = "entity_id", nullable = false)
    private Long entityId;

    @Column(name = "entity_type_id", nullable = false)
    private Integer entityTypeId;

    @Column(name = "error_message")
    private String errorMessage;

    protected ScheduledJobStepException() {

    }

    public ScheduledJobStepException(final ScheduledJobRunHistory scheduledJobRunHistory, final String errorMessage,
    		final Long entityId, final Integer entityTypeId) {
        this.scheduledJobRunHistory = scheduledJobRunHistory;
        this.entityId = entityId;
        this.entityTypeId = entityTypeId;
        this.errorMessage = errorMessage;
    }

}