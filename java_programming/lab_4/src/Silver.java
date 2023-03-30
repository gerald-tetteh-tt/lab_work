public class Silver extends MembershipType {
    public static int minimumPoints = 10;

    public Silver(int maxTradesPerDay,double spendingLimit) {
        super(maxTradesPerDay,true);
    }
}
