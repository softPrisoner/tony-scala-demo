package com.tony.scala.dto

class Student {
  var age = 20
  private[this] var gender = "male" //private[this]只有该类的this可以b使用
  private var name = "bob"

  def getName = {
    name
  }

  def setName(name: String): Unit = {
    this.name = name
  }


}
