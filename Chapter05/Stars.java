package Chapter05;
// 三角金字塔
public class Stars {
    public static void main(String[] args) {
        // 打印空心的金字塔
        // 首先需要打印出非空心的金字塔，关键是for循环打印金字塔每一行前面的空格
        int totalLevel = 10;
        for (int i = 1; i <= totalLevel; i++) {
            // i表示层数
            // 在输出*号之前，先输出空格  空格数为总层数-当前层数
            for (int j = 0; j < totalLevel - i; j++) {
                System.out.print(" ");
            }
            // 每一层都有2*i-1个星星
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 除了最后一行，每一行只打印第一个和最后一个*号，因此进行判断
                if( i == totalLevel){
                  System.out.print("*");
                }else
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // 用来换行！
            System.out.println("");
        }
    }
}
