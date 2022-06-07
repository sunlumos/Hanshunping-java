package Chapter04;

public class LogicOperator01 {
    public static void main(String[] args) {
        // && 和 &  短路&而言，如果第一个条件为假，后面直接不执行
        // 逻辑&，第一个为假，后面还是要z执行
        int age = 50;
        if(age > 20 && age < 30){
            System.out.println("OK");
        }
        // \\和\也是一样的，短路的效率高，实际开发基本都是短路操作
    }
}
