package Chapter05;

public class Return {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                // return会直接终止程序
                return;
            }
            System.out.println("hello");
        }
        System.out.println("go on");
    }
}
