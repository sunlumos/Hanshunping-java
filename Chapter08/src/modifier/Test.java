package modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); //可以成功地取出四个属性
        B b = new B();
        b.say(); //b中只能读取n1,n2,n3,不能读取n4
    }
}
