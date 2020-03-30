package chapter6

object Main extends App {
  println(new Rational(5, 2))
  //  println(new Rational(5, 0)) IllegalArgumentException
  println(new Rational(7, 5) + new Rational(5, 2))
  val r = new Rational(3, 2)
//  var x: Rational = 2
}
