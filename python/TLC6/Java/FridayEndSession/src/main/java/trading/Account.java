package trading;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double totalValOfTrades;

    private List<Trade> trades;

    public double getTotalValOfTrades() {
        return totalValOfTrades;
    }

    public void addTradetoList(Trade t) throws TooManyTradesException{
        // if the 'if' statement is missing -> runtime null pointer exception
        if (trades == null){
            trades = new ArrayList<>();
        }
        if (trades.size() <5 ) {
            trades.add(t);
        }
        else{
            throw new TooManyTradesException("You have reached your limit!!", totalValOfTrades);
            //System.out.println("Too many trades!!");
        }
        this.setTotalValOfTrades(t.getPrice()*t.getQty());
    }

    private void setTotalValOfTrades(double newTradeValue) {
        this.totalValOfTrades += newTradeValue;
    }
}
