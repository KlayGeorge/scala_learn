package operator

/**
 * @Author: CMOS
 * @Date: 2020/9/9 9:14 上午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/9 09:14
 * @ClassName operatorDemo1
 */

// 运算符章节
object operatorDemo1 {
  def main(args: Array[String]): Unit = {
    var x = -3
    var num = x >> 31
    println(num)
    var num1 = x^(x >> 31)
    println(num1)
  }
}
