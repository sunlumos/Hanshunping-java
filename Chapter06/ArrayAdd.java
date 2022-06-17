package Chapter06;

public class ArrayAdd {
    public static void main(String[] args) {
        // todo:动态实现给数组添加元素的效果
        // 定义一个新的数组，遍历arr数组，将其元素拷贝到arrNew数组中
        // 将4赋值给arrNew的最后一个元素中
        // 让arr指向arrNew,原来的arr数组会被销毁
        int arr[] = {1,2,3};
        int arrNew[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
