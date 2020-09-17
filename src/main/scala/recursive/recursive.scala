package recursive

/**
 * @Author: CMOS
 * @Date: 2020/9/16 9:01 上午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/14 11:26
 * @ClassName recursive
 */
object recursive {
  def main(args: Array[String]): Unit = {
    /**
     * 题1：
     * 斐波那契数 请使用递归的方式，求出斐波那契数1,1,2,3,5,8,13...
     * 给你一个整数n，求出它的斐波那契数是多少？
     */
    println(fbn(7))

    /**
     * 题2：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，
     * 然后再多吃一个。当到第十天时，想再吃时（还没吃），发现只有1个桃子了。
     * 问题：最初共多少个桃子？
     */
    println(monkey_pea(1))
  }

  def fbn(n : Int): Int = {
    //分析
    //当 n=1,结果为1
    //当 n=2,结果为1
    //当 n>2,结果为前两个数当和
    if (n == 1 || n== 2){
      1
    }else{
      fbn(n-1) + fbn(n-2)
    }
  }


  def monkey_pea(day :Int): Int = {
    //分析
    //day =10 桃1
    //day =9 桃(1+1)*2 =4 即 monkey_pea(10)*2+1
    //day =8 桃(4+1)*2 =10 即 monkey_pea(9)*2+1

    if(day == 10){
      1
    }else{
      (monkey_pea(day + 1)+1)*2
    }
  }
}
