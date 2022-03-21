object IfElseExpression {
  def main(args: Array[String]): Unit = {
    var x=3
    var y=10
    var a:Double=if (x>y) 5 else 10
    println("The value of a is "+a)

    var b:Double=10*(if (x<y) 3 else 9)
    println("The value of b is "+b)

    var message=if(y<5)"smaller" else "bigger"
    println(message)
  }

}
