package Chapter05;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        double score;
        char gender;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        score = myScanner.nextDouble();
        if( score > 8.0){
            System.out.println("请输入性别：");
            // 拿到输入的字符串的第一个字符
            gender = myScanner.next().charAt(0);
            if(gender == '男'){
                System.out.println("进入男子组");
            } else if(gender == '女'){
                System.out.println("进入女子组");
            } else {
                System.out.println("你输入的性别有误");
            }
        } else {
            System.out.println("你被淘汰了");
        }
        
    }
}

class NestedIfTest {
    public static void main(String[] args) {
        // 出票系统
        String year = "淡季";
        int age = 66;
        if (year == "淡季"){
            if(age >= 18 && age <= 60){
                System.out.println("票价为60");
            } else if (age < 18){
                System.out.println("票价半价");
            } else if (age > 60){
                System.out.println("票价为三分之一");
            }
        }
    }
}