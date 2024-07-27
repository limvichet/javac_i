import java.util.Scanner;

public class Exercise32 {
    static String[] cofId = new String[5];
    static String[] cofType = new String[5];
    static String[] cofItem = new String[5];
    static double[] cofPrice = new double[5];

    static char cont;
    static int x;
    static int q;
    static String[] orderItemId = new String[6];
    static String[] orderItem = new String[6];
    static double[] orderPrice = new double[6];
    static double[] orderQty = new double[6];
    static double[] SubTotalPrice = new double[6];
    static double TotalPrice;

    public static void main(String[] args) {
        orderCoffee();
    }

    static void coffee() {
        cofId[0] = "001";
        cofItem[0] = "Amaricano.";
        cofType[0] = "Coffee";
        cofPrice[0] = 1.5;

        cofId[1] = "002";
        cofItem[1] = "Late.     ";
        cofType[1] = "Coffee";
        cofPrice[1] = 1.8;

        cofId[2] = "003";
        cofItem[2] = "Capusino. ";
        cofType[2] = "Coffee";
        cofPrice[2] = 2.3;

        cofId[3] = "004";
        cofItem[3] = "Green Tee.";
        cofType[3] = "Tea   ";
        cofPrice[3] = 1.5;

        cofId[4] = "006";
        cofItem[4] = "Honey Tee.";
        cofType[4] = "Tea   ";
        cofPrice[4] = 1.5;
    }

    static void orderCoffee() {
        coffee();

        Scanner scanner = new Scanner(System.in);
        cont = 'y';
        do {
            System.out.print("\t\t\t\t\tEnter Coffee item number to order: ");
            x = scanner.nextInt();
            System.out.println("\n\t\t\t\t\tYou order Item. \n\t\t\t\t\t" + cofItem[x - 1] + "\n\t\t\t\t\tEnter Qty: ");
            q = scanner.nextInt();

            orderItemId[x] = cofId[x - 1];
            orderItem[x] = cofItem[x - 1];
            orderPrice[x] = cofPrice[x - 1];
            orderQty[x] = q;
            SubTotalPrice[x] = orderPrice[x] * orderQty[x];

            System.out.println("\n\t\t\t\t\tPress key 'n' to create invoice (enter to continue): ");
            cont = scanner.next().charAt(0);
        } while (cont != 'n');
        createInvoice();
    }

    static void createInvoice() {
        System.out.println("Order Item Coffee(s)===============================================================");
        System.out.println("===================================================================================");

        System.out.println("     No.   |   Item          |    Price  |    QTY    |   SubTotal      ");
        System.out.println("-----------------------------------------------------------------------------------");

        TotalPrice = 0;
        int counter = 0;
        for (int x = 0; x < 5; x++) {
            if (orderItemId[x] != null) {
                counter++;
                System.out.print("     " + counter + "     ");
                System.out.print("     " + orderItem[x] + "    ");
                System.out.print("    $" + orderPrice[x] + "    ");
                System.out.print("     " + orderQty[x] + "    ");
                System.out.println("      $" + SubTotalPrice[x] + "    ");
                TotalPrice += SubTotalPrice[x];
            }
        }
        System.out.println("-----  Total  -----------------------------------------   $" + TotalPrice);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}


