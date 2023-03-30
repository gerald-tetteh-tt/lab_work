public abstract class MembershipType {
    private final int maxTradesPerDay;
    private final boolean hasSpendingLimit;

    public MembershipType(int maxTradesPerDay, boolean hasSpendingLimit) {
        this.maxTradesPerDay = maxTradesPerDay;
        this.hasSpendingLimit = hasSpendingLimit;
    }

    public boolean getHasSpendingLimit() { return hasSpendingLimit; }

    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }
}
