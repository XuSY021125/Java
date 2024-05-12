package Ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class AmusementParkInfo implements AmusementPark {
    private static double ticketPrice = 100;
    private static ArrayList<Entertainment> entertainments = new ArrayList<>();

    static {
        Entertainment entertainment1 = new Entertainment();
        entertainment1.setName("旋转木马");
        entertainment1.setPrice(50);
        entertainments.add(entertainment1);

        Entertainment entertainment2 = new Entertainment();
        entertainment2.setName("摩天轮");
        entertainment2.setPrice(100);
        entertainments.add(entertainment2);

        Entertainment entertainment3 = new Entertainment();
        entertainment3.setName("海盗船");
        entertainment3.setPrice(70);
        entertainments.add(entertainment3);

        Entertainment entertainment4 = new Entertainment();
        entertainment4.setName("过山车");
        entertainment4.setPrice(80);
        entertainments.add(entertainment4);

    }

    public boolean buyExtrancePark(Tourist tourist) {
        if (tourist.getBanlance() > ticketPrice){
            System.out.println(tourist.getName() + "成功购买入场票");
            double banlance = tourist.getBanlance() - ticketPrice;
            tourist.setBanlance(banlance);
            return true;
        }

        System.out.println("余额不足，购买失败");
        return false;
    }

    public void getAmusementParkInfo() {
        System.out.printf("%-15s%13s","名称","价格");
        System.out.println();
        System.out.printf("%-15s%15.2f%n","入场票", ticketPrice);

        for (int i = 0; i < entertainments.size(); i++) {
            System.out.printf("%-15s%15.2f%n", entertainments.get(i).getName() , entertainments.get(i).getPrice());
        }
    }

    public String queryEntertainmentInfo() {
        return entertainments.toString();
    }

    public void orderEntertainment(Tourist tourist) {
        for (int i = 0; i < entertainments.size(); i++) {
            System.out.printf(i + "  " + "%-12s%15.2f%n", entertainments.get(i).getName(), entertainments.get(i).getPrice());
        }
        System.out.println("请选择要预定的娱乐项目：");

        boolean flag = true;

        for (int i = 0; flag; i++) {
            if (i > 0) {
                System.out.println("如需退出选择请按选项之外的任意键");
            }

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            if (choice >= 0 && choice < entertainments.size()) {
                if (tourist.getBanlance() > entertainments.get(choice).getPrice()) {
                    System.out.println(tourist.getName() + "成功预定了娱乐项目：" + entertainments.get(choice).getName());

                    double banlance = tourist.getBanlance() - entertainments.get(choice).getPrice();
                    tourist.setBanlance(banlance);
                    tourist.setOrdered(entertainments.get(choice));

                    continue;
                } else {
                    System.out.println("余额不足，预定失败");
                    break;
                }
            }
            flag = false;
        }
    }

    public void cancelOrder(Tourist tourist) {
        boolean flag = true;

        for (int i = 0; flag; i++) {
            for (int j = 0; j < tourist.getOrdered().size(); j++) {
                System.out.println("已预定的娱乐项目有：" + j + " " + tourist.getOrdered().get(j));
            }
            System.out.println("请输入想要取消预定的娱乐项目的选项：");

            if (i > 0){
                System.out.println("如需退出选择请按选项之外的任意键");
            }

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            if (choice >= 0 && choice < tourist.getOrdered().size()){
                double banlance = tourist.getBanlance() + tourist.getOrdered().get(choice).getPrice();
                tourist.setBanlance(banlance);
                System.out.println("已取消预定娱乐项目：" + tourist.getOrdered().get(choice).getName());
                tourist.getOrdered().remove(choice);
                continue;
            }
            System.out.println("已退出选择");
            flag = false;
        }
    }
}