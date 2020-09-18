package meth_func

/**
 * @Author: CMOS
 * @Date: 2020/9/17 7:39 下午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/17 19:39
 * @ClassName homework
 */
object homework {
  def main(args: Array[String]): Unit = {


    //    1、一个数字如果为正数，则它的signum为1;如果是负数,则signum为-1;如果为0,则signum为0.编写一个函数来计算这个值
    def signum(n: Int) = {
      if (n == 0) {
        0
      } else if (n > 0) {
        1
      } else {
        -1
      }
    }

    println(signum(-2))

    //    2、一个空的块表达式{}的值是什么？类型是什么？
    var t = {}
    println(t.isInstanceOf[Unit] + " " + t) //true ()

    //    3、针对下列Java循环编写一个Scala版本:
    //    for(int i=10;i>=0;i–)System.out.println(i);
    for (i <- 0 to 10 reverse) {
      println(i)
    }
    //或者
    (0 to 10).reverse.foreach(println)

    //    5、编写一个for循环,计算字符串中所有字母的Unicode代码（toLong方法）的乘积。举例来说，"Hello"中所有字符串的乘积为9415087488L
    var res: Long = 1
    for (i <- "Hello") {
      res *= i.toLong
    }
    println("res=" + res)

    //    6、同样是解决前一个练习的问题，请用StringOps的foreach方式解决。
    var res1: Long = 1
    "Hello".foreach(res1 *= _.toLong)
    println("res1=" + res1)

    //    7、编写一个函数product(s:String)，计算字符串中所有字母的Unicode代码（toLong方法）的乘积
    var a: Long = 1

    def product1(s: String): Long = {
      s.foreach(a *= _.toLong)
      a
    }

    //或者
    def product2(s: String): Long = {
      for (i <- s) {
        a *= i.toLong
      }
      a
    }

    //    8、把7练习中的函数改成递归函数
    //用到的函数解释
    val str = "Hello"
    val substr1 = str.take(1)
    println(substr1) // "H" String类型
    var subStr2 = str.drop(1)
    println(subStr2) // "ello" drop(1)去掉第一个字符 取后面所有

    def product3(s: String): Long = {
      //如果字符串长度为1，就直接返回 s.charAt(0).toLong
      if (s.length == 1) return s.charAt(0).toLong
      //s.drop(1)返回s字符串除去第一个字符的 后面所有字符(String类型)  使第一个与后面所有的分别想乘
      else s.take(1).charAt(0).toLong * product3(s.drop(1))
    }

    //      9、编写函数计算,其中n是整数，使用如下的递归定义:
    def mi(x: Double, n: Int): Double = {
      if (n == 0) 1
      else if (n > 0) x * mi(x, n - 1)
      else 1 / mi(x, -n)
    }


  }

}

