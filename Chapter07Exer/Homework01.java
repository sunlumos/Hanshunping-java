package Chapter07Exer;

public class Homework01 {
    public static void main(String[] args) {
        double[] arr = {2.11, 3.85, 8.99, 1.1};
        A01 a1 = new A01();
        double max = a1.max(arr);
        System.out.println(max);
    }

}

class A01 {
    public double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
