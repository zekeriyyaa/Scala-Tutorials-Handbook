import java.util.Scanner
import scala.io.StdIn

object IfElseStatement {
  def main(args: Array[String]): Unit = {

    val scanner = new Scanner(System.in)
    println("Enter the number : ")
    var a: Double = scanner.nextDouble()
    println("Your input: " + a)

    println("Enter the number : ")
    var b: Double = scala.io.StdIn.readDouble()
    println("Your input: " + b)

    println("Enter the string : ")
    var c: String = StdIn.readLine()
    println("Your input: " + c)

    if(a<10){
      println("Your number is less than 10")
    }
    else if(a==10){
      println("Your number is equal to 10")
    }
    else{
      println("your number is greater than 10")
    }

  }

}
