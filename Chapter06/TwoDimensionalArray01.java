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
    // ! 二维数组关键概念
    // 二维数组的每个元素都是一个一维数组，所以如果需要得到每个一维数组的值，还需要继续遍历
    // 如果需要访问第（i + 1）个一维数组的第j+1个值，arr[i][j]
    // 原因：从0开始计数
    System.out.println("第三个一维数组的第四个值为：" + arr[2][3]);
    for (int i = 0; i < arr.length; i++) {
        // 遍历二维数组的每个元素（数组）
        // arr[i] 表示：二维数组的第i+1个元素
        // arr[i].length得到对应的每个一维数组的长度
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + "\t");
        }
        System.out.println();
    }

    }
}

class TwoDimensionalArray02 {
    public static void main(String[] args) {
        // 二维数组的动态初始化
        int arr[][] = new int[2][3];
// 也可以先声明，再使用：int arr[][];  arr = new int[2][3];
        arr[1][1] = 8;

        // 遍历arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();// 每输出一行一维数组后进行换行
        }
    }
}
