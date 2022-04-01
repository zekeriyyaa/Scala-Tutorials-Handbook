import java.io.{FileNotFoundException, FileReader, IOException}

class IOOperation {
  def main(args: Array[String]): Unit = {

    try {
      val f = new FileReader("input.txt")
      println("Noe exception has taken place ...")
    }
    catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
    finally {
      println("Exiting finally")
    }


  }

}
