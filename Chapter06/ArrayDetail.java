package Chapter06;

public class ArrayDetail {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = arr1;
        //! 数组细节
        // 数组的拷贝是地址拷贝，arr2拷贝arr1，当arr2数值发生改变的时候会影响到arr1的值，是地址拷贝
        // arr1数组名是指向内存中的一个地址，数组赋值是赋的地址
        arr2[0] = 10;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
