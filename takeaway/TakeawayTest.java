package Takeaway;

import java.util.Scanner;

public class TakeawayTest {
    public static void main(String[] args) {
        TakeawayImpl takeaway = new TakeawayImpl();
        User user1 = new User("Tom", 300);

        Scanner in = new Scanner(System.in);
        int choice;
        while (true)
        {
            takeaway.print();
            choice = in.nextInt();
            if (choice == 1)
            {
                takeaway.rigister(user1);
            }
            else if (choice == 2)
            {
                takeaway.logIn();
            }
            else if (choice == 3)
            {
                takeaway.logOut();
                break;
            }

//            switch (choice){
//                case 1:
//                    takeaway.rigister(user1);
//                    break;
//                case 2:
//                    takeaway.logIn();
//                    break;
//                case 3:
//                    takeaway.logOut();
//                    break;
//                default:
//                    System.out.println("");
//        }
        }
        System.out.println(user1);
    }
}