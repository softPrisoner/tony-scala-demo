package com.tony.scala.advance

object CollectionConnection {

  /**
    * ++
    * 该方法用于连接两个集合list1++list2
    */
  def TestDoublePlus(): List[Any] = {
    val l1 = List(1, 2, 3)
    val l2 = List(4, 5, 6)
    val l3 = List("4", "5", "6")
    val l4 = 4
    l1 ++ l2
  }

  /**
    * +:
    * +:方法用于在头部追加元素
    */
  def TestPlusColon(): List[Any] = {
    val l1 = List(1, 2, 3)
    val l2 = List(4, 5, 6)
    l1 +: l2
  }

  /**
    * :+方法用于在尾部追加元素
    */
  def TestColonPlus(): List[Any] = {
    val l1 = List(1, 2, 3)
    val l2 = List(4, 5, 6)
    val l3 = List("4", "5", "6")
    l1 :+ l2
  }

  /**
    * ::和+:类似
    * 但是::可以用于pattern match ，而+:则不行
    *
    */
  def TestDoubleColon(): List[Any] = {
    val l1 = List(1, 2, 3)
    val l2 = List(4, 5, 6)
    val l3 = List("4", "5", "6")
    l1 :: l2
  }

  /**
    * :::
    * 该方法只能用于连接两个List类型的集合
    */
  def TestTriColon(): List[Any] = {
    val l1 = List(1, 2, 3)
    val l2 = List("4", "5", "6")
    l1 :: l2
  }

  def main(args: Array[String]): Unit = {
    val l = TestDoublePlus()
    val l1 = TestPlusColon()
    val l2 = TestColonPlus()
    val l3 = TestDoubleColon()
    val l4 = TestTriColon()
    println(l4)
  }
}
