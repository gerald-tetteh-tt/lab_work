public class FundTrade extends Trade {
    private final double dividendPercentage;

    FundTrade(String id, String symbol, int quantity, double price, double dividendPercentage) {
        super(id,symbol,quantity,price);
        this.dividendPercentage = dividendPercentage;
    }

    FundTrade(String id, String symbol, int quantity, double dividendPercentage) {
        this(id,symbol,quantity,0,dividendPercentage);
    }

    @Override
    public double calcDividend() {
        return (this.dividendPercentage / 100) * this.price;
    }
}
