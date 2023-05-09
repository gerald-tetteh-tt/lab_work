package trading;

public class TooManyTradesException  extends Exception{

    private double totalValueOfTrades;
    public TooManyTradesException(String message, double totalValue){
        super(message);
        this.totalValueOfTrades = totalValue;
    }

    public double getTotalValueOfTrades() {
        return totalValueOfTrades;
    }
}
