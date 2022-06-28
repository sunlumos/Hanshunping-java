package Chapter07Exer;

public class MethodExercise01 {
    public static void main(String[] args) {
        AA a = new AA();
        int test = 5;
        if (a.isJ(test)) {
            System.out.println(test + "是偶数");
        } else {
            System.out.println(test + "是奇数");
        }
        a.printString(5, 8, '#');
    }
}

class AA {
    public boolean isJ(int n){
        return n % 2 == 0;
    }

    // todo:打印row行column列的n字符
    public void printString(int row,int column,char n){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
