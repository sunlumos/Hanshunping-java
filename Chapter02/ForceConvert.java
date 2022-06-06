package Chapter02;

public class ForceConvert {
    public static void main(String[] args) {
        // 强制类型转换,需要用到数据从大类型转变到小类型的时候
        int n1 = (int)1.9;
        System.out.println("n1=" + n1); // 1
        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1); //-48
        // 如果需要将一串运算的结果进行强转，需要一起括起来
        int x = (int)(10*3.5+6*1.5);
        System.out.println(x);
    }
}

class ConvertTest {
    public static void main(String[] args) {
        short s = 12;
        // s = s - 9; 错误，参与运算的数字9是int类型
    }
}