package io.turntabl
package trade

import org.scalatest.BeforeAndAfterEach
import org.scalatest.funsuite.AnyFunSuite

class TradeTest extends AnyFunSuite with BeforeAndAfterEach {

  private var underTest:Trade = _

  override def beforeEach(): Unit = {
    underTest = new Trade(id = "T1", symbol = "APPL", quantity = 100, initialPrice = 15.25)
  }

  test("Value should return the product of quantity and price") {
    assert(underTest.value == 1525)
  }
}
