package Chapter05;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        if(age >= 18) {
            System.out.println("成年了，需要为自己行为负责");
        }
        // scanner.close()，调用scanner后，系统希望你最后进行关闭
        myScanner.close();
    }
}
