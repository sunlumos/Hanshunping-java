package Chapter07Exer;

public class MiGong {
    public static void main(String[] args) {
/* 
todo:老鼠走迷宫
1.先创建迷宫，用二维数组表示 int [][] map = new int[8][7];
2.先规定map数组的元素值：0可以走，1表示障碍物 */

    int [][] map = new int[8][7];
// 3.将最上面一行和最下面一行设置为障碍物，1
    for (int i = 0; i < 7; i++) {
        map[0][i] = 1;
        map[7][i] = 1;
    }
    // 4.将最右边的和最左边的一列设置为1
    for (int i = 0; i < 8; i++) {
        map[i][0] = 1;
        map[i][6] = 1;
    }
    // 再单独设置障碍物
    map[3][1] = 1;
    map[3][2] = 1;

    // 输出初始地图
    System.out.println("————————初始地图————————");
    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map[i].length; j++) {
            System.out.print(map[i][j] + " ");
        }
        System.out.println();
    }

    MiGongT t1 = new MiGongT();
    t1.findWay(map, 1, 1);
    System.out.println("————————找路地图————————");
    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map[i].length; j++) {
            System.out.print(map[i][j] + " ");
        }
        System.out.println();
    }


    }
}

class MiGongT {
/*  使用递归回溯的思想来解决老鼠出迷宫 
     1.findway方法就是专门来找出迷宫的路径
     2.如果找到返回true，否则返回false
     3.map表示迷宫 
     4.i,j就是老鼠的位置，初试化的位置为(1,1)
     5.因为是递归找路，所以需要规定map数组各个值的含义
     0表示可以走  1表示障碍物  2表示暂定可以走的路线  3表示走过但是走不通的死路
     6.当map[5][6] = 2  说明找到通路，游戏结束，否则继续找
     7.先确定老鼠找路策略：下，右，上，左
     */ 
  public boolean findWay(int[][] map, int i,int j ){
    if (map[6][5] == 2) { //说明找到去终点的路了
        return true;        
    } else {
        if (map[i][j] == 0) { //说明当前位置可以走，而且还未走过
            // 假定可以走通，检查该点能不能继续往前走
            // 就是检查周围的点是否可以走
            map[i][j] = 2;
            // 按照找路策略，下-右-上-左
            if(findWay(map, i + 1, j)) { //先走下方
                return true;
            } else if (findWay(map, i, j + 1)) { //右
                return true;
            } else if (findWay(map, i - 1, j)) { //上
                return true;                
            } else if (findWay(map, i, j - 1)) {
                return true;
            } else {
                // 四个方向都走不通，则说明该点为死路，设置为走过但走不通的点3
                map[i][j] = 3;
                return false;
            }
        } else { //map[i][j] = 1,2,3,说明这个点已经测试过了，不能通行
            return false;
        }
    }
  }
}