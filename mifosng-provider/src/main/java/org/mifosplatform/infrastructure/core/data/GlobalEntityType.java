package org.mifosplatform.infrastructure.core.data;

import java.util.HashMap;
import java.util.Map;


public enum GlobalEntityType {

	INVALID(0, "globalEntityType.invalid"),
	CLIENTS(1, "globalEntityType.clients"),
	GROUPS(2, "globalEntityType.groups"),
	CENTERS(3, "globalEntityType.centers"),
	OFFICES(4, "globalEntityType.offices"),
	STAFF(5, "globalEntityType.staff"),
	USERS(6, "globalEntityType.users"),
	JOBS(7, "globalEntityType.jobs"),
	SMS(8, "globalEntityType.sms"),
	DOCUMENTS(9, "globalEntityType.documents"),
	TEMPLATES(10, "globalEntityType.templates"),
	NOTES(11, "globalEntityType.templates"),
	CALENDAR(12, "globalEntityType.calendar"),
	MEETINGS(13, "globalEntityType.meetings"),
	HOLIDAYS(14, "globalEntityType.holidays"),
	LOANS(15, "globalEntityType.loans"),
	LOAN_PRODUCTS(16, "globalEntityType.loan.products"),
	LOAN_CHARGES(17, "globalEntityType.loan.charges"),
	LOAN_TRANSACTIONS(18, "globalEntityType.loan.transactions"),
	GUARANTORS(19, "globalEntityType.guarantors"),
	COLLATERALS(20, "globalEntityType.collaterals"),
	FUNDS(21, "globalEntityType.funds"),
	CURRENCY(22, "globalEntityType.currencies"),
	SAVINGS_ACCOUNT(23, "globalEntityType.savings.account"),
	SAVINGS_CHARGES(24, "globalEntityType.savings.charges"),
	SAVINGS_TRANSACTIONS(25, "globalEntityType.savings.transactions"),
	SAVINGS_PRODUCTS(26, "globalEntityType.savings.products"),
	GL_JOURNAL_ENTRIES(27, "globalEntityType.gl.journal.entries");

    private final Integer value;
    private final String code;

    private static final Map<Integer, GlobalEntityType> intToEnumMap = new HashMap<>();
    private static int minValue;
    private static int maxValue;
    static {
        int i = 0;
        for (final GlobalEntityType entityType : GlobalEntityType.values()) {
            if (i == 0) {
                minValue = entityType.value;
            }
            intToEnumMap.put(entityType.value, entityType);
            if (minValue >= entityType.value) {
                minValue = entityType.value;
            }
            if (maxValue < entityType.value) {
                maxValue = entityType.value;
            }
            i = i + 1;
        }
    }

    private GlobalEntityType(final Integer value, final String code) {
        this.value = value;
        this.code = code;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getCode() {
        return this.code;
    }
    
    public static GlobalEntityType fromInt(final int i) {
        final GlobalEntityType entityType = intToEnumMap.get(Integer.valueOf(i));
        return entityType;
    }
    
    public static int getMinValue() {
        return minValue;
    }

    public static int getMaxValue() {
        return maxValue;
    }

    @Override
    public String toString() {
        return name().toString();
    }
}
