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
        try {
            this.acc.addTradetoList(t);
        } catch(TooManyTradesException e){
            System.out.println(e.getMessage());
            System.out.println("Your total Value of trades is : " + e.getTotalValueOfTrades());
        }
    }

    public double getValueOfTrades(){
        return this.acc.getTotalValOfTrades();
    }
}
