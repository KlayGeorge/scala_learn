package oop

/**
 * @Author: CMOS
 * @Date: 2020/9/17 3:29 下午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/17 15:29
 * @ClassName class_object_Demo01
 */
object class_object_Demo01 {
  def main(args: Array[String]): Unit = {
    //创建一只猫
    val cat = new Cat
    //属性赋值
    //cat.name="小白" 不是直接访问属性，而是调用了方法：cat.name_$eq("小白")
    //cat.name  是调用了方法：cat.name()
    cat.name = "小白"
    cat.age = 10
    cat.color = "yellow"
  }
}

//定义一个猫类
class Cat{
  //说明：当我们声明var name:String时，在底层对应生成私有变量private name，
  // 同时会生成两个public方法  name()和name_$eq()，类似于Java中的getter和setter
  var name:String = "" //Scala中变量一定要给初始值
  var age:Int = _ // _表示给默认值，Int类型默认为0
  var color:String = _ //String类型默认是""

}
