package vars

/**
 * @Author: CMOS
 * @Date: 2020/9/5 11:19 下午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/5 23:19
 * @ClassName varsDemo1
 */
object varsDemo1 {
  def main(args: Array[String]): Unit = {
    var age : Int = 10
    var name : String = "Tom"
    var mom = "Sala"
    var isPass : Boolean = true
    var sal : Double = 10.9
    var score : Float = 70.9f
    println(s"姓名：$name,年龄：$age,工资：$score")
    //类型判断
    println(age.isInstanceOf[Int])
  }

  //val var配合 可限制对象不可变 对象属性可变
  val dog = new Dog
  dog.age =90
  class Dog{
    var age = 10
    var name = ""
  }
}
