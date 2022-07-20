package encap;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("sun");
        a.setCash(100);
        a.setCode("181818");
        System.out.println(a.getName() + "的账户信息如下：");
        System.out.println("余额为：" + a.getCash());
        System.out.println("密码为：" + a.getCode());
    }
}
