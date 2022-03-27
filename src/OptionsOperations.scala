/*
*  Scala Option[T] is a container for zero or one element of a given type.
*  It can be either Some[T] or None object, which represent the missing value.
* */
object OptionsOperations {
  def main(args: Array[String]): Unit = {

    var capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    // both are return with type of Option
    println(capitals.get("France")) // returns Some(Paris)
    println(capitals.get("Turkey")) // returns None

    println(show(capitals.get("France")))
    println(show(capitals.get("Turkey")))

    // getOrElse
    // access a value or a default when no value is present
    var z: Option[Int] = Some(5)
    var y: Option[Int] = None

    println(z, y)

    // if object has a value, it returns it. Otherwise, it returns the given value.
    println(z.getOrElse(0))
    println(z.getOrElse(10))
    // Through there is no any initial value, it returns given value
    println(y.getOrElse(0))
    println(y.getOrElse(10))
    // check is empty or not
    println(z.isEmpty)
    println(y.isEmpty)

  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }


}
