package patternMatching

import munit.FunSuite
import PatternMatching._

class PatternMatchingTest extends FunSuite {

  test("return range string based on number") {
    assertEquals(questionOne(-4),"<0")
    assertEquals(questionOne(5),"0<=number<=18")
    assertEquals(questionOne(19),"18<=number<=35")
    assertEquals(questionOne(40),"36<=number<=65")
    assertEquals(questionOne(100),">65")
  }

  test("returns 0 when list is empty") {
    assertEquals(questionTwo(List()),0)
  }

  test("returns the third item if list has three items") {
    assertEquals(questionTwo(List(4,5,6)),6)
  }

  test("returns first item from list") {
    assertEquals(questionTwo(List(3,4)),3)
  }

  test("returns list length") {
    assertEquals(questionThree(List(1,2,3,4)),4)
  }

  test("returns map size") {
    assertEquals(questionThree(Map(1 -> "Hello")), 1)
  }

  test("returns vector size") {
    assertEquals(questionThree(Vector("hello", "there")), 2)
  }

  test("returns negative one") {
    assertEquals(questionThree(Set(1,2,3)), -1)
  }

  test("valid parenthesis") {
    assert(questionFour("()"))
    assert(questionFour("((()))"))
    assert(questionFour("(())()()(())((()))"))
    assert(!questionFour("(()"))
    assert(!questionFour(")("))
  }
}
