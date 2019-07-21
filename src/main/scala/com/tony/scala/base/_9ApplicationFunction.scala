package com.tony.scala.base

object _9ApplicationFunction {
  def main(args: Array[String]): Unit = {

    println("i'm", "1")
    println("i'm", "2")
    println("i'm", "3")
    //通过val重构函数，使函数翻新
    val logWidth = log("i'm", _: String)
    logWidth("m1")
    logWidth("m2")
    logWidth("m3")
  }

  def log(info: String, message: String) = {
    println(info + "___" + message)
  }
}
