package com.tony.scala.base

import scala.Array.{concat, ofDim, range}

object _11ScalaArray {

  def main(args: Array[String]): Unit = {
    //    concatArray
    rangeArray
  }

  /**
    * 定义一维数组
    */
  def oneArray(): Unit = {
    val a: Array[String] = new Array[String](3);
    a(0) = "aaa";
    a(1) = "bbb";
    a(2) = "ccc";
    println(a(1))
    val a2 = Array[String]("aaa", "bbb", "ccc");
    println(a2(1))
    for (x <- a)
      println(x)
  }

  /**
    * 定义二维数组
    */
  def twoArray(): Unit = {
    var array = ofDim[Int](3, 3);
    for (i <- 0 to 2)
      for (j <- 0 to 2) {
        array(i)(j) = i + j
        println(array(i)(j))
      }
  }

  /**
    * 合并数组
    */
  def concatArray(): Unit = {
    val a1 = Array(1, 2, 3, 4, 5)
    val a2 = Array(6, 7, 8, 9, 10)
    val concatArr = concat(a1, a2)
    for (x <- concatArr)
      print(x + " ")
  }

  //创建区间数组
  //给定一个开始值，一个结束值，然后创建数组
  def rangeArray(): Unit = {
    //    [10,20) 左闭右开
    val rangeArr = range(10, 20, 2)
    for (x <- rangeArr) {
      print(x + " ")
    }
  }
}
