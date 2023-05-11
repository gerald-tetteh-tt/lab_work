package question

import scala.annotation.tailrec

object Questions {

  // tail recursive
  def sumNumbers(a: Int, b:Int): Int = {

    @tailrec
    def sumAccumulator(a: Int, acc:Int): Int = {
      if(a > b) then acc
      else sumAccumulator(a+1,acc + a)
    }

    sumAccumulator(a,0)
  }

  // recursive solution
  def fibonacciRecur(n: Int): Int = {
    if(n == 1) 1
    else if (n < 1) 0
    else fibonacciRecur(n - 2) + fibonacciRecur(n - 1)
  }
  def fibTailRecur(n: Int): Int = {

    @tailrec
    def fibAcc(first: Int, second: Int, n: Int): Int = {
      if (n <= 1) second
      else fibAcc(second, first + second, n - 1)
    }

    fibAcc(0,1,n)
  }

  def countCharacters(s: String): Map[Char, Int] = {

    @tailrec
    def charCounter(chars: List[Char], map: Map[Char, Int]): Map[Char, Int] = {
      if(chars.isEmpty) map
      else
        val head = chars.head
        val count = map.getOrElse(head,0)
        charCounter(chars.tail,map + (head -> (count + 1)))
    }

    charCounter(s.toList, Map())
  }

  def hasValidParenthesis(s: String): Boolean = {

    @tailrec
    def validParenthesisChecker(s: List[Char], stackCount: Int): Boolean = {
      if(s.isEmpty) stackCount == 0
      else if(stackCount < 0) false
      else {
        val head = s.head
        if (head == '(') validParenthesisChecker(s.tail, stackCount + 1)
        else validParenthesisChecker(s.tail, stackCount - 1)
      }
    }

    validParenthesisChecker(s.toList,0)
  }

  def generateValidParenthesis(n: Int): List[String] = {

    def generateBrackets(brackets: List[String], n: Int): List[String] = {
     ???
    }

    ???
  }
}
