package poly_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        // b的编译类型为Base,运行类型为Sub
        Base b = s;
        System.out.println(b == s);//T
        System.out.println(b.count);//10
        // 运行方法的时候，从运行类型来开始查找方法
        b.display();//20
    }

}

class Base {//父类
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {//子类
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}

