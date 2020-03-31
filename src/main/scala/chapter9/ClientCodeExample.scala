package chapter9

class ClientCodeExample {
  def containsNeg(nums: List[Int]): Boolean = nums.exists(_ < 0)

  def containsOdd(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)

  def curriedSum(x: Int)(y: Int) = x + y

  val onePlus = curriedSum(1) _

  val three = onePlus(2)
}
