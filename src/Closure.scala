/*
* A function return value  depend on the variables declared outside of the function
* */

object Closure {
  def main(args: Array[String]): Unit = {
    var z = 5
    val total_cal = (x: Int, y: Int) => (x + y) * z
    println(total_cal(2,5))
    println(s"$z")
  }


}
