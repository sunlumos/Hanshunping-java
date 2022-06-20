package Chapter07;

public class Object01 {
    public static void main(String[] args) {
        // 使用OOP面向对象解决
        // 实例化一只猫，创建一只猫对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        cat1.weight = 10;

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        // 访问对象的属性
        System.out.println("第一只猫的信息：" + cat1.name + " " + cat1.age + " " + cat1.color);
    }
}

// 使用类对象来处理猫的问题
class Cat {
    String name;
    int age;
    String color;
    double weight;
}
