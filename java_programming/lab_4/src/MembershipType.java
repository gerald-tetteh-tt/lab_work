import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum MembershipType {
    BRONZE(5,1) {
        private boolean checkTimeLimit() {
            LocalTime timeLimit = LocalTime.of(10,0,0);
            LocalTime currentTime = LocalTime.now();
            return currentTime.isAfter(timeLimit);
        }

        @Override
        public boolean canTrade(int totalTrades, double totalValueOfTrades) {
            if(!checkTimeLimit()) {
                return false;
            }
            return super.canTrade(totalTrades, totalValueOfTrades);
        }
    },
    SILVER(10,10) {

        public boolean canTrade(int totalTrades, double totalValueOfTrades) {
            boolean exceededTradeLimit = totalTrades >= this.maxTradesPerDay;
            return exceededTradeLimit || (!(totalValueOfTrades < spendingLimit));
        }
    },
    GOLD(20,20);

    protected final int maxTradesPerDay;
    protected double spendingLimit;
    private final int minimumPoints;

    MembershipType(int maxTradesPerDay, int minimumPoints) {
        this.maxTradesPerDay = maxTradesPerDay;
        this.minimumPoints = minimumPoints;
        this.spendingLimit = 1000;
    }

    public void setSpendingLimit(double value) {
        if(value < 0) return;
        this.spendingLimit = value;
    }

    public boolean canTrade(int totalTrades, double totalValueOfTrades) {
        return totalTrades < this.maxTradesPerDay;
    }
}
