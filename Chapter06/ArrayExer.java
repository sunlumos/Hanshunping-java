package Chapter06;

public class ArrayExer {
    public static void main(String[] args) {
        char ch[] = new char[26];
        // ?我的做法
        // char c = 'A';
        //  for (int i = 0; i < ch.length; i++) {
        //      ch[i] = c;
        //      c++;
        //  }

        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char)('A' + i);
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}

class ArrayExerQ2 {
    public static void main(String[] args) {
        int arr[] = {4, -1, 9, 10, 23, 11};
        int max = arr[0];
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                t = i;
            }
        }
        System.out.println("数组最大值为：" + max + "，下标为：" + t);
    }
}