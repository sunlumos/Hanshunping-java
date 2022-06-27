package Chapter07;

public class PropertiesDetail {
    public static void main(String[] args) {
        // 创建一个新的person对象
        // p1是对象的名字，new person创建的对象空间才是真正的对象
        // p1只是用来引用的
    Person p1 = new Person();    
    }
}

class Person {
    // 四个属性
    int age;
    String name;
    double sal;
    boolean isPass;
}
