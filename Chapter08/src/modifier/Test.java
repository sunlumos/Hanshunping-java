package modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); //可以成功地取出四个属性
        B b = new B();
        b.say(); //b中只能读取n1,n2,n3,不能读取n4
        // 方法的权限也是一样的，同一个包下只能读取public,protected,默认
        a.m1();
        a.m2();
        a.m3();
    }
}

// 只有默认和public可以修饰类

