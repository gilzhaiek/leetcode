package leetcode.helpers

/**
  * Created by gilzhaiek on 2017-12-07.
  */
class ListNode(var x: Int = 0, var next: ListNode = null) {
  override def toString: String = {
    if (next != null) {
      return next.toString + x.toString
    }
    x.toString
  }
}
