package Chapter05;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                break;
            }
            // i = 3 不会输出
            System.out.println("i = " + i);
        }
    }
}
// break可以指定退出哪一层，没有指定，默认退出最近的循环体
class breakDetail {
    public static void main(String[] args) {
        abc1:
        for (int i = 0; i < 4; i++) {
        
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    break abc1;
                }
                System.out.println("j = " + j);
            }
        }
    }
}

class BreakQ1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println(i);
                break;
            }
        }
    }
}

class BreakQ2{
    public static void main(String[] args) {
        // 创建scanner来接受名字和密码
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String code = "";
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("请输入用户名：");
            name = myScanner.next();
            System.out.println("请输入密码：");
            code = myScanner.next();
            // 字符串输入的内容比较是：equals()，而不是 ==
            // 使用"丁真".quals(name),而不是name.equals("丁真")
            // 可以防止空指针错误
            if ("丁真".equals(name) && "666".equals(code)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("密码错误，你还有" + (3-i) + "次机会");
            }
        }
        myScanner.close();
    }
}