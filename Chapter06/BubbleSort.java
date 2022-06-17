package Chapter06;

public class BubbleSort {
    public static void main(String[] args) {
        // todo:冒泡排序
        // 把大的数排在后面
        int arr[] = {24,69,80,57,13,100,2};
        int temp = 0;  //用于辅助交换变量
        // for (int i = 0; i < 4; i++) {  //4次交换，而不是五次
        //     if (arr[i] > arr[i + 1]) { //当大的数在前面的时候，进行交换
        //         temp = arr[i];
        //         arr[i] = arr[i + 1];
        //         arr[i + 1] = temp;

        //     }
        // }

        // 将多轮循环使用外层循环包括起来
        for (int i = 0; i < arr.length - 1; i++) {  //外层需要循环数组长度-1次
        //内部我们需要越来越少的循环，但每次都需要从第一个数开始匹配
        // 先死后活：用arr,length代替4.后面数组都可以灵活使用了
            for (int j = 0; j < arr.length - 1 - i; j++) {  
                if (arr[j] > arr[j + 1]) { 
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }



    }
}
