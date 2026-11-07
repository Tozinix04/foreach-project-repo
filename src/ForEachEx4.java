public class ForEachEx4 {
    public static void main(String[] args) {

        int i;
        for ( i = 0; i < 1000; i++) {
            System.out.println(i);
        } i+=200;
        System.out.println(i);

        /* fara initiere
        int j = 0;
        for(; j < 10; j++){
            System.out.println(j);
        */

        /* mai multe contoare
        for(int i = 1, j = 3; i < 5 & j > 0; i++, j--){
            System.out.println("i = " + i + ", j = " + j);
        }
            */
        /*
        int[] numbers = new int[] { 3, 2, 1 };

        for (int number : numbers) {
            System.out.print(number + " ");
        } */
        }
    }
