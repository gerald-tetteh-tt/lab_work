public class Silver extends MembershipType {
    public static int minimumPoints = 10;
    public Silver(int maxTradesPerDay) {
        super(maxTradesPerDay);
    }

    @Override
    public boolean canTrade() {
        return false;
    }
}
