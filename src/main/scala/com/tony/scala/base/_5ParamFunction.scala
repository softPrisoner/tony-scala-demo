package com.tony.scala.base

object _5ParamFunction {
  def main(args: Array[String]): Unit = {
    //在函数中指定参数a=10,b=20
    addInt(a = 10, b = 20)
    printStrings(a = 2, b = "a", "b", "c")
    defaultArgsFunction()
  }

  def addInt(a: Int, b: Int): Unit = {
    println(a + " " + b)
  }

  /**
    * 使用默认参数构造函数
    */
  def defaultArgsFunction(a: Int = 1, b: Int = 2): Unit = {
    println(a + b)
  }

  def printStrings(a: Int, b: String*): Unit = {
    //可以看出来这里遍历数组的方式还挺独特
    for (bt <- b)
      println(bt)
    println(a + " " + b)
  }
}
