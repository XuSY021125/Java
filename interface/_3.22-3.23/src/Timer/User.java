package Timer;

import java.util.Scanner;

public class User implements Bank{
    private String Id;
    private String password;
    private double banlance;

    public User(String Id, String password, double banlance){
        this.Id = Id;
        this.password = password;
        this.banlance = banlance;
    }

    public double getBanlance(){
        return banlance;
    }
    @Override
    public void setMoney(double money) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入Id号：");
        String Id = in.next();
        if (this.Id.equals(Id)) {
            this.banlance += money;
            System.out.println("存款成功，您的账户余额为：" + banlance);
        } else {
            System.out.println("存款失败，您输入的Id号不存在");
        }
    }

    @Override
    public double getMoney(double money) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入密码：");
        String password = in.next();
        if (this.password.equals(password)){
            if (banlance >= money){
                banlance -= money;
                System.out.println("取款成功");
            }else {
                System.out.println("取款失败，当前账户余额不足");
            }
        }else {
            System.out.println("密码错误");
        }
        return money;
    }

    @Override
    public void setPassword() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入想要设置的密码：");
        password = in.next();
    }

    @Override
    public void setId() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入新的Id：");
        Id = in.next();
    }
}
