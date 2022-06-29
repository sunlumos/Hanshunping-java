package Chapter07Exer;

public class MethondParameter {
    public static void main(String[] args) {
/* 
!易错点
swap方法接收的a和b是值，值传递，而不是地址传递
a和b在swap的栈中完成了值的交换，但在主方法中不受影响 
!结论：基本数据类型，传递的是值，形参的任何改变不影响实参
*/
        int a = 10;
        int b = 20;
        MethondParameterAA obj = new MethondParameterAA();
        obj.swap(a, b);
        System.out.println("a =" + a + "\tb = " + b);

        //!引用对象是地址传递，数组，对象都是引用对象
        // 对其进行修改是会影响原来的值的
        int[] arr = {1,2,3};
        B bb = new B();
        bb.test100(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

// 方法中的p最后开始是指向main中的p的地址
// 但当方法中的p=null后，方法中的p指向空，并不会影响main中的p的指向
// 因此main程序继续执行P.age的时候，指向10
        Person p = new Person();
        p.age = 10;
        p.name = "jack";
        // bb.test200(p);
        // System.out.println("p.age=" + p.age);
        Person q = bb.copyPerson(p);
        System.out.println("q.name=" + q.name + "\tq.age=" + q.age);
        // 判断p和q是否是同一个对象
        System.out.println(p == q);
    }
}

class MethondParameterAA {
    public void swap(int a,int b){
        System.out.println("交换前的值：a = " + a + ",b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("交换后的值：a = " + a + ",b = " + b);
        
    }
}

class B {
    public void test100(int[] arr){
        arr[0] = 100;
    }

    public void test200(Person p){
        p = null;
    }

    public Person copyPerson(Person p){
        Person q = new Person();
        q.age = p.age;
        q.name = p.name; 
        return q;  
    }

}

class Person {
    String name;
    int age;
}