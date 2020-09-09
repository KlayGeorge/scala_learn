package cycle

import scala.io.StdIn

/**
 * @Author: CMOS
 * @Date: 2020/9/9 11:02 上午
 */
/**
 * @Author: cmos
 * @Date: 2020/9/9 11:02
 * @ClassName cycleDemo1
 */
object cycleDemo1 {
  def main(args: Array[String]): Unit = {
    /**
     * 1.统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
     * 2.统计三个班及格人数，每个班有5名同学。
     * 3.打印出九九乘法表
     */

//班级情况1 2题
    var classNum = 3
    var stuNum =5
    var score = 0.0 //各个学生成绩
    var classScore = 0.0 //班级总分
    var totalScore = 0.0 //所有班级总分
    var passNum = 0 //及格人数
    for(i<- 1 to classNum){
      //每循环一次，classScore需要清零
      classScore =0.0
      for(j <- 1 to stuNum){
        printf("请输入第%d班级的第%d个学生第成绩\n",i,j)
        score = StdIn.readDouble()
        classScore += score
        if(score >= 60){
          passNum += 1
        }
      }
      printf("第%d班级第平均分为%.2f",i,classScore/stuNum)
      totalScore += classScore
    }
      printf("所有班级的平均分为%.2f",totalScore / (stuNum*classNum))
      printf("所有班级的及格人数为%d",passNum)

// 打印乘法表
    val num = 9
    for(i <- 1 to num){ // 确定行数
      for(j <- 1 to i){ //确定列数
            printf("%d * %d = %d\t",j,i,i*j)
      }
      println()
    }
  }



  }
