import java.io.{FileNotFoundException, FileReader, IOException}

object ThrowException {
  def main(args: Array[String]): Unit = {

    var count=5
    try {
        if(count<6){throw new ArithmeticException("The count is less than 6")}
    }
    catch {
      case ex: ArithmeticException=>println("ArithmeticException error was occurred.")
    }
    finally {
      println("Exiting finally")
    }


  }

}
