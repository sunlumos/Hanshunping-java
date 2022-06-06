package Chapter02;

public class AutoConvertDetail {
    public static void main(String[] args) {
        // 多种类型一起计算时，系统首先自动将数据转变成容量最大的那个类型
        int n1 = 10;
        // float num = n1 + 1.1;  报错，double类型不能转变为float
        // 精度大的赋值给精度小的，会报错，反之会自动进行类型转换
        // byte short和char之间不会项目转换
        // 把具体的数赋值给byte，会先判断是否在类型范围内，如果是就可以
        byte b1 = 10;
        int n2 = 1;
        // byte b1 = n2; //报错，如果是直接赋值，会根据类型来进行判断，而不是值
    }
}
