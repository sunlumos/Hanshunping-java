package extend_;

public class ExtendTest {
    public static void main(String[] args) {
        Pupil p = new Pupil();
        p.name = "银角大王";
        p.age = 11;
        p.testing();
        System.out.println("——————————————");
        Graduate g = new Graduate();
        g.name = "金角大王";
        g.age = 22;
        g.testing();
    }
}
