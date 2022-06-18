package Chapter06;

public class ChapterHomework {    
}

//!本章作业
class ChapterHomework1{
    public static void main(String[] args) {
/* 
 String[] strs = {"a","b"}  正确
 String[] strs = new String{"a","b"}  错误
 String[] strs = new String[]{"a","b"}  正确
 String[] strs = new String[3]{"a","b"}  
 错误,new String[]括号中不能有数字或者不能有后面的定义
*/
    }
}

class ChapterHomework2 {
    public static void main(String[] args) {
        String foo = "blue";
        boolean[] bar = new boolean[2];
        if (bar[0]) {  //布尔类型数组未赋值的时候默认为false
            foo = "green";
        }
        System.out.println(foo);
    }
}

