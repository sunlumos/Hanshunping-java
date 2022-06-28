package Chapter07;

public class Method01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(5);

        // 将返回的值赋值给returnRes
        int returnRes = p1.getSum(10, 20);
        System.out.println("返回的值=" + returnRes);
    }
}

// !注意：java同一个包下不同文件的类名也不能相同


class Person {
    String name;
    int age;
    // 成员方法
    public void speak() {
        System.out.println("我是一个好人");
    }

    public void cal01(){
        int res = 0;
        for (int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("计算结果=" + res);
    }
    // int n 表示当前有一个形参n,可以接受用户输入
    public void cal02(int n){
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02计算结果 = " + res);
    }

    //计算两个数的和
    // int 表示方法执行后返回一个int数据，可以接受用户传入的两个数
    // return res:将res的值返回
    public int getSum(int n1,int n2){
        int res = n1 + n2;
        return res;
    }
}

/* // !方法调用小结
1.当程序执行到方法时，就会开辟一个独立的空间
2.当方法执行完毕，或者执行到return语句时，就会返回
3.返回到调用方法的地方
4.返回后，继续执行方法后面的代码
5.main函数执行完毕时，整个程序退出
 */