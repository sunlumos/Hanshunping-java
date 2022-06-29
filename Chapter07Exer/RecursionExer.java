package Chapter07Exer;

public class RecursionExer {
    public static void main(String[] args) {
        RecursionExerMethods a = new RecursionExerMethods();
        int n = 7;
        System.out.println("第" + n + "个斐波那契数字为：" + a.Feb(n));
        int peach = a.Monkey(1);
        System.out.println("第1天有" + peach + "个桃子");
    }
}

class RecursionExerMethods {
    // 求斐波那契数字
    public int Feb(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Feb(n - 1) + Feb(n - 2);
        }
    }

/*
day = 10时候，有1个桃子
day = 9,有(day10 + 1) * 2 = 4
规律：前一天的桃子 = （后一天的桃子 + 1） * 2
 */

    public int Monkey(int day) {
        if (day == 10) {
            return 1;
        } else if(day >= 1 && day <= 9){
            return (Monkey(day + 1) + 1) * 2;
        } else {
            System.out.println("输入的天数不对");
            return -1;
        }
    }

}
