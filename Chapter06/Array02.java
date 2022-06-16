package Chapter06;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        double scores[] = new double[5];
        // 循环输入成绩
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i+1) + "个学生成绩：");
            scores[i] = myScanner.nextDouble();
        }
        System.out.println("所有成绩如下：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        myScanner.close();
    }
}

// !数组细节
// 如果没有给数组元素赋值，则数值型的默认赋值为0，string类型为null，布尔为false
// 数组下标必须在数组的范围里面使用，否则会报错：下标越界
