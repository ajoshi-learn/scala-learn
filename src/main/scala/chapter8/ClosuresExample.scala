package chapter8

object ClosuresExample extends App {
  var more = 10
  val addMore = (x: Int) => x + more

  echo("1", "2")
  val strings = Array("one", "two", "three")
  echo(strings: _*)

  // var args example
  def echo(args: String*): Unit = {
    for (arg <- args) println(arg)
  }

  namedFunctionExample(n = 1, m = 2)
  namedFunctionExample(n = 1)
  namedFunctionExample(1)

  def namedFunctionExample(n: Int, m: Int = 1000) = println(s"${n}/${m}")
}
