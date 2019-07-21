package com.tony.scala.base

object _7NestedFunction {
  def main(args: Array[String]): Unit = {
    println(addData(1))
  }

  //这个类似于内部定义函数并调用
  def addData(i: Int): Int = {
    println(addData1(i))

    //可以有默认值
    def addData1(i: Int, j: Int = 7): Int = {
      //内部嵌套函数声明
      val sum: Int = i + j
      sum
    }
    //可以看出来函数是
    //    addData1(i)
    6
  }
}
