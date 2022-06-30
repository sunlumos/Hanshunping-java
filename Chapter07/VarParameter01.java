package Chapter07;

public class VarParameter01 {
    public static void main(String[] args) {
        VarParameterMethods methods = new VarParameterMethods();
        int res = methods.sum(1,2,3);
        System.out.println(res);
        int arr[] = {2,3,4};
        // 可以直接传入数组进去
        System.out.println(methods.sum(arr));
    }
}

// todo:可变参数
// int... 表示可以接受0到多个int类型的参数
// nums可以当做数组来使用
// 可变参数的实参可以为数组，实参：传进去的参数
// 可变参数的本质就是数组
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
    // ! 可变参数可以和普通参数一起放在形参列表，但必须放在最后
    public void f1(int num1, int... num2){

    }

// 一个形参列表中只能出现一个可变参数,下面的是错误的
    // public void f2(int... num1,int... num2){
    // }

}
