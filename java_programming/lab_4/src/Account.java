import java.util.Arrays;

public class Account {
    private final Trade[] trades;
    private int tradesIndex;
    private double totalValueOfTrades;
    private int arraySize;

    public Account(int totalPossibleTrades) {
        this.trades = new Trade[totalPossibleTrades];
        this.arraySize = totalPossibleTrades;
    }

    public void addTrade(Trade trade) {
        trades[tradesIndex] = trade;
        tradesIndex++;
    }

    public void printTrades() {
        System.out.println(Arrays.toString(trades));
    }

    public void printTradesUnder10() {
        for(int i = 0; i < arraySize; i++) {
            if(this.trades[i] != null && this.trades[i].price < 10) {
                System.out.println(this.trades[i]);
            }
        }
    }

    public void setTotalValueOfTrades(double value) {
        if(value < 0) return;
        this.totalValueOfTrades += value;
    }

    public double getTotalValueOfTrades() {
        return this.totalValueOfTrades;
    }
}
