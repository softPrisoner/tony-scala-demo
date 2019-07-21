package com.tony.scala.base

object _8AnonymousFunction {
  def main(args: Array[String]): Unit = {
    fc(2)
  }

  //匿名函数声明调用
  var fc = (x: Int) => println(x)
}
