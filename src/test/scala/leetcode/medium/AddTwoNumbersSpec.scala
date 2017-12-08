package leetcode.medium

import leetcode.UnitSpec
import leetcode.helpers.ListNode

/**
  * Created by gilzhaiek on 2017-12-07.
  */
class AddTwoNumbersSpec extends UnitSpec {
  val obj = new AddTwoNumbers

  /*
  * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  * Output: 7 -> 0 -> 8
  * Explanation: 342 + 465 = 807.
   */
  "AddTwoNumbers" should " two non-empty ListNodes representing two non-negative integers, " +
    "add the two numbers and return it as a linked list" in {
    var aListNode = new ListNode(2, new ListNode(4, new ListNode(3)))
    var bListNode = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(1))))
    aListNode.toString should equal("342")
    bListNode.toString should equal("1465")
    obj.addTwoNumbersON(aListNode, bListNode).toString should equal("1807")

    aListNode = new ListNode(5)
    bListNode = new ListNode(5)
    aListNode.toString should equal("5")
    bListNode.toString should equal("5")
    obj.addTwoNumbersON(aListNode, bListNode).toString should equal("10")
  }
}
