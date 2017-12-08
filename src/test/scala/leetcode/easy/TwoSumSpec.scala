package leetcode.easy

import leetcode.UnitSpec

/**
  * Created by gilzhaiek on 2017-12-07.
  */
class TwoSumSpec extends UnitSpec {
  val obj = new TwoSum

  "TwoSumONSqr" should " return indices of the two numbers such that they add up to a specific target" in {
    obj.twoSumONSqr(Array(2, 7, 11, 15, 6, 29, 52, 32, 512), 43) should equal(Array(2, 7))
  }

  "TwoSumON" should " return indices of the two numbers such that they add up to a specific target" in {
    obj.twoSumON(Array(2, 7, 11, 15, 6, 29, 52, 32, 512), 43) should equal(Array(2, 7))
  }
}
