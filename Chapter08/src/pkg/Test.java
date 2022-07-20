package pkg;

import modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 在不同的包下，可以访问public修饰的属性或者方法，其他的则不行
        System.out.println(a.n1);
    }
}
