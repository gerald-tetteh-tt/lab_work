package mocking;

import trading.Trade;

public class SpecialBond extends Trade {
    private IDividendsCalculator divCalc;

    public SpecialBond(String id, String symbol, int qty, double price, IDividendsCalculator divCalc) {
        super(id, symbol, qty, price);
        this.divCalc = divCalc;
    }

    @Override
    public double calcDividend() {
        if (qty > 10){
            return divCalc.getDividends(this)* 0.15;
        }else{
            return 0.20;
        }
    }
}
