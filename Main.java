import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<Integer> a = new ArrayList<>();
        // a.add(1);
        // a.add(2);
        // a.add(3);
        // a.add(4);
        // a.add(5);
        System.out.println(main.aLSum(a));
    }

    public int aLSum(ArrayList<Integer> a) {
        if (a == null) {
            throw new IllegalArgumentException("Arraylist is null");
        }

        if (a.isEmpty()) {
            return 0;
        }

        return a.removeFirst() + aLSum(a);
    }
}
