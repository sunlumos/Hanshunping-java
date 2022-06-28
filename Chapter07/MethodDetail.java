package Chapter07;

/*
!方法细节
方法构成：访问修饰符 返回的数据类型 方法名(参数){方法体}
1.一个方法最多有一个返回值
?如何返回多个结果？
可以返回数组
2.返回的类型可以是任意类型，包含基本类型或者引用类型(数组，对象)
3.如果方法要求有返回数据类型，则方法体中最后执行的语句必须是return 值
而且返回的值的类型必须与return返回的值类型一致或者兼容
4.void，方法体中可以没有return,或者只写return
方法命名：驼峰式命名法，见名知意

!形参列表细节
1.一个方法可以有0到多个参数，中间逗号隔开
2.参数类型可以为任意类型，包含基本类型和引用类型
3.调用方法传参的时候，一定要传入和形参匹配或者兼容的参数类型
4.形参和实参需要类型一致或者兼容，个数，顺序必须一致
!如果方法需要传入两个参数，而实际只传入了一个，是不行的
!方法体里面不能再有方法，即方法不能嵌套定义

 */

public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        // int res[] = a.getSumAndSub(12, 6);
        // System.out.println("和 = " + res[0]);
        // System.out.println("差 = " + res[1]);
        // a.sayOK();
        // a调用了m1方法，m1方法又调用了BB类中的hi方法
        a.m1();
    }
}

class AA {
    //! 一个方法最多一个返回值，但可以使用数组来保存多个值进行返回
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    // 同一个类中的方法可以直接调用
    public void print(int n){
        System.out.println("print方法被调用，n = " + n);
    }

    public void sayOK(){
        print(20);
        System.out.println("继续执行sayOK");
    }

    public void m1(){
        // !跨类调用BB 中的方法hi，需要new一个对象
        BB b1 = new BB();
        b1.hi();
    }

}

class BB{
    public void hi(){
        System.out.println("B类中的hi方法被调用");
    }
}