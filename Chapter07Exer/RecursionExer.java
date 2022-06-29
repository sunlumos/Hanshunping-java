package Chapter07Exer;

public class RecursionExer {
    public static void main(String[] args) {
        RecursionExerMethods a = new RecursionExerMethods();
        int n = 7;
        System.out.println("第" + n + "个斐波那契数字为：" + a.Feb(n));
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
}
