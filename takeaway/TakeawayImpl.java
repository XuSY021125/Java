package Takeaway;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeawayImpl implements TakeawaySerice{
    private ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Food> foods = new ArrayList<>();
    private ArrayList<Food> shoppingCar = new ArrayList<>();
    static {
        Food food1 = new Food("红烧肉",18);
        foods.add(food1);

        Food food2 = new Food("土豆抄牛肉", 25);
        foods.add(food2);

        Food food3 = new Food("干锅牛蛙", 35);
        foods.add(food3);
    }
    public void rigister(User user) {
        System.out.println("请输入您的手机号：");
        Scanner in = new Scanner(System.in);
        String account;

        boolean flag;
        boolean flag1;
        while (true) {
            flag = true;
            account = in.next();

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getAccount() == account){
                    flag = false;
                    break;
                }
            }

            if (flag == false){
                System.out.println("输入的账号已存在,请重新输入：");
            } else {
                break;
            }
        }

        while (true) {
            flag1 = true;
            for (int i = 0; i < account.length(); i++) {
                if (account.charAt(i) < '0' && account.charAt(i) > '9'){
                    flag1 = false;
                    break;
                }
            }

            if (flag1 == false){
                System.out.println("输入的手机号应该为纯数字，请重新输入：");
                account = in.next();
            } else {
                break;
            }
        }

        System.out.println("请设置密码，密码只能包含数字或字母：");
        String password;
        boolean flag2 = false;;

        while (true) {
            password = in.next();
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                    flag2 = true;
                }
                else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z'
                        || password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                    flag2 = true;
                }
                else {
                    break;
                }
            }

            if (flag2 == false){
                System.out.println("输入错误,密码只能包含数字或字母，请重新输入：");
            } else {
                break;
            }
        }

        if (flag1 == true && flag2 == true){
            System.out.println("注册成功！");
            user.setAccount(account);
            user.setPassword(password);
            users.add(user);
        }
    }

    public void logIn() {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入账号：");
        String account = in.next();;
        System.out.println("请输入密码：");
        String password = in.next();

        boolean accountFlag = false;
        boolean passwordFlag = false;
        int i;
        for (i =0; i < users.size(); i++) {
            if (!account.equals(users.get(i).getAccount())) {
                System.out.println("登陆失败，账号错误");
            }else {
                accountFlag = true;
                if (!password.equals(users.get(i).getPassword())){
                    System.out.println("登陆失败，密码错误");
                }else {
                    passwordFlag =  true;
                    break;
                }
            }
        }

        if (accountFlag && passwordFlag){
            System.out.println("*****登陆成功*****");
            while (true){
                printHomePage();
                int choice = in.nextInt();
                if (choice == 1){
                    orderDishes(users.get(i));
                }
                else if (choice == 2){
                    order(users.get(i));
                }
                else if (choice == 3){
                    queryData(users.get(i));
                }
                else if (choice == 4){
                    break;
                }
            }
        } else {
            System.out.println("————登陆失败————");
        }
    }

    public void logOut(){
        System.out.println("————Good Bye————");
    }

    public void print(){
        System.out.println("******************************");
        System.out.println("1:注册");
        System.out.println("2:登录");
        System.out.println("3:退出登录");
        System.out.println("——————————————————————————————");
        System.out.println("请选择操作：");
    }
    public void printHomePage(){
        System.out.println("******************************");
        System.out.println("1:选择菜品");
        System.out.println("2:查询订单");
        System.out.println("3:查询余额");
        System.out.println("4:返回上一级");
        System.out.println("——————————————————————————————");
        System.out.println("请选择操作：");
    }

    public void printMenu() {
        System.out.println("***********商品列表***********");
        System.out.println("名称     价格     ");
        for (int i = 0; i < foods.size(); i++)
        {
            System.out.printf(i + " " + "%-8s%-8.1f\n" ,foods.get(i).getName(),foods.get(i).getPrice());
        }
        System.out.println("******************************");
        System.out.println("1：添加菜品到购物车");
        System.out.println("2：删除购物车的菜品");
        System.out.println("其他任意键返回上一级");
        System.out.println("——————————————————————————————");
    }

    public void printShoppingCar(){
        for (int i = 0; i < shoppingCar.size(); i++)
        {
            System.out.printf(i + " " + "%-8s%-8.1f\n" ,shoppingCar.get(i).getName(),shoppingCar.get(i).getPrice());
        }
        System.out.println("******************************");
    }

    public void orderDishes(User user) {
        Scanner in = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.println("请选择操作；");
            int choice = in.nextInt();
            if (choice == 1){
                addShoppingCar(user);
            }
            else if (choice == 2){
                deleteShopingCar(user);
            }
            else {
                System.out.println("成功返回上一级");
                break;
            }
        }
    }

    public void addShoppingCar(User user) {
        System.out.println("请根据序号选择要添加的菜品,如需返回请按其他任意键：");
        Scanner in = new Scanner(System.in);

        while (true) {
            int choice = in.nextInt();

            if (choice >=0 && choice < foods.size()) {
                shoppingCar.add(foods.get(choice));
                System.out.println("成功将" + foods.get(choice).getName() + "加入购物车");
                System.out.println("————当前购物车里的菜品————");
                printShoppingCar();
                System.out.println("继续添加，如需返回请按其他任意键：");
            } else {
                System.out.println("已返回上一级");
                System.out.println();
                break;
            }
        }
    }

    public void deleteShopingCar(User user) {
        System.out.println("————请从当前购物车中选择要删除的菜品,如需返回请按其他任意键：————");
        printShoppingCar();

        Scanner in = new Scanner(System.in);
        while (true) {
            int choice = in.nextInt();
            if (choice >=0 && choice < shoppingCar.size()) {
                System.out.println("————成功将" + shoppingCar.get(choice).getName() + "移出购物车————");
                shoppingCar.remove(choice);
                printShoppingCar();
                System.out.println("继续删除，如需返回请按其他任意键：");
            } else {
                printShoppingCar();
                System.out.println("已返回上一级");
                break;
            }
        }
    }

    public void order(User user){
        Scanner in = new Scanner(System.in);

        double totalMoney = 0;
        for (Food food : shoppingCar) {
            totalMoney += food.getPrice();
        }

        boolean flag = false; //用来判断是否有订单存在
        while (true) {
            System.out.println("——————————————————————————————");
            System.out.println("1:下单");
            System.out.println("2:取消订单");
            System.out.println("按其他任意键返回上一级");
            int choice = in.nextInt();
            if (choice == 1) {
                flag = placeOrder(user, totalMoney);
            }
            else if (choice == 2 && flag == true){
                cancelOrder(user, totalMoney);
                flag = false;
            }
            else if (choice == 2 && flag == false){
                System.out.println("————没有订单存在————");
            }
            else {
                System.out.println("已返回上一级");
                break;
            }
        }
    }

    public boolean placeOrder(User user, double totalMoney) {
        if (shoppingCar.size() > 0){
            if (user.getBanlance() > totalMoney){
                System.out.println("————已成功下单————");
                user.setBanlance(user.getBanlance() - totalMoney);
                return true;
            } else {
                System.out.println("————余额不足，下单失败————");
                return false;
            }
        }else {
            System.out.println("—————购物车是空的————");
            return false;
        }
    }

    public void cancelOrder(User user, double totalMoney) {
        user.setBanlance(user.getBanlance() + totalMoney);
        System.out.println("————已取消订单————");
    }

    public void queryData(User user){
        System.out.println("——————————————————————————————");
        System.out.println("姓名：" + user.getName());
        System.out.println("账号：" + user.getAccount());
        System.out.println("密码：" + user.getPassword());
        System.out.println("账户余额：" + user.getBanlance());
        System.out.println("——————————————————————————————");
        System.out.println("按任意键返回上一级");
        Scanner in = new Scanner(System.in);
        String input = in.next();
    }

}
