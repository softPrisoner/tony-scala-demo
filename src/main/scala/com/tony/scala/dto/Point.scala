package com.tony.scala.dto

//这里与java有较大区别,成员变量定义在类名行,作为类参数
class Point(xc: Int, yc: Int) {
  //类中的成员变量必须被初始化
  var x: Int = xc
  var y: Int = xc
  var t = 1

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
    println("x 的坐标点 : " + x)
    println("y 的坐标点 : " + y)
  }
}

