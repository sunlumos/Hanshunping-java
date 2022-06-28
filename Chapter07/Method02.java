package Chapter07;

public class Method02 {
    public static void main(String[] args) {
        
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
        myTools tool = new myTools();
        tool.printArr(map);
    }
}

// 把输出的功能，写到一个方法中去
class myTools{
    public void printArr(int[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
