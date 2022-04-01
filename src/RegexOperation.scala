import scala.util.matching.Regex

object RegexOperation {
  def main(args: Array[String]): Unit = {

    var pattern="Scala".r
    var str="Scala is Scalable and cool"

    println(pattern findFirstIn str)

    pattern=new Regex("(S|s)cala")
    println((pattern findAllIn str).mkString(","))
    println((pattern replaceFirstIn(str,"Java")))
    println(pattern replaceAllIn(str,"Java"))

  }

}
