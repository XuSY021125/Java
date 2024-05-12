package Ticket;

public interface AmusementPark {

    boolean buyExtrancePark(Tourist tourist);

    void getAmusementParkInfo();

    String queryEntertainmentInfo();

    void orderEntertainment(Tourist tourist);

    void cancelOrder(Tourist tourist);
}
