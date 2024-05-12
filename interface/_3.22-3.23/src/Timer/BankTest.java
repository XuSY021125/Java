package Timer;
//游乐园买票场景
//外卖
//能够将继承、反射、接口的概念和特征用大白话讲出来
public class BankTest {
    public static void main(String[] args) {
        User user = new User("350925", "1234", 0);
        user.setMoney(5000);
        user.getMoney(2000);
        System.out.println(user.getBanlance());
        user.getMoney(10000);

        user.setId();
        System.out.println();

    }
}
