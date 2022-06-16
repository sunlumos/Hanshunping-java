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
