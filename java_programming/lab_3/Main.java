class Main {
	public static void main(String args[]) {
		Trade t1 = new Trade("T1","GAD",7,77.7);
		System.out.println(t1);
		t1.setPrice(-1);
		System.out.println(t1);
		t1.setPrice(70);
		System.out.println(t1);
		Trader trader = new Trader("Darth Vader");
		System.out.println(trader);
		trader.addTrade(t1);
		System.out.println(trader);
	}
}
