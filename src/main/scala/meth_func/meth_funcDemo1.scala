package meth_func

/**
 * @Author: cmos
 * @Date: 2020/9/5 01:42
 * @ClassName Comment
 */
object meth_funcDemo1 {
  def main(args: Array[String]): Unit = {
    val dog = new Dog

    //方法转函数
    val f1 = dog.sum _
    println(f1) //<function2> 其中2代表有两个形参
    println(f1(50,40)) // 90

    //直接写一个函数
    val f2 = (n1:Int,n2:Int) => {
      n1+n2
    }
    println(f2(50,40)) //90
  }
}

class Dog{
  //方法
  def sum(n1:Int,n2:Int):Int = {
    n1 + n2
  }
}
