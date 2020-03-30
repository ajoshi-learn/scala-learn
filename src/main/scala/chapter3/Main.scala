package chapter3

import scala.collection.mutable
import scala.io.Source

object Main extends App {
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello" // greetStrings.update(0, "Hello")
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for (i <- 0 to 2) // for (i <- (0).to(2)) - parenthesis and dots can be skipped if method takes only one parameter
    print(greetStrings(i))

  val numNames = Array("zero", "one", "two")

  val oneTwoThree = List(1, 2, 3)

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour

  val twoThree = List(2, 3)
  val oneTwoThreeAnother = 1 :: twoThree // :: is method of its right operand

  val yetAnotherOneTwoThree = 1 :: 2 :: 3 :: Nil // val yetAnotherOneTwoThree = 1 :: 2 :: 3 :: List()
  val moreThanTwoCount = oneTwoThreeFour.count(s => s > 2)
  oneTwoThreeFour.drop(2) // returns list with its first 2 elements
  oneTwoThreeFour.dropRight(2) // returns list with its last 2 elements
  oneTwoThreeFour.contains(2)
  oneTwoThreeFour.filter(x => x > 2) // filterNot
  oneTwoThreeFour.forall(s => s % 2 == 0) // indicates whether
  oneTwoThreeFour.head
  oneTwoThreeFour.isEmpty
  oneTwoThreeFour.map(x => x * x)
  oneTwoThreeFour.mkString(", ")

  val pair = (99, "text value", 5)
  println(pair._1)
  println(pair._2)

  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear" // creates new Set
  println(jetSet)

  val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to island")
}
