package chapter9

import java.io.File

object FileMatcher {
  private def filesHere = new File(".").listFiles

  private def filesMatching(matcher: String => Boolean) = {
    for (file <- filesHere; if matcher.apply(file.getName))
      yield file
  }

  def filesEnding(query: String) = filesMatching(_.endsWith(query))

  def filesContaining(query: String) = filesMatching(_.contains(query))

  def filesRegex(query: String) = filesMatching(_.matches(query))

  //  def filesEnding(query: String) =
  //    for (file <- filesHere; if file.getName.endsWith(query))
  //      yield file
  //
  //  def filesContaining(query: String) =
  //    for (file <- filesHere; if file.getName.contains(query))
  //      yield file
  //
  //  def filesRegex(query: String) =
  //    for (file <- filesHere; if file.getName.matches(query))
  //      yield file
}
