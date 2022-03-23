/*
* 1. Declaring a Function
* 2. Recursion in Function
* 3. Default Arguments
* 4. Named Arguments
* 5. Functions with Variable Arguments
* 6. High-Order Functions
* 7. Nested Functions
* 8. Anonymous Functions
* 9. Currying Functions
* */

object Functions {
  def main(args: Array[String]): Unit = {
    sayHello()
    sayHello2()
    println(sum(2, 4))
    println(sum2(2, 4))
    println(factorial(4))
    println(multiply(3))
    println(multiply(a = 3))
    println(multiply(b = 7))
    println(sum3(3,5,6,6,3,2))
    println(check(9,5))
    println(check(3,3))
  }

  def sayHello() {
    println("hello")
  }

  def sayHello2(): Unit = {
    println("hello")
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def sum2(a: Int, b: Int): Int = {
    return a + b
  }

  def factorial(n: Int): Int = {
    if (n == 1 || n == 0) {
      return 1
    }
    n * factorial(n - 1)
  }

  def multiply(a: Int = 1, b: Int = 3): Int = {
    return a * b
  }

  def sum3(args: Int*): Int = {
    var result = 0
    for (arg <- args) {
      result += arg
    }
    return result
  }

  def check(a:Int,b:Int):Int={
    if(a<b) a else if(a==b) b else 0
  }
}