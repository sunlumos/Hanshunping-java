package extend_;

// ! 继承的本质
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        // 当开始查找属性时，按照一下的顺序来进行查找
        // 1.首先看子类是否有这个属性
        // 2.如果子类有这个属性，并且可以访问，则返回信息
        // 3.如果子类没有这个属性，则看父类是否有这个属性(如果父类有且可以访问，则返回)
        // 4.如果父类没有，则按照3来继续往上访问……
        System.out.println(son.getAge());
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 100;
}

class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;
    // 如果父类中的某个属性为私有，可以设置公共方法来访问
    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";
}
