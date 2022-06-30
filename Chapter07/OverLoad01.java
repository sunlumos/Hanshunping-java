package Chapter07;

public class OverLoad01 {
    // todo:方法重载，同名方法不同的接受参数，不同功能
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
