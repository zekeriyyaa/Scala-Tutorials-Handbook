/*
*  Set : has no duplicate elements
*  It could be mutable or immutable(default)
*  If  you want to use mutable Set, you have to import scala.collection.mutable.Set
*
* Head : returns the first element of List
* Tail : returns a list consisting of all elements except the first
* IsEmpty : return true if the list is empty otherwise false
* */
object SetOperations {
  def main(args: Array[String]): Unit = {

    var s: Set[Int] = Set()
    var s2: Set[Int] = Set(1, 2, 3, 4, 5)

    var s3 = Set(1, 2, 3, 8, 9)

    println("s2 : " + s2)
    println("head : " + s2.head)
    println("tail : " + s2.tail)
    var s4 = s2 ++ s3

    println("concatanated : " + s4)
    println(s4.min)
    println(s4.max)

    // both are means the same : intersect
    println(s3.intersect(s4))
    println(s3.&(s4))
  }

}
