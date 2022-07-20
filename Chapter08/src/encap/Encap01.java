package encap;

public class Encap01 {
    public static void main(String[] args) {
        Person person = new Person();
        // p1.age = 18; 会报错，因为age为private权限，不允许外部修改
        person.setName("jack");
        person.setAge(300);
        person.setSalary(20000);
        System.out.println(person.info());
    }
}

class Person {
    public String name;//名字公开
    private int age;//年龄私有化
    private double salary;//工资私有化
// 自己写封装太慢，直接生成
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // 加入对数据的校验,字符串可以使用length()来判断
        if (name.length() >= 2 && name.length() <= 6) {
          this.name = name;
        } else {
            System.out.println("输入的名字长度需要在2到6之间");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1到120岁之间");
            this.age = 18; //给默认的年龄为18
        }
        
    }

    public double getSalary() {
        // 可以对当前对象进行一个权限判定
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "name = " + name + " age = " + age + " salary = " + salary;
    }
    
}
