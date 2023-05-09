package trading;

public abstract class Trade {
    private String id;
    private String  symbol;
    protected int qty;
    private double price;

    public Trade(String id, String symbol, int qty, double price) {
        this.id = id;
        this.symbol = symbol;
        this.qty = qty;
        this.price = price;
    }

    public Trade(String id, String symbol, int qty) {
        this(id, symbol, qty, 0);
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "trading.Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public abstract double calcDividend();
}
