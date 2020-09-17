package meth_func

import scala.io.StdIn

/**
 * @Author: CMOS
 * @Date: 2020/9/17 11:17 上午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/17 11:17
 * @ClassName Exercise01
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入数字1-9")
    val num = StdIn.readInt()
    print99(num)
    printPyramid(num)

    // 编写函数 打印99乘法表
    def print99(n: Int) = {
      for (i <- 1 to n) {
        for (j <- 1 to i) {
          printf("%d * %d = %d\t", j, i, j * i)
        }
        println() //灵魂换行 不可少
      }
    }

    // 编写函数 打印金字塔
    def printPyramid(t:Int) = {
      for (i <- 1 to t) {
        for (j <- 1 to (t-i)) {
          print(" ") //遍历打印空格
        }
        for (j <- 1 to i) {
          print("* ") //遍历打印* 灵魂*后空格 否则会打成直角三角形
        }
        println()//换行
      }
    }
  }
}






