package chapter2

object Main extends App {
  // val - final variable
  // type inference - String
  val msg = "Hello, world!"
  // fully specified class name
  val msg2: java.lang.String = "Hello again, world!"
  // with simple name
  val msg3: String = "Hello yet again, world!"

  println(msg)
  //  msg = "another" - won't compile as reassigning val

  // var - mutable variable
  var greeting = "Hello, world!"
  greeting = "another" // all fine

  println(max(3, 5))

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // foreach
  val list = List(1, 2, 3, 4)
  list.foreach(arg => println(arg))
  list.foreach((arg: Int) => println(arg))
  list.foreach(println)

  for (arg <- list)
    println(arg)



  // function definition
  def max(x: Int, y: Int): Int = if (x > y) x else y

}
