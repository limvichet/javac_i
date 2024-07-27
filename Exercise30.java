public class Exercise30 {
    private static String[] cofId = new String[5];
    private static String[] cofType = new String[5];
    private static String[] cofItem = new String[5];
    private static double[] cofPrice = new double[5];

    public static void main(String[] args) {
        showListCoffee();
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

    public static void showListCoffee() {
        coffee();

        System.out.println("\n\nItem Coffee(s)=================================================");
        System.out.println("===============================================================");

        System.out.println("     No.   |      Item        |      Type    |      Price      ");
        System.out.println("---------------------------------------------------------------");

        for (int x = 0; x < 5; x++) {
            System.out.printf("     %-5s     %-15s    %-10s    $ %.2f%n", cofId[x], cofItem[x], cofType[x], cofPrice[x]);
        }

        System.out.println("\n");
    }
}

