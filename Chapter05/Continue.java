package Chapter05;

public class Continue {
    public static void main(String[] args) {
        // continue:跳过本次循环，继续执行下次循环
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
            
        }
    }
}
