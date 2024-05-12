package Takeaway;

public interface TakeawaySerice {
    void rigister(User user);

    void logIn();

    void logOut();

    void print();

    void printHomePage();

    void printMenu();

    void printShoppingCar();

    void orderDishes(User user);

    void addShoppingCar(User user);

    void deleteShopingCar(User user);

    void order(User user);

    boolean placeOrder(User user, double totalMoney);

    void cancelOrder(User user, double totalMoney);

    void queryData(User user);
}
