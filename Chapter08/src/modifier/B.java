package modifier;

public class B {
    public void say() {
        A a = new A();
        // 在同一个包下，可以访问public,protected,和默认，不能访问private
        // System.out.println(a.n4);报错，不能访问n4
        System.out.println(a.n1 + " " + a.n2 + " " + a.n3 + " " );
    }
}
