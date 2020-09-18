package constructor

/**
 * @Author: CMOS
 * @Date: 2020/9/18 6:33 下午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/18 18:33
 * @ClassName conDemo2
 */
object conDemo2 {
  val worker = new Worker("smith")
  worker.name //不能访问 inName

  val worker2 = new Worker2("smith2")
  worker2.name
  worker2.inName //可以访问 inName 但是只读
  println("hello!")

  val worker3 = new Worker3("jack")
  worker3.inName = "mary"
  println(worker3.inName)
}


//1. 如果 主构造器是Worker(inName: String)，那么 inName就是一个局部变量 【使用范围仅限于主构造器内】
class Worker(inName: String) {
  var name = inName
}

//2. 如果 主构造器是Worker2(val inName: String) ，那么  inName就是Worker2的一个private的只读属性
class Worker2(val inName: String) {
  var name = inName
}

//3. 如果 主构造器是Worker3(var inName: String) ，那么  inName就是Worker3的一个
// 一个private 的可以读写属性
class Worker3(var inName: String) {
  var name = inName
}