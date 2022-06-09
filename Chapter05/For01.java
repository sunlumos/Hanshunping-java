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
