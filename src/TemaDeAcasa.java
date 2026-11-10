import java.util.Scanner;

public class TemaDeAcasa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String raspuns;

        System.out.println("---------------------");
        System.out.printf("Alege exercitiul (2,3,4,5,6) : ");
        int optiune = scanner.nextInt();


        if(optiune == 2){
            System.out.println("---------------------");
            System.out.println("Ex 2 :");
            for (int i = 10; i < 20; i++) {
                System.out.println(i);
                if(i == 15)
                    break;
            }
        }else if(optiune == 3){
            System.out.println("---------------------");
            System.out.println("Ex 3 :");
            for(int i = 10; i < 20 ; i++) {
                if (i % 2 != 0 || i == 16)
                    continue;
                System.out.println(i);
            }
        }else if(optiune == 4){
            System.out.println("---------------------");
            System.out.println("Ex 4 :");

            System.out.printf("Introduce un numar : ");
            int numar = scanner.nextInt();

            if(numar < 0){
                System.out.println("Numar negativ!");
            }else{
                System.out.println("Numar pozitiv!");
            }

        }else if(optiune == 5){
            System.out.println("---------------------");
            System.out.println("Ex 5 :");

            System.out.print("Introduceți primul numar : ");
            int a = scanner.nextInt();
            System.out.print("Introduceți al doilea numar : ");
            int b = scanner.nextInt();
            System.out.println("---------------------");
            if (a > 0) {
                System.out.println("Primul numar este pozitiv.");
            } else if (a < 0) {
                System.out.println("Primul numar este negativ.");
            } else {
                System.out.println("Primul numar este zero.");
            }
            System.out.println("---------------------");
            if (b > 0) {
                System.out.println("Al doilea numar este pozitiv.");
            } else if (b < 0) {
                System.out.println("Al doilea numar este negativ.");
            } else {
                System.out.println("Al doilea numar este zero.");
            }
            System.out.println("---------------------");

        }else if(optiune == 6){
            System.out.println("Ex 6 :");
            System.out.println("---------------------");

            do {
                System.out.print("Introduceti primul numar : ");
                double c = scanner.nextDouble();
                System.out.print("Introduceti al doilea numar : ");
                double d = scanner.nextDouble();

                System.out.println("---------------------");
                System.out.println("Suma este : " + (c + d));
                System.out.println("---------------------");

                System.out.println("REPETAM ? (DA/NU) ");
                raspuns = scanner.next();
                System.out.println("---------------------");
            } while (raspuns.equalsIgnoreCase("da"));

            System.out.println("Program oprit!.");

        }else{
            System.out.println("---------------------");
            System.out.println("Exercitiu nu exista!");
        }


    }
}
