package leetcode.medium

import leetcode.helpers.ListNode

/**
  * https://leetcode.com/problems/add-two-numbers/description/
  *
  * You are given two non-empty linked lists representing two non-negative integers.
  * The digits are stored in reverse order and each of their nodes contain a single digit.
  * Add the two numbers and return it as a linked list.
  * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
  *
  * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  * Output: 7 -> 0 -> 8
  * Explanation: 342 + 465 = 807.
  *
  * Created by gilzhaiek on 2017-12-07.
  */
class AddTwoNumbers {
  def addTwoNumbersON(l1: ListNode, l2: ListNode): ListNode = {
    var l1CNode: ListNode = l1
    var l2CNode: ListNode = l2
    val l3 = new ListNode()
    var firstNode = true
    var currentNode = l3
    var x = 0
    while (true) {
      (l1CNode, l2CNode) match {
        case (null, null) => if (x == 0) return l3
        case (l1CNode: Any, null) => x += l1CNode.x
        case (null, l2CNode: Any) => x += l2CNode.x
        case (l1CNode: Any, l2: Any) => x += l1CNode.x + l2CNode.x
      }
      if (!firstNode) {
        currentNode.next = new ListNode(x % 10)
        currentNode = currentNode.next
      } else {
        currentNode.x = x % 10
        firstNode = false
      }
      x = x / 10

      if (l1CNode != null) {
        l1CNode = l1CNode.next
      }
      if (l2CNode != null) {
        l2CNode = l2CNode.next
      }
    }
    l3
  }
}
