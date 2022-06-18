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

class TwoDimensionalArray05 {
    public static void main(String[] args) {
        // todo 遍历输出二维数组,并求和
        int arr[][] = {{4,6},{1,4,5,7},{-2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("总和为:" + sum);

    }
}

class Yanghui {
    public static void main(String[] args) {
        //todo  打印十行杨辉三角
        /*//! 规律
          第一行有1个元素，第n行有n个元素
          每一行的第一个元素和最后一个元素都是1
          从第三行开始，对于非第一个元素和最后一个元素的元素值为
          arr[i][j] = arr[i-1][j] + arr[i-2][j-1]
         */
        int arr[][] = new int[10][];  //先不给一维数组开辟空间

        for (int i = 0; i < arr.length; i++) {
            // 单独对一维数组分别开辟空间
            arr[i] = new int[i + 1];

            // 给每个一维数组进行赋值
            for (int j = 0; j < arr[i].length; j++) {
                //如果是arr[i][0]或者是arr[i][j],就等于1
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else //如果不是第一个或者最后一个 
                {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        // 打印
        System.out.println("杨辉三角为：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
 
/*//todo 课堂练习
 int[] x,y[]
 x是int类型的一维数组,y是int类型的二维数组
 x[0] = y  错误！y是二维数组，x[0]是一个数
 y[0] = x  正确！y[0]是一维数组，可以取x
 */