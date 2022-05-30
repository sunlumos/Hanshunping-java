
public class ChangeChar {
    public static void main(String[] args){
        // System.out.println输出
        // \t制表符，空出固定的空格
        System.out.println("北京\t天津\t上海");
        // \n换行符
        // 输出\,需要\\,输出\\,需要\\\\
        System.out.println("老汉说：“要好好学习”");
        // \r回车，光标回到该行最开始，而不是另起一行
        // 输出完韩顺平教育后，光标回车到改行的第一个字，韩，然后将北京替换韩顺
        System.out.println("韩顺平教育\r北京");
        // 课堂练习
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");     
    }
}
