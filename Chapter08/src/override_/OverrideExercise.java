package override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 18);
        System.out.println(p1.say());
        Student s1 = new Student("wild", 12, 123, 100);
        System.out.println(s1.say());


    }
}
