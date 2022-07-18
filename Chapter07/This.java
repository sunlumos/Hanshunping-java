package Chapter07;

public class This {
    public static void main(String[] args) {
        ThisDog dog1 = new ThisDog("大壮", 8);
        System.out.println("dog1的hashcode为：" + dog1.hashCode());
        dog1.info();
        ThisDog dog2 = new ThisDog("大黄", 12);
        System.out.println("dog2的hashcode为：" + dog2.hashCode());
        dog2.info();
    }
}

// !总结：哪个对象调用，this就代表的哪个对象
class ThisDog {
    String name;
    int age;
    // 引入this关键字，jvm会自动生成this，this代表当前的对象
    public ThisDog(String name, int age){
        this.name = name;
        this.age = age;
        // 创建新的对象时候，此时的this和外部的dog为同一个对象
        System.out.println("this.hashcode为：" + this.hashCode());
    }
    public void info() {
        System.out.println("这只dog的名字为：" + name + ",年龄为:" + age);
    }
}
