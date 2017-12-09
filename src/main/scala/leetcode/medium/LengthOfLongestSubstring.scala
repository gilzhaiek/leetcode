package leetcode.medium

/**
  * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
  *
  * Given a string, find the length of the longest substring without repeating characters.
  *
  * abbc b bca cab abc bc b b
  * ab bc b bca cab abc bc b b
  * Given "abbcabcbb", the answer is "bca", which the length is 3.
  * Given "bbbbb", the answer is "b", with the length of 1.
  * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
  *
  * Created by gilzhaiek on 2017-12-07.
  */
class LengthOfLongestSubstring {
  def lengthOfLongestSubstringONSqr(s: String, offset: Int): Int = {
    val nextOffset = offset + 1
    if (nextOffset >= s.length()) {
      return s.length
    }
    val chr: Char = s.charAt(offset)
    val nextRecurring = s.indexOf(chr, nextOffset)
    if (nextRecurring >= 0) {
      lengthOfLongestSubstringONSqr(s.substring(0, nextRecurring), nextOffset)
    } else {
      lengthOfLongestSubstringONSqr(s, nextOffset)
    }
  }

  def lengthOfLongestSubstringONSqr(s: String): Int = {
    if (s.length == 0) {
      return 0
    }
    s.indices.map(index => lengthOfLongestSubstringONSqr(s.substring(index), 0)).max
  }

  def lengthOfLongestSubstringON(s: String): Int = {
    val toIndex: Int = s.length
    val set = scala.collection.mutable.HashSet.empty[Char]
    var ans, i, j: Int = 0

    while (i < toIndex && j < toIndex) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j))
        j += 1
        ans = Math.max(ans, j - i)
      }
      else {
        set.remove(s.charAt(i))
        i += 1
      }
    }
    ans
  }
}
