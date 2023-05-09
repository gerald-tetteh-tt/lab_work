package trading;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double totalValOfTrades;

    private List<Trade> trades;

    public double getTotalValOfTrades() {
        return totalValOfTrades;
    }

    public void addTradetoList(Trade t){
        if (trades == null){
            trades = new ArrayList<>();
        }
        trades.add(t);
        this.setTotalValOfTrades(t.getPrice()*t.getQty());
    }

    public void setTotalValOfTrades(double newTradeValue) {
        this.totalValOfTrades += newTradeValue;
    }
}
