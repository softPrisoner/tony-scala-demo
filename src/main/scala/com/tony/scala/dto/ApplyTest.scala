package com.tony.scala.dto

//设置类为私有
class ApplyTest private {
  def sayHello(): Unit = {
    println("Hello bob")
  }
}

//伴生对象
object ApplyTest {
  //scala没有静态的修饰符，但object下的成员都是静态的
  var instance: ApplyTest = null

  def apply() = {
    if (null == instance)
      instance = new ApplyTest
    instance
  }
}



