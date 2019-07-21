package com.tony.scala.dto

class Person {
  //数据必须有初始值
  var age = 18

  def Age = age

  def increment(): Unit = {
    this.age += 1
  }
}
