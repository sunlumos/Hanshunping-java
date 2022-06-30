package Chapter07Exer;

public class OverLoadExercise {
    public static void main(String[] args) {
        OverLoadExerciseMethods methods = new OverLoadExerciseMethods();
        System.out.println(methods.m(3));
        System.out.println(methods.m(2,3));
        methods.m("str");
        System.out.println(methods.max(2, 3));
        System.out.println(methods.max(2.2, 3.3));
        System.out.println(methods.max(2.2, 3.3,4.4));

    }

}

class OverLoadExerciseMethods {
    public int m(int a){
        return a * a;
    }
    public int m(int a, int b){
        return a * b;
    }
    public void m(String str){
        System.out.println(str);
    }

    public int max(int a, int b) {
        return a>b?a:b;
        
    }
    public double max(double a, double b) {
        return a>b?a:b;
    }
    public double max(double a, double b,double c) {
        if (a > b) {
            return a > c ? a : c;
        } else {
            return b > c ? b : c;
        }
    }

}
