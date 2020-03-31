package chapter12.geometrical

class Point(val x: Int, val y: Int)

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular with Ordered[Rectangle] {
  override def compare(that: Rectangle) = ???
}
