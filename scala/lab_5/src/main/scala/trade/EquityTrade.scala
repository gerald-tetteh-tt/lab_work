package trade

class EquityTrade(id: String, val symbol: String, val quantity: Int, initialPrice: Double)
  extends Trade(id, initialPrice) {
  
  override def isExecutable: Boolean = true
}
