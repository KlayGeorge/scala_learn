package test

/**
 * @Author: CMOS
 * @Date: 2020/9/18 5:17 下午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/18 17:17
 * @ClassName testDemo1
 */
object testDemo1 {
  def main(args: Array[String]): Unit = {
  val a = new Person("ui",23)
    println(a)
  }
}
class Person() {

  var name = ""
  var age = 0

  def this(name: String) {
    //这里调用的是主构造器
    this()
    this.name = name
  }

  def this(name: String,age:Int) {
    //这里调用的是前一个辅助构造器
    this(name)
    this.age = age
  }
}
