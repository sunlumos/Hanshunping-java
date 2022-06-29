package Chapter07Exer;

public class HanoiTower {
    public static void main(String[] args) {
        Tower t1 = new Tower();
        t1.move(5, 'A', 'B', 'C');
    }
}

class Tower {
    // num表示要移动的个数，a,b,c表示A,B,C塔
    // a表示起始的塔，b表示借助的塔，c表示最终要移动的塔
    public void move(int num, char a, char b, char c) {
        // 如果只有一个盘，num = 1
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            // 如果有多个盘，可以看成两个，最下面的盘和最上面所有的盘(num-1)
            // 1.先移动上面所有的盘到B塔，借助C塔
            move(num - 1, a, c, b);
            // 2.把最下面的这个盘移动到c
            System.out.println(a + "->" + c);
            // 再将b塔的所有盘，移动到c，借助a
            move(num - 1, b, a, c);
            
        }
    }
}
