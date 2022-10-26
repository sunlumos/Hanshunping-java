package smallchange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    // 1.先完成显示菜单，并且显示

    public static void main(String[] args) {
        // 定义变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

    // 2.完成零钱通明细
    // (1)可以保存到数组里面 (2)保存在对象中 (3)简单的数据可以使用string拼接
        String detail = "-----------零钱通明细-----------";

    // 根据功能来定义变量
    // 3.完成收益入账
    double money = 0;
    //余额
    double balance = 0;
    Date date = null;  //表示日期

    // 4.完成消费  定义新变量，记录消费的原因
    String note = "";
    // 用于日期格式化
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


        do{

            System.out.println("-----------零钱通菜单-----------");
            System.out.println("\t1 零钱通明细");
            System.out.println("\t2 收益入账");
            System.out.println("\t3 消费");
            System.out.println("\t4 退出");
            System.out.println("请选择（1-4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    // 入账，余额加money
                    balance += money;
                    
                    date = new Date();// 获取当前日期
                    // 拼接到detail中
                    detail += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    // 范围校验
                    System.out.println("请输入消费说明：");
                    note = scanner.next();
                    balance -= money;

                    date = new Date();// 获取当前日期
                    // 拼接到detail中
                    detail += "\n" + note +"\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    // 一段代码实现一个功能  除非用户输入y或者n，否则一直循环
                    while (true) {
                        System.out.println("您确定要退出吗？ y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    System.out.println("退出了零钱通");
                    break;
                    
                default:
                System.out.println("选择输入有误，请从新选择");
                    break;
            }


        } while(loop);
    }
}
