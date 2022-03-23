/*
* multiple parameters
* */
object CurryingFunction {
  def main(args: Array[String]): Unit = {
    println(sum(3)(4))

  }

  def sum(a: Int)(b: Int): Int = {
    a + b
  }
}
