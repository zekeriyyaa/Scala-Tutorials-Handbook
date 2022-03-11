class Point(val xc: Int, val yc: Int) {
  // primary constructor
  var x: Int = xc
  var y: Int = yc


  def displayPoint(): Unit = {
    println("X : " + x + "Y: " + y)
  }

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy

    println(s"Current coordinates : ${x} and ${y}")
  }

}

class ExtentedClass(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    move(dx = dx, dy = dy)
    z += dz
    println(s"Current coordinates : ${x} , ${y} , ${z}")
  }
}


object MyDemo {
  def main(args: Array[String]): Unit = {
    val loc=new ExtentedClass(10,20,30)
    loc.move(10,20)
    loc.displayPoint()
    loc.move(10,20,30)
    loc.displayPoint()

  }

}