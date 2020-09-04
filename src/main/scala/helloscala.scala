object helloscala {
  def main(args: Array[String]): Unit = {
    print("hi,scala~")
//scala语言输出的三种方式
    var num1 : Int = 1
    var num2 : Int =2
    print(num1+num2)
    var name:String = "tom"
    var age: Int = 10
    var sal:Float = 10.67f
    var height:Double =120.15

    // printf 格式化输出
    // %d 十进制数字
    // %s 字符串
    // %c 字符
    // %e 指数浮点数
    // %f 浮点数
    printf("名字%s 年龄%d 薪水%f 身高%f",name,age,sal,height)
    printf("名字%s 年龄%d 薪水%.2f 身高%.3f",name,age,sal,height)
    println(s"名字$name 年龄$age 薪水$sal")
    println(s"名字$name \t年龄${age+10} \t薪水${sal*9}")




  }

}
