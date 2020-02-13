package snackBarApp;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** SnackBar App ***");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Chocolate", 36, 1.00, 1);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
        Snack s4 = new Snack("Soda", 24, 2.50, 2);
        Snack s5 = new Snack("Water", 20, 2.75, 2);

        System.out.println();

        c1.setCash(c1.getCash() - (3 * s4.getCost()));
        s4.setQuantity(s4.getQuantity() - 3);
        System.out.println("(Jane) buys 3 of snack 4 (Soda).");
        System.out.println("Janes cash on hand: " + c1.getCash());
        System.out.println("left Soda " + s4.getQuantity());

        System.out.println();

        c1.setCash(c1.getCash() - s3.getCost());
        s3.setQuantity(s3.getQuantity() - 1);
        System.out.println("(Jane) buys 1 of snack 3 (Pretzel).");
        System.out.println("Janes cash on hand: " + c1.getCash());
        System.out.println("left Pretzel: " + s3.getQuantity());

        System.out.println();

        c2.setCash(c2.getCash() - (2 * s4.getCost()));
        s4.setQuantity(s4.getQuantity() - 2);
        System.out.println("(Bob) buys 2 of snack 4 (Sode).");
        System.out.println("Bobs cash on hand: " + c2.getCash());
        System.out.println("left soda: " + s4.getQuantity());

        System.out.println();

        c1.setCash(c1.getCash() + 10);
        System.out.println("(Jane) finds $10.");
        System.out.println("Janses cash: " + c1.getCash());

        System.out.println();

        c1.setCash(c1.getCash() - s2.getCost());
        s2.setQuantity(s2.getQuantity() - 1);
        System.out.println("(Jane) buys 1 of snack 2 (Chocolate Bar).");
        System.out.println("Janes cash on hand: " + c1.getCash());
        System.out.println("Chocolate bar left: " + s2.getQuantity());

        System.out.println();

        s3.setQuantity(s3.getQuantity() + 12);
        System.out.println("Add 12 more items to snack 3 (Pretzel).");
        System.out.println("Pretzel left: " + s3.getQuantity());

        System.out.println();

        c2.setCash(c2.getCash() - (3 * s3.getCost()));
        s3.setQuantity(s3.getQuantity() - 3);
        System.out.println("(Bob) buys 3 of snack 3 (Pretzel).");
        System.out.println("Bobs cash on hand: " + c2.getCash());
        System.out.println("Pretzel left: " + s3.getQuantity());
    }
}