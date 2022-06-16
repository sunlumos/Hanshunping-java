package Chapter06;

public class Array01 {
    public static void main(String[] args) {
    // TODO：求六只鸡的平均体重
    // ! 数组；可以存储多个同一类型的数据类型
    // 表示double类型的数组，数组名为hens，后面为数组的值,下标从0开始编号的
    double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 1.1, 5.6};
    double totalweight = 0;
    // 可以通过数组名.length得到数组的长度
    for (int i = 0; i < hens.length; i++) {
        System.out.println("第" + (i+1) + "只鸡的体重为" + hens[i]);
        totalweight += hens[i];
    }
    System.out.println("平均体重为" + (totalweight/hens.length) );

    }
}
