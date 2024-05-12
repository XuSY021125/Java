package Timer;
//存款 取款 修改用户信息（金额，密码，Id）
public interface Bank {
    void setMoney(double money);

    double getMoney(double money);

    void setPassword();

    void setId();
}
