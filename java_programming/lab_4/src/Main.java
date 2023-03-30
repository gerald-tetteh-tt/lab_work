import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        BondTrade bondTrade = new BondTrade("BT","GAD",34,780.0,1000);
        BondTrade bondTrade2 = new BondTrade("BT","GAD",34,5.0,1000);
        BondTrade bondTrade3 = new BondTrade("BT","GAD",34,9.0,1000);
        BondTrade bondTrade4 = new BondTrade("BT","GAD",34,10.0,1000);
        FundTrade fundTrade = new FundTrade("FT","GAD",23,240,55.9);
//        System.out.println(bondTrade.calcDividend());
//        System.out.println(fundTrade.calcDividend());
//        System.out.println(LocalDateTime.now());
        Account account = new Account(5);
        account.addTrade(bondTrade);
        account.addTrade(fundTrade);
        account.addTrade(bondTrade2);
        account.addTrade(bondTrade3);
        account.addTrade(bondTrade4);
        account.printTrades();
        account.printTradesUnder10();

//        LocalTime timeLimit = LocalTime.parse("10:00:00+00:00",
//                DateTimeFormatter.ISO_TIME);
//        LocalTime currentTime = LocalTime.now();
//        System.out.println(currentTime.isAfter(timeLimit));
    }
}
