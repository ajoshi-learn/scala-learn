package chapter8

object FirstClassFunctions extends App {
  var increase = (x: Int) => x + 1
  println(increase(10))

  val list = List(1, 2, 3, 4, 5, 6, 7)
  list.filter(_ > 5).foreach(println)

  val f = (_: Int) + (_: Int)
  println(f(10, 20))

  println(sum(1, 2, 3))
  val a = sum _
  val b = sum(1, _: Int, 23)
  println(a(1, 2, 3))
  println(b(6))

  list.foreach(println)

  def sum(a: Int, b: Int, c: Int): Int = a + b + c
}
