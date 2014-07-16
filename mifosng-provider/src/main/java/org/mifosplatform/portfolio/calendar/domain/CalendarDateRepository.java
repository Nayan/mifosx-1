package org.mifosplatform.portfolio.calendar.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CalendarDateRepository extends JpaRepository<CalendarDate, Long>, JpaSpecificationExecutor<CalendarDate> {
	
	@Modifying
	@Transactional
	@Query("delete from CalendarDate cd where cd.calendarInstanceId = :calendarInstanceId")
	Integer deleteCalendarDateByCalendarInstanceId(@Param("calendarInstanceId") Long calendarInstanceId);
	
}
