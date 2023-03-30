import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum MembershipType {
    BRONZE(5,false,1),
    SILVER(10,true,10),
    GOLD(20,false,20);

    private final int maxTradesPerDay;
    private final boolean hasSpendingLimit;
    private double spendingLimit;
    private final int minimumPoints;

    MembershipType(int maxTradesPerDay, boolean hasSpendingLimit, int minimumPoints) {
        this.maxTradesPerDay = maxTradesPerDay;
        this.hasSpendingLimit = hasSpendingLimit;
        this.minimumPoints = minimumPoints;
        this.spendingLimit = 1000;
    }

    public void setSpendingLimit(double value) {
        if(value < 0) return;
        this.spendingLimit = value;
    }

    private boolean bronzeCanTrade() {
        LocalTime timeLimit = LocalTime.parse("10:00:00+00:00",
                DateTimeFormatter.ISO_TIME);
        LocalTime currentTime = LocalTime.now();
        return currentTime.isAfter(timeLimit);
    }

    public boolean canTrade(int totalTrades, double totalValueOfTrades) {
        if(this == BRONZE) {
            if(!bronzeCanTrade()) {
                return false;
            }
        }
        boolean exceededTradeLimit = totalTrades >= this.maxTradesPerDay;
        if(this.hasSpendingLimit) {
            return !exceededTradeLimit && (totalValueOfTrades < spendingLimit);
        }
        return !exceededTradeLimit;
    }
}
