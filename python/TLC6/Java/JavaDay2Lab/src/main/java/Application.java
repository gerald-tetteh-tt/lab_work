import trading.*;

public class Application {

    public static void main(String[] args) {
        Trade t1 = new Fund("T1", "APPL", 100, 15.25);

        Trade t2 = new Bond("T2", "TSL", 10, 12.45, 0.2);


        System.out.println(t1);
        System.out.println(t2);
        t2.setPrice(1);
        System.out.println(t2);
        Account acc = new Account();
        Trader joe = new Trader("Joe",acc);
        joe.addTrade(t1);
        System.out.println(joe.getValueOfTrades());
        joe.addTrade(t2);
        System.out.println(joe.getValueOfTrades());






        //FileReader freader  =new FileReader("MyFile");


    }
}
