package Ticket;

public class TourTest {
    public static void main(String[] args) {
        Tourist tourist1 = new Tourist("Tom", 500);

        AmusementParkInfo amusementParkInfo = new AmusementParkInfo();
        System.out.println(amusementParkInfo.queryEntertainmentInfo());
        System.out.println();

        amusementParkInfo.buyExtrancePark(tourist1);
        System.out.println("余额" + tourist1.getBanlance());
        System.out.println();

        amusementParkInfo.getAmusementParkInfo();
        System.out.println();
        amusementParkInfo.orderEntertainment(tourist1);
        System.out.println(tourist1);
        System.out.println();

        amusementParkInfo.cancelOrder(tourist1);
        System.out.println(tourist1);
    }
}
