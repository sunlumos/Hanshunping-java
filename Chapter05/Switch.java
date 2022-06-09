package Chapter05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int ch = 'b';
        switch(ch) {
            case 'a':
            System.out.println("OK1");
            break;
            case 'b':
            System.out.println("OK2");
            break;
            default :
            System.out.println("OK3");
        }
    }
}

class switchEx01 {
    public static void main(String[] args) {
        // 将输入的字母转变成大写字母，其他输出other
        Scanner mysScanner = new Scanner(System.in);
        System.out.println("请输入字母：");
        char ch = mysScanner.next().charAt(0);
        switch(ch){
            case 'a':
            System.out.println("A");
            break;
            case 'b':
            System.out.println("B");
            break;
            case 'c':
            System.out.println("C");
            break;
            case 'd':
            System.out.println("D");
            break;
            case 'e':
            System.out.println("E");
            break;
        }
        mysScanner.close();

    }
}

class switchEx02 {
    public static void main(String[] args) {
        // 使用swich来判断成绩是否及格
        // 使用（int）成绩/60
        // 当成绩大于60,结果为1，否则为0
        double score;
        Scanner mysScanner = new Scanner(System.in);
        
        System.out.println("请输入成绩：");
        score = mysScanner.nextDouble();
        int flag = (int)score/60;
        switch (flag){
            case 0:
            System.out.println("成绩不合格");
            break;
            case 1:
            System.out.println("成绩合格");
            break;
            default:
            System.out.println("输入有误");
        }
        mysScanner.close();
    }
}

class switchEx03 {
    public static void main(String[] args) {
        // 输入月份显示季节
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = myScanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;
            default:
            System.out.println("你输入的月份有误");
        }
        myScanner.close();
    }
}