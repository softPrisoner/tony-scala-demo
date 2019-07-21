package com.tony.scala.base

object _4ParamFunction {
  def main(args: Array[String]): Unit = {
    println(delayed(getTime()))
  }

  //将函数作为参数，传递下去
  def getTime(): Long = {
    println("获取纳秒时间！")
    System.nanoTime()
  }

  //接受传递的函数参数，将函数返回
  def delayed(t: => Long) = {
    println("在delayed方法里面")
    println("参数为" + t)
    t
  }
}
