package org.mifosplatform.portfolio.calendar.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CalendarDateRepository extends JpaRepository<CalendarDate, Long>, JpaSpecificationExecutor<CalendarDate>{
	
	@Query("delete from MeetingDate md where md.entity_type_id = :entityTypeId and md.entityId = :entityId")
	Integer deleteProductByEntityTypeAndEntityId(@Param("entityTypeId") Long entityTypeId, @Param("entityId") Long entityId);
	
}
