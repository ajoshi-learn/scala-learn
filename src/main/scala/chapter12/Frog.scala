package chapter12

class Animal

trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"

  override def philosophize(): Unit = println(this.toString)
}
