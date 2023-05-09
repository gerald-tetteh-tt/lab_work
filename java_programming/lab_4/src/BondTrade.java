public class BondTrade extends Trade {
    private final double dividend;

    public BondTrade(String id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.dividend = dividend;
    }

    public BondTrade(String id, String symbol, int quantity, double dividend) {
        this(id,symbol,quantity,0,dividend);
    }

    @Override
    public double calcDividend() {
        return this.dividend;
    }
}
