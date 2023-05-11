package trade

class FXTrade(id: String, initialPrice: Double)
  extends Trade(id, initialPrice) {

  override def isExecutable: Boolean = false

  override def value: Double = ???
}
