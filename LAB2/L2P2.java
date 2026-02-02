import java.util.Scanner;

class L2P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int choice = 0;
        int i = 1;

        outerwhile:
        while (i <= n) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println("If you want to continue press 1 otherwise 0");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    break outerwhile;
                case 1:
                    i++;
                    continue outerwhile;
                default:
                    System.out.println("Invalid choice");
                    break outerwhile;
            }
        }
    }
}