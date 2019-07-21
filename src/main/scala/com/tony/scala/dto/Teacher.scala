package com.tony.scala.dto

class Teacher {
  //声明_预留字段
  var age: Int = _
  var name: String = _

  //构造函数
  def this(age: Int, name: String) {
    this()
    this.age = age
    this.name = name
  }
}
