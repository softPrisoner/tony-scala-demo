package com.tony.scala.kafka

import java.util.concurrent.Executors

object KafkaPartition {
  //第index线程（进程）
  def createConsumerThread(index: Int): Unit = {

    val threadPool = Executors.newCachedThreadPool();
    threadPool.submit(new Thread(() => {
      //创建到kafka broker的连接:
      kafkaClient("127.0.0.1", 9992)
      //指定消费参数构造consumer
      simpleConsumer("pay-topic", "p1")
      //设置消费者的offset
      //consumer.seek(offset, 0)
      while (true) {
        //消费指定topic第index个分区的数据
        //记录当前消息offset
        //提交当前offset(可选)
      }
    }
    ))
  }

  def simpleConsumer(topic: String, partition: String): Unit = {

  }

  def kafkaClient(host: String, port: Int): Unit = {

  }

  def main(args: Array[String]): Unit = {
    //获取分区的size
    val size = 5
    for (index <- 0 to size)
      createConsumerThread(index)

  }

}
