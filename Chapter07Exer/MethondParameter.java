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
