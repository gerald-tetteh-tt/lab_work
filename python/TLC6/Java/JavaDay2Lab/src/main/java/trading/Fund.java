package trading;

public class Fund extends Trade {

    private static final double percentage = 0.05;


    public Fund(String id, String symbol, int quantity){
        super(id, symbol, quantity);

    }
    public Fund(String id, String symbol, int qty, double price) {
        super(id, symbol, qty, price);
    }

    @Override
    public double calcDividend() {
        return percentage*getPrice();





        //        double newPercentage;
//        if (qty > 10){
//            if (getPrice() > 0.95){
//                newPercentage = percentage +0.02;
//            }
//            else if (getPrice()> 0.85){
//
//                newPercentage=  percentage +0.01;
//            }
//            else{
//                newPercentage = percentage + 0.005;
//            }
//        }
//        else {
//            newPercentage = percentage;
//        }
//        return newPercentage * getPrice();
    }

}
