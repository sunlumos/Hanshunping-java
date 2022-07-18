package Chapter07Exer;

public class ThisExer {
    public static void main(String[] args) {
        ThisExerPerson p1 = new ThisExerPerson("A", 18);
        ThisExerPerson p2 = new ThisExerPerson("A", 18);
        boolean flag = p1.compare(p2);
        System.out.println(flag);
     }
}

class ThisExerPerson {
    String name;
    int age;

    public ThisExerPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
// 比较方法
    public boolean compare(ThisExerPerson p) {
        // 名字和年龄完全一样
        // if (this.age == p.age && this.name.equals(p.name)) {
        //     return true;
        // } else { return false; }
        return this.age == p.age && this.name.equals(p.name);
    }
}

