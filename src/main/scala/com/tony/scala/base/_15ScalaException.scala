package com.tony.scala.base

import java.io.{FileNotFoundException, FileReader, IOException}

object _15ScalaException {

  def main(args: Array[String]): Unit = {
    try {
      val reader: FileReader = new FileReader("mysql.ini")
    } catch {
      case ex: FileNotFoundException => println("file is not exist ")
      case ex: IOException => println("io exception occur")
    } finally {
      println("program is finished")

    }
  }
}
