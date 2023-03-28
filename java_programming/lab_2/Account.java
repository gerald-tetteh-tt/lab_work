class Account {
	public Account() {}

	private double totalValueOfTrades;

	public void setTotalValueOfTrades(double value) {
		if(value < 0) return;
		this.totalValueOfTrades = value;
	}

	public double getTotalValueOfTrades() {
		return this.totalValueOfTrades;
	}
}
