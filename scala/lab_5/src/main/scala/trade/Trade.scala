package trade

abstract class Trade(val id: String, initialPrice: Double) {
  private var _price = initialPrice
  
  def price: Double = _price
  
  def price_= (newPrice: Double): Unit = {
    if newPrice >= 0 then _price = newPrice
  }
  
  def isExecutable: Boolean
  
  def value: Double
  
  override def toString = s"Trade($_price, $id) => ${if isExecutable then "EquityTrade" else "FXTrade"}"
}