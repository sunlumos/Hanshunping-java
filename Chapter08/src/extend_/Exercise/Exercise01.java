package extend_.Exercise;

public class Exercise01 {
    public static void main(String[] args) {
        // 1.调用的无参构造器
        B b = new B();
    }
}

class A {
    A(){ System.out.println("a"); }
    A(String name){ System.out.println("a name"); }
}

class B extends A {
    // 2.无参构造器，有了this("abc")，则没有super，调用B的有参的构造器
    B(){ this("abc"); System.out.println("b");}
    // 3.调用有参构造器
    B(String name) {
        // 4.子类的构造器中，如果没有super(),则默认调用父类的无参构造器
        System.out.println("b name");
    }

}
