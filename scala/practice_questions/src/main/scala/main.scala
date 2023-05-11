import question.Questions._

@main
def main(): Unit = {
  println(sumNumbers(3,10))
  println(fibonacciRecur(10))
  println(fibTailRecur(10))
  println(countCharacters("llcoolj"))
  println(hasValidParenthesis("()"))
  println(hasValidParenthesis("((()))"))
  println(hasValidParenthesis("(())()()(())((()))"))
  println(hasValidParenthesis("(()"))
  println(hasValidParenthesis(")("))
}