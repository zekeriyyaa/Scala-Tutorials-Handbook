object PatternMatchingExtractor {
  def main(args: Array[String]): Unit = {
    val x = PatternMatchingExtractor(5)
    println(x)
    x match {
      case PatternMatchingExtractor(num)=>println("x is bigger two times than",num)
      case _ =>println("I cannot calculate")
    }
  }
  def apply(x:Int): Int =x*2
  def unapply(z:Int):Option[Int]=if (z%2==0) Some(z/2) else None


}
