package trading;

public class Bond extends Trade {

    private double dividend;

    public Bond(String id, String symbol, int qty, double price, double dividend) {
        super(id, symbol, qty, price);
        this.dividend = dividend;
    }

    @Override
    public double calcDividend() {
        return dividend;
    }
}
