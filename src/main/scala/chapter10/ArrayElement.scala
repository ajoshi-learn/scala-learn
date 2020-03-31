package chapter10

class ArrayElement(c: Array[String]) extends Element {
  override def contents = c

  // fields and methods belong to the same namespace which makes possible for a field to override a parameter-less method
  //  val contents = c
}

// parametric field
// class ArrayElement(val contents: Array[String]) extends Element {}
