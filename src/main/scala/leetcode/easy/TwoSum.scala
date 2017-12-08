package leetcode.easy

import scala.collection.mutable

/**
  * https://leetcode.com/problems/two-sum/description/
  *
  * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  * You may assume that each input would have exactly one solution, and you may not use the same element twice.
  * Given nums = [2, 7, 11, 15], target = 9,
  * Because nums[0] + nums[1] = 2 + 7 = 9,
  * return [0, 1].
  *
  * Created by gilzhaiek on 2017-12-07.
  */
class TwoSum {
  def twoSumONSqr(numbers: Array[Double], target: Double): Array[Int] = {
    for (aIndex <- numbers.indices) {
      for (bIndex <- (aIndex + 1) until numbers.length) {
        if (numbers(aIndex) + numbers(bIndex) == target)
          return Array(aIndex, bIndex)
      }
    }
    Array()
  }

  def twoSumON(numbers: Array[Double], target: Double): Array[Int] = {
    var map = mutable.HashMap.empty[Double, Int]
    for (index <- numbers.indices) {
      val number = numbers(index)
      map.get(number) match {
        case Some(firstNumber) => return Array(firstNumber, index)
        case None => map.put(target - number, index)
      }
    }
    Array()
  }
}
