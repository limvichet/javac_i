import java.util.Scanner;

public class Exercise31 {
    static String[] cofId = new String[5];
    static String[] cofType = new String[5];
    static String[] cofItem = new String[5];
    static double[] cofPrice = new double[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type;
        System.out.print("\t\t\t\t\tEnter type of drinks . (tea or coffee)  : ");
        type = scanner.nextLine();
        if (type.equals("coffee")) {
            typeCoffee("Coffee");
        } else {
            typeCoffee("Tea   ");
        }
        scanner.close();
    }

    public static void coffee() {
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

    public static void typeCoffee(String s) {
        // method coffee
        coffee();
        System.out.println("\t\t\t\tItem Coffee(s)=================================================");
        System.out.println("\t\t\t\t===============================================================");

        System.out.println("\t\t\t\t     No.   |      Item        |      Type    |      Price      ");
        System.out.println("\t\t\t\t---------------------------------------------------------------");

        for (int x = 0; x < 5; x++) {
            if (cofType[x].equals(s)) {
                System.out.print("\t\t\t\t     " + cofId[x] + "     ");
                System.out.print("     " + cofItem[x] + "    ");
                System.out.print("     " + cofType[x] + "    ");
                System.out.println("    $ " + cofPrice[x]);
            }
        }
    }
}



