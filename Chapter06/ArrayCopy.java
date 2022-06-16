package Chapter06;

public class ArrayCopy {
    public static void main(String[] args) {
        // ! 浅拷贝arr1数组
        int arr1[] = {10,20,30};

        // 创建一个arr2,长度取arr1的长度
        int arr2[] = new int[arr1.length];
        // 遍历arr1,将每个元素拷贝到arr2中
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[0] = 100;

        System.out.println("arr1元素：");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println("arr2元素：");
        for (int j2 = 0; j2 < arr2.length; j2++) {
            System.out.print(arr2[j2] + " ");
        }


    }
}
