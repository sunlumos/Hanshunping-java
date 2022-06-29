package Chapter07;

public class Recursion {
    // todo 递归调用
    public static void main(String[] args) {
        RecursionT t = new RecursionT();
        t.test(4);
        System.out.println(t.factorial(5));
    }
}

class RecursionT {

    // ! 递归必须向退出递归条件逼近，否则就会无限递归
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n = " + n);
    }

    // 用于求n！
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
