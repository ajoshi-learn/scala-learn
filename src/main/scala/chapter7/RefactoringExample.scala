package chapter7

object RefactoringExample extends App {

  println(multiTable())

  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  def makeRow(row: Int) = makeRowSeq(row).mkString

  def multiTable() = {
    (for (row <- 1 to 10) yield makeRow(row)) mkString "\n"
  }

  // version 1.1
  //  def scalaFiles(row: Int) = for {
  //    col <- 1 to 10
  //    prod = (row * col).toString
  //    padding = " " * (4 - prod.length)
  //  } yield padding + prod
}
