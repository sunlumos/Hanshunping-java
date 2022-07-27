package override_;

public class Student extends Person {
    
    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    private int id;
    private int score;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String say() { //这里体现super的代码复用
        //用父类的say()输出名字和年龄，用子类的say输出id和score
        return super.say() + " id=" + id + " score=" + score;
    }

}
