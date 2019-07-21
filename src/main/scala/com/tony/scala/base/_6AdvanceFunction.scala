package com.tony.scala.base

object _6AdvanceFunction {
  def main(args: Array[String]): Unit = {
    println(apply(layout, 20))

  }

  def apply(f: Int => String, v: Int): String = {
    return f(v)
  }

  //高阶函数，相当于函数中嵌套函数,lambda表达式的风格
  def layout[A](x: A) = "[" + x.toString() + "]";
}
