package extend_;

// 模拟小学生考试
public class Pupil extends Student{
    // 当父类中有参数构造器时，子类构造器需要先调用父类的构造器
    public Pupil(String name){
        super("jack");
    }

    public void testing() {
        System.out.println("小学生" + name + "正在考数学");
    }
}
