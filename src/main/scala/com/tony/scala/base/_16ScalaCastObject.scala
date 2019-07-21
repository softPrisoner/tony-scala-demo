package com.tony.scala.base

object _16ScalaCastObject {
  def main(args: Array[String]): Unit = {
    castClass
  }

  def castClass() = {
    val strObj = "123";
    val intObj: Int = strObj.asInstanceOf[Int];
    println(intObj)
  }
}
