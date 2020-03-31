package chapter9

import java.io.{File, PrintWriter}

class ControlStructuresExample {

  //  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
  //    val writer = new PrintWriter(file)
  //    try {
  //      op(writer)
  //    } finally {
  //      writer.close()
  //    }
  //  }

  //  withPrintWriter(
  //    new File("date.txt"),
  //    writer => writer.println(new java.util.Date)
  //  )

  def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  withPrintWriter(new File("date.txt")) {
    writer => writer.println(new java.util.Date)
  }
}
