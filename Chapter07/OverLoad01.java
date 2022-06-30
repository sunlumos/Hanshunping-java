package Chapter07;

public class OverLoad01 {
    // todo:方法重载，同名方法不同的接受参数，不同功能
    // !注意点
    // 1.方法名一定要相同
    //! 2.形参的类型或个数或者顺序至少有一样不同，参数名不影响
    // 3.返回类型对于方法重复没影响
    
    public static void main(String[] args) {
        myCalculate mc = new myCalculate();
        System.out.println(mc.calculate(3, 4,5));
    }
}

class myCalculate {

    public int calculate(int n1, int n2){
        return n1 + n2;
    }
    public double calculate(int n1, double n2){
        return n1 + n2;
    }
    public double calculate(double n1, int n2){
        return n1 + n2;
    }
    public int calculate(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}
