package Chapter06;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        // todo:二维数组,每个元素是一维数组，就构成二维数组
        int arr[][] = {
        {0,0,0,0,0,0},
        {0,0,1,0,0,0},
        {0,2,0,3,0,0},
        {0,0,0,0,0,0}
    };

    // 输出二维数组
    for (int i = 0; i < arr.length; i++) {
        // 遍历二维数组的每个元素（数组）
        // arr[i] 表示：二维数组的第i+1个元素
        // 1. arr[i].length得到对应的每个一维数组的长度
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + "\t");
        }
        System.out.println();
    }

    }
}
