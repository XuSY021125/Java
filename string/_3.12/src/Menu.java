import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("请选择您需要的菜品：");
            int choice = in.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("红烧肉");
                    break;
                case 2:
                    System.out.println("土豆炒牛肉");
                    break;
                case 3:
                    System.out.println("炒猪腰");
                    break;
                case 4:
                    System.out.println("蒜香小龙虾");
                    break;
                default:
                    System.out.println("结束选菜");
                    flag = false;
                    break;
            }
        }
    }
}
