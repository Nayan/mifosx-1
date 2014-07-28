package org.mifosplatform.infrastructure.jobs.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScheduledJobStepExceptionRepository extends JpaRepository<ScheduledJobStepException, Long>,
JpaSpecificationExecutor<ScheduledJobStepException> {


}
