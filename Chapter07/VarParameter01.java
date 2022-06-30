package Chapter07;

public class VarParameter01 {
    public static void main(String[] args) {
        VarParameterMethods methods = new VarParameterMethods();
        int res = methods.sum(1,2,3);
        System.out.println(res);
    }
}

// todo:可变参数
// int... 表示可以接受0到多个int类型的参数
// nums可以当做数组来使用
class VarParameterMethods {
    public int sum(int... nums){

        System.out.println("接收的参数个数为：" + nums.length);
        // 数组计算求和，自然是使用循环方法
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;

    }
}
