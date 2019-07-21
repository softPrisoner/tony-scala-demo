package com.tony.scala.base

object _10ColiFunction {
  def main(args: Array[String]): Unit = {
    println(add(1, 2))
    println(FuncString("i'm")("_and you?"))
  }

  def add(a: Int = 1, b: Int): Int = a + b

  def add2(a: Int, b: Int): Int = a + b;

  def add3(a: Long, b: Long): Long = a + b

  def add4(a: Double, b: Double): Double = a + b

  def FuncString(s1: String)(s2: String): String = s1 + s2
}
