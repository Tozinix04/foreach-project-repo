public class ForEachEx3 {
    public static void main(String[] args) {

        for(int a = 0; a <= 10; a++){
            if(a % 2 == 0)
                continue; //% returneaza restul la impartire
            System.out.println(a);
        }
    }
}
