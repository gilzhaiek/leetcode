package leetcode.medium

import leetcode.UnitSpec

/**
  * Created by gilzhaiek on 2017-12-07.
  */
class LengthOfLongestSubstringSpec extends UnitSpec {
  val obj = new LengthOfLongestSubstring

  /*
  * Input: pwwkew
  * Output: 3
  * Explanation: wke has length of 3
   */
  "LengthOfLongestSubstring" should " find the length of the longest substring without repeating characters" in {
    var str:String = "pwwkew"
    obj.lengthOfLongestSubstring(str) should equal(3)
  }
}
