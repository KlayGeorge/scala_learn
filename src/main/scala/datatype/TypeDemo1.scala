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

    var num4 =9.3
    var num5 = 9.8f
    num4 =num5
    num5 = num4.toFloat //4精度高

  }

  //scala中如果一个方法没有形参，则可以省略()
  def sayhi() = {
    println("hi")
  }
  def sayhello = {
    println("hello")
  }

  //在开发中 比如有一个方法 就会异常中断 这时就可以返回nothing  即当我们nothing做返回值 就是明确的说明该方法没有正常返回值
  def sayproblem : Nothing = {
    throw new Exception("抛出异常")
  }
}
