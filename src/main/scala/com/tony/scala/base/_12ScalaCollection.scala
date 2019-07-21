package com.tony.scala.base

object _12ScalaCollection {

  def main(args: Array[String]) = {
    //    scalaList
    //    concatList
    //    fillList
    //    scalaSet
    //    concatSet
    //    scalaMap
    //    concatMap
    //    scalaTuple
    //    scalaOption
    scalaIterator
  }


  def scalaIterator(): Unit = {
    var ita = Iterator(1, 2, 3, 4, 5)
    var itb = Iterator(1, 2, 3, 4, 5)
    println("size:" + ita.size + "\n" + "length:" + itb.length)
    var itc = Iterator(1, 2, 3, 4, 5)
    var itd = Iterator(1, 2, 3, 4, 5)
    println("iterator max value:" + itc.max + "\n" + "iterator min value:" + itd.min)
    var ite = Iterator(1, 2, 3, 4, 5)
    while (ite.hasNext)
      print(ite.next)
  }

  def scalaOption(): Unit = {
    val map: Map[String, Int] = Map("k1" -> 1)
    val value1: Option[Int] = map.get("k1")
    val value2: Option[Int] = map.get("k2")
    println(value1 + " " + value2)
  }

  def scalaTuple(): Unit = {
    val tup = (1, "2", "3", "a", "b", 2.0)
    println(tup)
    //num 表示值的数量的限定
    //Tuple Tuple2
    val tup1 = Tuple2(1, 2)
    //从这里可以看出来元组最多22个元素
    val tup2 = Tuple22(
      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
      13, 14, 15, 16, 17, 18, 19, 20, 21, 22
    )
    println(tup2._22)
    //迭代输出元组
    tup2.productIterator.foreach(x => print(x + " "))
    println
    println(tup1.toString)
    //交换元组元素
    println(tup1.swap)
  }

  def concatMap(): Unit = {
    val map: Map[String, Int] = Map("key1" -> 1, "key2" -> 2)
    val map1: Map[String, Int] = Map("key3" -> 3, "key4" -> 4)
    val concatMap: Map[String, Int] = map1.++:(map)
    val concatMap1 = map ++ map1
    concatMap.keys.foreach(key =>
      print(key + ":" + concatMap(key) + " ")
    )
    println
    concatMap1.keys.foreach(key =>
      print(key + ":" + concatMap1(key) + " ")
    )
  }

  /** iterable
    * key value
    */
  def scalaMap(): Unit = {
    var map: Map[String, Int] = Map()
    map += ("key1" -> 1)
    println(map.size)
    map -= ("key1")
    println(map.size)
    map += ("key1" -> 1)
    map += ("key2" -> 2)
    map += ("key3" -> 3)
    map += ("key4" -> 4)
    println("返回map中所有的key:" + "\n" + map.keys)
    println("返回map中所有的values" + "\n" + map.values)
    println("map is empty?----" + map.isEmpty)
  }

  def concatSet(): Unit = {
    val set = Set[Int](1, 2, 3, 4)
    //拼接set
    println(set ++ set)
    println(set.++(set))
    //求最大值，最小值
    println("max value:" + set.max + "\n" + "min value:" + set.min)
    //求两个Set的交集
    println(set.&(set))
    println(set.intersect(set))
  }

  def scalaSet(): Unit = {
    val set = Set[Int](1, 2, 3, 4)
    println(set.getClass.getName)
    println(set)
    //函数内声明导包,只对下面的Set起限定作用
    import scala.collection.mutable.Set
    val set1 = Set(1, 2, 3, 4)
    println(set1.getClass.getName)
    println(set1)
    println(set.head)
    println(set.tail)
    println(set.isEmpty)
  }

  def scalaList(): Unit = {
    val strList: List[String] = List("a", "b", "c")
    val numList: List[Int] = List(1, 3, 5, 7, 9)
    val emptyList: List[Nothing] = List()
    val dimList: List[List[Int]] =
      List(
        List(1, 3, 5),
        List(7, 9),
        List(2, 4, 6),
        List(8, 10)
      )
    println("获取列表第一个元素:" + strList.head)
    println("获取其他元素:" + strList.tail)
    println("判断list是否为空:" + strList.isEmpty)
    println(strList)
    println(numList)
    println(emptyList)
    println(dimList)
  }

  /**
    * 拼接List
    */
  def concatList(): Unit = {
    val list: List[String] = List("a", "b", "c");
    val list1: List[String] = List("d", "e", "f")
    //后者元素拼接到前者元素之后
    val concatList = list ::: list1
    //前者元素拼接到后者元素之后
    val concatList1 = list1.:::(list)
    //后者元素拼接到前者元素之后
    val concatList2 = List.concat(list, list1)
    println(concatList)
    println(concatList1)
    println(concatList2)
  }

  /**
    * 用于创建指定重复元素
    */
  def fillList(): Unit = {
    val site = List.fill(3)("site1")
    println(site)
    //通过指定函数，创建list列表
    val list = List.tabulate(6)(n => n * n)
    println(list)
    println(list.reverse)
  }


}
