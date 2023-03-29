import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BondTrade bondTrade = new BondTrade("BT","GAD",34,780.0,1000);
        FundTrade fundTrade = new FundTrade("FT","GAD",23,240,55.9);
        System.out.println(bondTrade.calcDividend());
        System.out.println(fundTrade.calcDividend());
        System.out.println(LocalDateTime.now());
    }
}
