package com.tony.scala.base

/**
  * scala 模式匹配类似于java中switch语法
  * scala模式匹配使用关键字match实现
  * 一个模式匹配包含一系列的备选项，每个备选项通过case关键字开始，它还包含一个模式或者多个模式的表达式
  * match表达式通过以代码编写的先后顺序尝试匹配并计算，只要发现有一个匹配的，就直接结束匹配
  */
object _13ScalaModeMatch {
  def main(args: Array[String]): Unit = {
    println(scalaMatch(1))
    println(scalaMatch(2))
    println(scalaMatch(3))
    println(scalaMatch("john"))
    println(scalaMatch("peter"))
    println(scalaMatch(0.1))

  }

  def scalaMatch(x: Any): Any = {
    x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case "john" => 1000
      case word: String => "scala.String"
      case _ => "nothing match"
    }

  }
}
