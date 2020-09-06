package datatype

/**
 * @Author: CMOS
 * @Date: 2020/9/6 12:00 上午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/6 00:00
 * @ClassName TypeDemo1
 */
object TypeDemo1 {
  def main(args: Array[String]): Unit = {
    var num1 : Int = 10
    //因为Int是一个类 所以它的实例可以使用很多方法
    println(num1.toDouble + num1.toString)
  }

  //scala中如果一个方法没有形参，则可以省略()
  def sayhi() = {
    println("hi")
  }
  def sayhello = {
    println("hello")
  }
}
