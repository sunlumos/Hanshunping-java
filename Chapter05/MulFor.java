package Chapter05;

import java.util.Scanner;

public class MulFor {
    public static void main(String[] args) {
        
    }
}

class MulForQ1 {
    public static void main(String[] args) {
        double score,ave,sum = 0,allSum = 0,allAve = 0;
        Scanner myScanner = new Scanner(System.in);
        for(int j = 1;j <= 3;j++){
            for(int i = 1;i <= 5;i++){
            System.out.println("请输入班级" + j + "同学" + i + "的成绩");
            score = myScanner.nextDouble();
            sum = sum + score;
        }
        allSum += sum;
        ave = sum/5.0;
        System.out.println("班级"+ j + "的平均分为" + ave);
        sum = 0;
    }
    allAve = allSum / 15.0;
    System.out.println("所有班级平均分为" + allAve);
    myScanner.close();
    }
}

class MulForQ2{
    public static void main(String[] args) {
        // 九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i * j;
                System.out.print(i + "*" + j + "=" + sum);
                if (i == j) {
                    System.out.println("\n");
                }
            }
        }
    }
}