package chapter10

abstract class Element {

  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element): Element = new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element = {
    val contents = new Array[String](this.contents.length)
    for (i <- this.contents.indices) {
      contents(i) = this.contents(i) + that.contents(i)
    }
    new ArrayElement(contents)
  }

  def besideAlt(that: Element): Element =
    new ArrayElement(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2)

  override def toString = contents mkString "\n"
}

object Element {
  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(line: String): Element = new LineElement(line)
}