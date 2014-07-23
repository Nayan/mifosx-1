package org.mifosplatform.portfolio.calendar.data;

import org.joda.time.LocalDate;

public class FutureCalendarData {

	private final Long officeId;
	private final int numberOfFutureCalendars;
    private final Long calendarInstanceId;
    private final LocalDate fromDate;
    private final LocalDate startDate;
    private final String recurrence;
    
    public FutureCalendarData(final Long officeId, final int numberOfFutureCalendars, final LocalDate fromDate,
    	  final Long calendarInstanceId, final LocalDate startDate, final String recurrence) {
    	   this.officeId = officeId;
           this.numberOfFutureCalendars = numberOfFutureCalendars;
           this.fromDate = fromDate;
           this.calendarInstanceId = calendarInstanceId;
           this.startDate = startDate;
           this.recurrence = recurrence;
       }

   public int getNumberOfFutureCalendars() {
       return numberOfFutureCalendars;
   }

   public LocalDate getFromDate() {
       return fromDate;
   }

   public Long getCalendarInstanceId() {
       return calendarInstanceId;
   }

   public String getRecurrence() {
	   return recurrence;
   }

   public LocalDate getStartDate() {
	   return startDate;
   }

	public Long getOfficeId() {
		return officeId;
	}
   
}
