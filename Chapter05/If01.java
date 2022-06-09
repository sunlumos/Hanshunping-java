package Chapter05;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        if(age >= 18) {
            System.out.println("成年了，需要为自己行为负责");
        } else {
            System.out.println("你年龄不大，放过你了");
        }
        // scanner.close()，调用scanner后，系统希望你最后进行关闭
        myScanner.close();
    }
}

class IfTest {
    public static void main(String[] args) {
        // Q1
        // double num1 = 13.45;
        // double num2 = 15.22;
        // if(num1 > 10.0){
        //     if(num2 < 20.0){
        //         System.out.println(num1 + num2);
        //     }
        // }

        // Q2
        // int num1 = 11;
        // int num2 = 3;
        // int sum = num1 + num2;
        // if(sum % 3 == 0 && sum % 5 == 0){
        //     System.out.println("他们可以同时被3和5整除");
        // } else {
        //     System.out.println("他们不满足条件");
        // }

        // Q3
        int year = 2001;
        if(year % 4 == 0 && year % 100 != 0 ){
            System.out.println(year + "是闰年");
        } else if(year % 400 == 0){
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年");
        } 

    }
}

class IfTest01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入保国同志的芝麻信用分：");
        int score = myScanner.nextInt();
        // 先对输入的信用分范围进行有效判断
        if (score >= 1 && score <= 100){
            // 再进行常规的判断
            if (score == 100){
                System.out.println("信用极好");     
            } else if (score > 80){
                System.out.println("信用优秀");
            } else if (score >= 60){
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
            
        } else {
            System.out.println("信用分异常，请重新输入");
        }
        
        myScanner.close();
    }
}