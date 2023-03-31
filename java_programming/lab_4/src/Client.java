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
        membershipType.setSpendingLimit(value);
    }

    public void addTrade(Trade trade) {
        if (membershipType.canTrade(totalTradesToday, totalValueOfTrades)) return;
        this.points++;
        this.totalTradesToday++;
        this.totalValueOfTrades += trade.getValue();
    }
}
