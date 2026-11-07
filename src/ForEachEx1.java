public class ForEachEx1 {
    static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if( i == 10) break; //terminam bucla daca i este 10
            System.out.println("i : " + i);

        }
        System.out.println("Bucla terminata!");
    }
}
