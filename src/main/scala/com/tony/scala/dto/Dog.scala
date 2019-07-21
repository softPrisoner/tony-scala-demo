package com.tony.scala.dto

object Dog {
  private var age = 0

  //  定义年龄属性，返回值
  def Age: Int = {
    age += 1
    age
  }

  class Dog {
    var age = Dog.age
  }

}
