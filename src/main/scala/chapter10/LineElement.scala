package chapter10

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def height = 1

  override def width = s.length
}
