package encap;

public class Account {
    public String name;
    private double cash;
    private String code;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度必须在2到4位！默认名为noname");
            this.name = "noname";
        }
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        if (cash > 20) {
            this.cash = cash;
        } else {
            System.out.println("余额必须大于20！默认余额为30！");
            this.cash = 30;
        }
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        if (code.length() == 6) {
            this.code = code;
        } else {
            System.out.println("密码长度必须为6位！默认密码为123456！");
            this.code = "123456";
        }
    }



}
