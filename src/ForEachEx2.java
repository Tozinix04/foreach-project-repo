public class ForEachEx2 {
    public static void main(String[] args) {

        int nmax = 25;
        for(int n = 0; n < nmax; n++){
            if((n * n) >= nmax)
                break;
            System.out.println("n este egal cu " + n + " , n la patrat este egal cu " + n*n);
        }
        System.out.println("Sfarsitul buclei!");
    }
}
