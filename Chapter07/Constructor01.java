package Chapter07;

public class Constructor01 {
    public static void main(String[] args) {
        Constructor01Person p1 = new Constructor01Person("smith", 80);
        System.out.println("p1的名字 = " + p1.name + ",p1的年龄 = " + p1.age);
    }
}

class Constructor01Person {
    String name;
    int age;
// 1.构造器没有返回值，也不能写void
// 2.构造器的名字和其类名一致
// 3.(String pName, int pAge)是构造器的形参列表，规则和成员方法一样
    public Constructor01Person(String pName, int pAge){
        System.out.println("构造器被调用，完成对象的初始化");
        name = pName;
        age = pAge;
    }

    // 可以构建第二个构造器，名字还是得和类名一致
    // 构造器是对象初始化，不是创建对象
    public Constructor01Person(String pName){
        name = pName;
    }
    
}

class Constructor01Dog {
    // 如果程序员没有定义构造器，则会系统会自动生成一个无参构造器(默认构造器)
    // 可以使用javap反编译
    // Constructor01Dog(){

    // }
    // ! 一旦定义了自己的构造器，默认构造器就覆盖了，不能再使用默认构造器
    // 除非显示的定义一下
    Constructor01Dog(String dName){
    }  
    Constructor01Dog(){}
}
