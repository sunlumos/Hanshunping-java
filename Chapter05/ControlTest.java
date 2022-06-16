package Chapter05;

public class ControlTest {
    
}

class ControlTestQ1{
    public static void main(String[] args) {
        double gold = 100000;
        int count = 0;
        while (gold > 0) {
            if (gold > 50000) {
                gold = gold - gold * 0.05;
            } else {
                gold = gold - 1000;
            }
            count++;
            if (gold < 1000) {
                break;
            }
        }
        System.out.println("可以经过" + count + "次路口");
        System.out.println("还剩" + gold + "元");
    }
}

class ControlTestQ2 {
    public static void main(String[] args) {
        int a = -8;
        if (a > 0) {
            System.out.println("该数大于0");
        } else if(a == 0){
            System.out.println("该数等于0");
        } else if(a < 0){
            System.out.println("该数小于0");
        } else {
            System.out.println("该值不是数");
        }
    }
}

class ControlTestQ4 {
    public static void main(String[] args) {
        // 判断水仙花数
        int n = 153;
        double sum = 0;
        int a = n%10;
        int b = n/10%10;
        int c = n/100%10;
        sum = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
        if (n == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

class ControlTestQ6{
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    // 输出换行
                    System.out.println();
                }
            }
        }
    }
}

class ControlTestQ7 {
    public static void main(String[] args) {
        // 考察a到z的字符编码能力
        // for (int i = 97; i <= 122; i++) {
        //     System.out.print((char)i + " ");
        // }
        // for循环是开放自由的！
        for (char c1 = 'a';c1 <= 'z';c1++) {
            System.out.print(c1 + " ");
        }
        System.out.println();
        for (char c1 = 'A';c1 <= 'Z';c1++) {
            System.out.print(c1 + " ");
        }
        
    }
}

class ControlTestQ8{
    
    public static void main(String[] args) {
       
        
        double sum = 1;
        for (double i = 2.0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum  -=  1/i;
            } else {
                sum  += 1/i;
            }
        }
        System.out.println(sum);
    }
}

class ControlTestQ9 {
    public static void main(String[] args) {
        //?我的思路：创建一个t，用于记录每个小块循环累加的值，然后加给总的sum值上面去,每次计算完后，t需要进行一次清空为0
        
        int sum = 0;
        int t;
        for (int i = 1; i <= 100; i++) {
            t = 0;
            for (int j = 1; j <= i; j++) {
               t += j;
            }
            sum += t;
        }
        System.out.println(sum);
    }
}