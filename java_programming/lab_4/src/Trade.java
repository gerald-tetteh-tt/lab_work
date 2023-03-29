import java.time.LocalDateTime;

public abstract class Trade {
    private final String id;
    private final String symbol;
    private final int quantity;
    private final LocalDateTime tradeMadeAt;
    protected double price;

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.tradeMadeAt = LocalDateTime.now();
    }

    public Trade(String id, String symbol, int quantity) {
        this(id,symbol,quantity,0);
    }

    public void setPrice(double newPrice) {
        if(newPrice < 0) return;
        this.price = newPrice;
    }

    public double getValue() {
        return quantity * price;
    }

    public abstract double calcDividend();

    @Override
    public String toString() {
        return "Trade("+id+","+symbol+","+quantity+","+price+","+tradeMadeAt+")";
    }
}
