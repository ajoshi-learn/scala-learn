package chapter5

object Main extends App {
  val name = "reader"
  println(s"Hello $name")
  println(s"6 * 7 =  ${6 * 7}")
  println(raw"No \\\\ escape")
  println("With \\\\ escape")
  println(f"${math.Pi}%.5f")

  val s = "Hello, world!"
  var oIndex = s indexOf 'o'
  println(oIndex)
  oIndex = s indexOf('o', 5)
  println(oIndex)

  2.0.unary_- // -2.0

  println(name toUpperCase)

  println(one || two)

  def one() = true

  def two() = false

  println(0 max 5)
  println(-2.7 abs)
  println(1.5 isInfinity)
  println(1.0 / 0 isInfinity)
  println(4 to 6)
  println("bob" capitalize)
  println("robert" drop 2 capitalize)
}
