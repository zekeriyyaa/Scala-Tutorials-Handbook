import scala.util.control._

object BreakStatement {
  def main(args: Array[String]): Unit = {

    var a = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val loop = new Breaks;
    loop.breakable {
      for (a <- numList) {
        println("value: "+ a)
        if (a == 5) {
          loop.break()
        }
      }
    }

    println("loop ended")


  }

}
