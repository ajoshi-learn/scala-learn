package chapter4

import chapter4.ChecksumAccumulator.calculate

object Summer extends App {
  for (season <- List("Fall", "Winter", "Spring"))
    println(season + ": " + calculate(season))
}
