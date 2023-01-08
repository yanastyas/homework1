public class Main {
    public static void main(String[] args) {
        long price[] = {150, 300, 250, 600, 200, 2_000, 6_000, 500, 70_000};
        SalesManager SalesManager = new SalesManager(price);

        System.out.println("Sale max = " + (SalesManager.max()));

        System.out.println("Sale min = " + (SalesManager.min()));

        System.out.println("Sale stat = " + (SalesManager.stat()));

    }
}
