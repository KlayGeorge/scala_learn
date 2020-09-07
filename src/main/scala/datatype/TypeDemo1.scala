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

    printValues
    charDemo

//    var a =10 max 2
    var a = 10.max(2)
    println(a) // 10  该方法比较10与2的大小
    println(unitDemo)

    var de = "crazy"
    println(de*3) //crazycrazycrazy

    var a4:String = "Hello";
    //方法1
    var first = a4.take(1) //H
    var first1 =a4(0) //H
    var end = a4.reverse.take(1) //o
    var end2 =a4.takeRight(1) //0
    var b:Char = a4.charAt(0)// H
    var c:Char = a4.charAt(4)//o
    var r = "12.5"
    var e = r.toInt
    println(e)



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

  //想看最大最小值的范围
  def printValues = {
    var a = Int.MaxValue
    var b = Int.MinValue
    print(a,b)
  }

  //字符类型举例
  def charDemo = {
    var x : Char = 97
    var d : Char = '\u0061'
    println(x)  // a
    println(d) // a

    // 字符类型也可以做数字运算
    var a1 :Char = 'a'
    var num = 10 + a1
    println(num) // 107 = 10+97
  }

  //Unit类型只有一个实例：()
  def unitDemo :Unit = {
  }
}
