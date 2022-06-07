package Chapter04;

public class Operator {
    public static void main(String[] args) {
        // 算术运算符
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        double d = 10 / 4;
        System.out.println(d);
        // %的本质是：a % b = a - a / b * b
        System.out.println(10 % -3);
    }
}

class OperatorTest {
    public static void main(String[] args) {
        // Q1
        // int i = 1;
        // i = i++;
        // System.out.println(i);// 1

        // Q2
        // int i = 1;
        // i = ++i;
        // System.out.println(i);  结果：2

        // Q3
        // int i1 = 10;
        // int i2 = 20;
        // int i = i1++; // i = 10
        // System.out.println("i=" + i);
        // System.out.println("i1=" + i1); //11
        // i = --i2; // i = 19
        // System.out.println("i=" + i);
        // System.out.println("i2=" + i2); //19

        // Q3
        int week,day;
        week = 59/7;
        day = 59%7;
        System.out.println("合计" + week + "个星期零" + day + "天");        
        double c = 234.5;
        double d = 5.0/9*(c-100);  //使用5.0来进行转换
        System.out.println("对应的摄氏度为：" + d);
    }
}