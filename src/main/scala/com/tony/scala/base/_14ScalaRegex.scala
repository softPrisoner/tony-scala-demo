package com.tony.scala.base

import scala.util.matching.Regex

object _14ScalaRegex {
  def main(args: Array[String]): Unit = {
    val pattern1 = new Regex("^(scala|peter)\\w{2,4}\\d{0,2}")
    val pattern2 = new Regex("(156|139)\\d{8}?")
    val str = "peterPet111"
    val phone = "15611111111111391111111111"
    println(pattern1 findFirstIn str)
    println(pattern2 findFirstIn phone)
    val allMatch = pattern2 findAllIn phone
    while (allMatch.hasNext)
      println(allMatch.next)

  }
}
