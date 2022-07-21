package extend_;

public class Student {
    // 共有的属性
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    
    public void showInfo() {
        System.out.println("学生名：" + name + " 年龄：" + age + " 成绩：" + score);
    }

    // 父类构造器
    public Student(String name){
        System.out.println("父类有参构造器被调用");
    }
}
