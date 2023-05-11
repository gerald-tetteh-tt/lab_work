package patternMatching.challenge

import munit.FunSuite
import patternMatching.challenge.ExprShow._

class ExprShowTest extends FunSuite {

  test("show returns resolved expression") {
    assertEquals(show(Number(2)),"2")
    assertEquals(show(Sum(Number(2),Number(3))), "2 + 3")
    assertEquals(show(Sum(Sum(Number(2),Number(3)), Number(4))), "2 + 3 + 4")
  }
}
