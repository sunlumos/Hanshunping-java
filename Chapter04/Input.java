package Chapter04;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 1.接受输入，需要引入类所在的包
        // 2.创建一个新的scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        // 当程序执行到next的时候，光标会等待输入
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水：");
        double sal = myScanner.nextDouble();
        System.out.println("个人信息如下：");
        System.out.println("姓名：" + name + "年龄：" + age + "薪水：" + sal);

    }
}
