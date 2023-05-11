package patternMatching.challenge

object ExprShow {

  def show(expr: Expr): String = {
    expr match {
      case Number(n) => n.toString
      case Sum(e1, e2) => s"${show(e1)} + ${show(e2)}"
      case Prod(e1, e2) if () =>
    }
  }
}
