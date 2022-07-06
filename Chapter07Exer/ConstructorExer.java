package Chapter07Exer;

public class ConstructorExer {
    public static void main(String[] args) {
        ConstructorExerPerson p1 = new ConstructorExerPerson();
        System.out.println("p1的age = " + p1.age);
        ConstructorExerPerson p2 = new ConstructorExerPerson("smith", 23);
        System.out.println("p2的name = " + p2.name);
        System.out.println("p2的age = " + p2.age);

    }
}

class ConstructorExerPerson{
    String name;
    int age;
    public ConstructorExerPerson(){
        age = 18;
    }

    public ConstructorExerPerson(String pName, int pAge){
        age = pAge;
        name = pName;
    }
}
