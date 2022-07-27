package poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        // 调用方法sum()，从子类开始查找调用
        System.out.println(a.sum());//40 -> 30
        System.out.println(a.sum1());//30 -> 20
    }
}

class A {//父类
    public int i = 10;
    //动态绑定机制:
// 1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
// 2.属性没有动态绑定机制，哪里声明哪里使用
    public int sum() {//父类sum()
        // 走到这里，子类父类都有getI()
        // 动态绑定机制：运行类型为B，因此执行B中的getI()
        return getI() + 10;//20 + 10
    }

    public int sum1() {//父类sum1()
        return i + 10;//10 + 10
    }

    public int getI() {//父类getI
        return i;
    }
}

class B extends A {//子类
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {//子类getI()
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}
