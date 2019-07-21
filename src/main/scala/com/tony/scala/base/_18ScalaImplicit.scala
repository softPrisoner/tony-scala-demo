package com.tony.scala.base

object _18ScalaImplicit {
  //调用时无法省略参数
  def add(implicit a: Int, b: Int): Int = {
    a + b
  }
  //一定要作为最后一个参数
  def plus(a: Int)(implicit b: Int): Int = {
    a + b
  }
  //声明隐式参数，不需要名称相同，只要类型相同就可以
  implicit val c: Int = 10;
  //assertResult(plus(5))(15)
  def main(args: Array[String]): Unit = {

  }
}
