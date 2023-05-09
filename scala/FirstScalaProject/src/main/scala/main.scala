package io.turntabl

@main
def main(): Unit = {
  println("Hello world!")
  val x = 7
  println(multiply(x,23))
}

def multiply(a: Int, b: Int) : Int = a * b