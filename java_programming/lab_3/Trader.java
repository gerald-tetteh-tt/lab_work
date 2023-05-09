class Trader {
	private String name;
	private Account account;

	public Trader(String name) {
		this.name = name;
		this.account = new Account();
	}
	
	public void addTrade(Trade trade) {
		account.setTotalValueOfTrades(trade.getValue());
	}

	@Override
	public String toString() {
		return "Trader("+name+","+account.getTotalValueOfTrades()+")";
	}
}
