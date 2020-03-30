package chapter7

import java.io.{File, FileNotFoundException, FileReader, IOException}

import scala.io.Source

object Main extends App {
  val filesHere = new File(".").listFiles
  for (file <- filesHere if file.isFile if file.getName.endsWith(".scala"))
    println(file)

  for (i <- 0 to 4)
    println(i)
  for (i <- 0 until 4)
    println(i)

  def grep(pattern: String) = {
    for (file <- filesHere
         if file.getName.endsWith(".scala");
         line <- fileLines(file)
         if line.matches(pattern)
    ) println(file + ": " + line.trim)
  }

  def grepAnother(pattern: String) = {
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed matches pattern
    } println(file + ": " + trimmed)
  }

  grep(".*gcd*.")

  try {
    val f = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException =>
    case ex: IOException =>
  } finally {
    print("finally")
  }

  val firstArg = if (args.length > 0) args(0) else ""
  firstArg match {
    case "one" => println("one-response")
    case _ => println("unknown")
  }

  def fileLines(file: File) = Source.fromFile(file).getLines().toList

  def scalaFiles: Array[File] = for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file
}
