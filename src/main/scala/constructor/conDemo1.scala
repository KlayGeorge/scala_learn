package constructor

/**
 * @Author: CMOS
 * @Date: 2020/9/18 3:10 下午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/18 15:10
 * @ClassName conDemo1
 */
object conDemo1 {
  def main(args: Array[String]): Unit = {

    val p1 = new Person("jack", 20)
    println(p1)

    val a = new A
    val a2 = new A()

  }
}


//构造器的快速入门
//创建Person对象的同时初始化对象的age属性值和name属性值
class Person(inName: String, inAge: Int) { //形参名不与属性名重复
  var name: String = inName
  var age: Int = inAge
  age += 10
  println("~~~~~~~~~~")

  //  重写了toString，便于输出对象的信息 ，若不重写，会打出constructor.Person@7c75222b
  override def toString: String = {
    "name=" + this.name + "\t age" + this.age
  }

  println("ok~~~~~")
  println("age=" + age)

  def this(name: String) {
    //辅助构 造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)
    this("jack", 10)
    //this
    this.name = name //重新赋值
  }
}
//如果主构造器无参数，小括号可省略，构建对象时调用的构造方法的小括号也可以省略
class A() {

}
