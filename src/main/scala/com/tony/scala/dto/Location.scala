package com.tony.scala.dto

//Location继承Point类
class Location(val xc: Int, val yc: Int, val zc: Int)
  extends Point(xc, yc) {
  var z: Int = zc

  //可以看到这里重写了Point类的方法  override与java有很大区分
  override def move(dx: Int, dy: Int): Unit = {
    println("i'm the override method ")
    println("dx:" + dx + " dy:" + dy)
  }

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x += dx
    y += dy
    z += dz
    println("x 的坐标点 : " + x)
    println("y 的坐标点 : " + y)
    println("z 的坐标点 : " + z)
  }
}