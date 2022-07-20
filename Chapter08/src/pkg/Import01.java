package pkg;

import java.util.Arrays;

// ! 包的引入
// 建议：需要使用哪个类，就导入哪个类，不建议*导入所有
public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 20, 2, 13, 3};
        // 对其进行排序，系统提供了很多方法
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
