package modifier;

public class A {
    // 属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public void m1() {
        // 在本类中，该方法可以访问四个属性
        System.out.println("n1 = " + n1 + " n2 = " + n2 + " n3 = " + n3 + " n4 = " + n4);
    }
    void m2(){};
    protected void m3() {};
    private void m4() {};
}
