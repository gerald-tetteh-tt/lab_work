package trading;

import trading.Account;
import trading.Trade;

public class Trader {

    private String name;
    private Account acc;

    public Trader(String name, Account acc) {
        this.name = name;
        this.acc = acc;
    }

    public void addTrade(Trade t){
        double val = acc.getTotalValOfTrades();
        this.acc.addTradetoList(t);
    }

    public double getValueOfTrades(){
        return this.acc.getTotalValOfTrades();
    }
}
