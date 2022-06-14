package Chapter05;

public class While01 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            System.out.println("你好" + i);
            i++;
        }
    }
}

class While01Q1{
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}

class While01Q2{
    public static void main(String[] args) {
        int i = 40;
        while (i <= 200) {
            if(i % 2 == 0 ){
                System.out.println(i);
            }
            i++;
        }
    }
}