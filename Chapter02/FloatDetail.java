package Chapter02;

public class FloatDetail {
    public static void main(String[] args) {
        // java的浮点型常量默认为double，声明float类型需要在后后面添加f
        // float num1 = 1.1;  报错，1.1默认为double,8个字节，无法变成4个字节的
        float num2 = 1.1F; 
        double num3 = 1.1;
        double num4 = 1.1F; //也是正确的，将4个字节的装在8个字节的double里
        double num5 = .125; //前面为0可以省略
        // 通常情况下，推荐double

        // 浮点数使用陷阱
        double num11 = 2.7;
        double num12 = 8.1/3;
        // num12的结果为接近2.7的数字，而不是2.7
        // 当我们对运算结果是小数进行相等判断的时候需要小心
        // 应该以两个数的差值的绝对值小于某个精度范围来判断
        //正确的写法
        if(Math.abs(num11 - num12) < 0.000001){
            System.out.println("差值非常小，可以认为相等");
        }
    }
}
