package Chapter05;
/*
 * i变量只在for循环体中有效
 * 如果你想在外面使用i，则需要在外面声明i
 * for(;;){
 *   xxx
 * }  表示的是一个无限循环
 */
public class For01 {
    public static void main(String[] args) {
        // for(循环变量初始化;循环条件;循环变量迭代)
        // 循环操作
         for (int i = 1; i <= 10; i++) {
             System.out.println("hsp"+i);
         }
    }
}

class For01Ex01 {
    public static void main(String[] args) {
        // Q1
        // 化繁为简：将复杂的需求拆解成简单的需求，逐步完成
        // 先死后活：先考虑固定的值，然后转变为可变化的值
        int count = 0;
        int sum = 0;
        // 设置start，end变量，用于更加灵活地进行后续功能扩展
        // 更进一步，倍数也可以变成变量
        int start = 1;
        int end = 100;
        int t = 9;
        for(int i = start;i <= end; i++){
            if(i % t == 0){
                count ++;
                sum += i;
            }
        }
        System.out.println("一共有" + count + "个数，总和为" + sum);
    }
}

class For01Ex02{
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        for(;i <=5 ;i++){
            System.out.println(i + " + " + j + " = 5");
            j--;
        }
    }
}