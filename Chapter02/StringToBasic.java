package Chapter02;

public class StringToBasic {
    public static void main(String[] args) {
        // 基本数据类型转字符串
        // 基本数据类型+""即可
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.35;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        // 字符串转变成基本数据类型
        String s5 = "123";
        // parse:转换
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        System.out.println(num1 + " " + num2+ " " + num3);
        // 把字符串转变成字符，实质是取字符串中的字符
        System.out.println(s5.charAt(1));
    }
}
