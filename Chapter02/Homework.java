package Chapter02;

public class Homework {
    public static void main(String[] args) {
        //第一题  n3 = 30  n4 = 8
    }
}

class Homework2 {
    public static void main(String[] args) {
        char c1 = '\\';
        System.out.println(c1);
    }
}

class Homework3 {
    public static void main(String[] args) {
        String book1 = "西游记";
        String book2 = "三国演义";
        System.out.println(book1 + "+" + book2);
        char sex1 = '男';
        char sex2 = '女';
        System.out.println(sex1 + sex2); //得到男字符码加女字符码
        double price1 = 456.132;
        double price2 = 123.132;
        System.out.println(price1 + price2);
    }
}

class Homework4 {
    public static void main(String[] args) {
        String name = "sun";
        int age = 18;
        int score = 100;
        char sex = '男';
        String hobby = "游戏";
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+name+'\t'+age+'\t'+score+'\t'+sex+'\t'+hobby);
    }
}