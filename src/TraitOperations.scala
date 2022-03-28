/*
* A trait encapsulates method and field definitions, which can then be reused by mixing them into class.
* Unlike class inheritance, a class can mix in any number of traits
* Traits are used to define object types by specifying the signature of the supported methods.
* Scala also allows traits to be partially implemented but traits may not have constructor parameters.
*
* Child class extending a trait can give implementation for un-implemented methods. "
* It is very similar to abstract classes"
*
* * */
trait Equal {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point2(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  /*
  * obj.isInstanceOf [Point2] : to check Type of obj and Point2 are same or not
  * obj.asInstanceOf [Point2] : means exact casting by taking the object type and returns the same obj as Point2 type
  * */

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point2] && obj.asInstanceOf[Point2].x == x

  def issEqual(obj: Any): Boolean = {
    obj.isInstanceOf[Point2] && obj.asInstanceOf[Point2].x == x
  }

}

object TraitOperations {
  def main(args: Array[String]): Unit = {
    var p1 = new Point2(2, 3)
    var p2 = new Point2(2, 4)
    var p3 = new Point2(3, 4)

    println(p1.isEqual(p2))
    println(p1.isEqual(p3))
    println(p1.isNotEqual(p3))
  }

}
