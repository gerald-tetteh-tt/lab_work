public class Client {
    private final String firstName;
    private final String lastName;
    private MembershipType membershipType;
    private int points;
    private int totalTradesToday;
    private double totalValueOfTrades;
    private double spendingLimit;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setSpendingLimit(double value) {
        if(value < 0) return;
        this.spendingLimit = value;
    }

    public boolean canTrade() {
        if(this.membershipType instanceof Bronze) {
            Bronze bronze = (Bronze) membershipType;
            if(!bronze.canTrade()) {
                return false;
            }
        }
        boolean exceededTradeLimit = totalTradesToday >= membershipType.getMaxTradesPerDay();
        if(membershipType.getHasSpendingLimit()) {
            return !exceededTradeLimit && (totalValueOfTrades < spendingLimit);
        }
        return exceededTradeLimit ? false: true;
    }

    public void addTrade(Trade trade) {
        if (!this.canTrade()) return;
        this.points++;
        this.totalTradesToday++;
        this.totalValueOfTrades += trade.getValue();
    }
}
