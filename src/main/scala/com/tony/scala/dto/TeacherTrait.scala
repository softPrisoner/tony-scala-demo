package com.tony.scala.dto

trait TeacherTrait {
  def teacherInfo: Unit

  def teacherRepeat(name: String): String = {
    "the teacher:" + name + " say please quiet to her student for repeat"
  }
}

class StudentTrait extends TeacherTrait {
  //子类继承特征必须实现特征中没有实现的方法
  override def teacherInfo: Unit = {
    println("the teacher'name is glass")
  }
}

object showTrait {
  def main(args: Array[String]): Unit = {
    val stu = new StudentTrait
    stu.teacherInfo
    println(stu.teacherRepeat("white"))


  }
}