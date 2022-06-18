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

class ChapterHomework4 {
    public static void main(String[] args) {
        int arr[] = {10,12,45,90};
        int insert = 23;

        // 创建新的数组，将老数组拷贝到新数组中
        int arrNew[] = new int[5];
        for (int i = 0; i < 4; i++) {
            arrNew[i] = arr[i];
        }

        // 记录老数组中比要插入的数字小的下标
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (insert < arr[i]) {
                flag = i;
                break;
            }
        }

        // 将该下标后面的数字全部后挪一位
        for (int i = 4; i >= flag; i--) {
            arrNew[i] = arrNew[i - 1];
        }
        arrNew[flag] = insert;
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + "\t");
        }
    }
}

