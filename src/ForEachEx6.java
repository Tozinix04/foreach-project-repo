import java.util.Scanner;

public class ForEachEx6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vanzari;
        double vanzariTotal = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Introduce vanzarile pentru luna " + i + " : ");
            vanzari = scanner.nextDouble();

            vanzariTotal = vanzari + vanzariTotal;

        }
        System.out.println("Totalul de vanzari :  " + vanzariTotal);

    }
}
