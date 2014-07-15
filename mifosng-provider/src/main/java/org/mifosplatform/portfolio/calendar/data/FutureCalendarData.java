package org.mifosplatform.portfolio.calendar.data;

import org.joda.time.LocalDate;

public class FutureCalendarData {

	private final int numberOfFutureCalendars;
    private final Integer entityTypeEnum;
    private final Long entityId;
    private final LocalDate fromDate;
    private final LocalDate startDate;
    private final String recurrence;
    
    public FutureCalendarData(final int numberOfFutureCalendars, final LocalDate fromDate,
            final Integer entityTypeEnum, final Long entityId, final LocalDate startDate, final String recurrence) {
           this.numberOfFutureCalendars = numberOfFutureCalendars;
           this.fromDate = fromDate;
           this.entityTypeEnum = entityTypeEnum;
           this.entityId = entityId;
           this.startDate = startDate;
           this.recurrence = recurrence;
       }

   public int getNumberOfFutureCalendars() {
       return numberOfFutureCalendars;
   }

   public LocalDate getFromDate() {
       return fromDate;
   }

   public Long getEntityId() {
       return entityId;
   }

   public Integer getEntityTypeEnum() {
       return entityTypeEnum;
   }

   public String getRecurrence() {
	   return recurrence;
   }

   public LocalDate getStartDate() {
	   return startDate;
   }
   
}
