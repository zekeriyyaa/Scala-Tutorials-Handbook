import scala.util.control._

object BreakNestedLoop {
  def main(args: Array[String]): Unit = {

    var a = 0
    var b = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val outer = new Breaks
    val inner = Breaks
    outer.breakable {
      for (a <- numList) {
        println("value outer: " + a)
        if (a == 5) {
          outer.break()
        }
        inner.breakable {
          for (b <- numList) {
            println("value inner: "+b)
            if (b == 3) {
              inner.break()
            }
          }
        }
      }
    }

    println("loop ended")


  }

}
