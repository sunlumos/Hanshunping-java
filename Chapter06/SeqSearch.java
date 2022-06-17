package Chapter06;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        // todo:顺序查找

        String names[] = {"白眉","金毛","紫衫","青翼"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要查找的名字：");
        String findName = myScanner.next();
        
        //遍历数组，逐一寻找
        // 设置flag用于记录是否找到了，默认未找到为-1
        int flag = -1;
        for (int i = 0; i < names.length; i++) {
            if (findName.equals(names[i])) {
                System.out.println("恭喜你找到了" + findName);
                System.out.println("他的下标为：" + i);
                flag = 1;
                break;
            }
        }
        if (flag == -1) {
            System.out.println("抱歉，未找到" + findName);
        }
        myScanner.close();
    }
}
