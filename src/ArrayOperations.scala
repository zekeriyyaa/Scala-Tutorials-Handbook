object ArrayOperations {
  def main(args: Array[String]): Unit = {

    var arr = new Array[Int](4) // hold 4 int elements default: 0
    arr(2) = 6
    for (a <- arr) {
      println(a)
    }
    println("******************")
    var arr2: Array[Int] = new Array[Int](4)
    arr2(0) = 1
    arr2(1) = 3
    arr2(2) = 5

    for (a <- arr2) {
      println(a)
    }

    println("******************")

    // concatenate two array
    var arr4 = arr ++ arr2
    for (a <- arr4) {
      println(a)
    }
    println("******************")

    // concatenate two array
    var arr5 = Array.concat(arr2, arr4)
    for (a <- arr5) {
      println(a)
    }
    println("******************")


    // multi-dimension array
    var arr6 = Array.ofDim[Int](3, 4)
    for (i <- Array.range(0,arr6.length); j <- Array.range(0,arr6(1).length)) {
      println(i, j)
    }

    // or

    for(i<-Array.range(0,arr6.length)){
      for(j<-Array.range(0,arr6(1).length)){
        println(i,j)
      }
    }

  }

}
