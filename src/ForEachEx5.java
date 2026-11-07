import java.util.ArrayList;
import java.util.List;

public class ForEachEx5 {
    public static void main(String[] args) {

                List<Integer> lists = new ArrayList<Integer>();

                lists.add(1);
                lists.add(3);

                for (Integer value : lists) {
                    System.out.println(value);
                }
            }
        }

