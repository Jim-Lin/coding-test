import java.util.List;
import java.util.LinkedList;

public class Q483 {

// 1 2 3 4 5 6 7 8 9 10  index: (0 + 3) % 10 = 3  val: 4
// 1 2 3   5 6 7 8 9 10  index: (3 + 3) % 9  = 6  val: 8
// 1 2 3   5 6 7   9 10  index: (6 + 3) % 8  = 1  val: 2
// 1   3   5 6 7   9 10  index: (1 + 3) % 7  = 4  val: 7
// 1   3   5 6     9 10  ...
// 1       5 6     9 10
// 1       5 6     9

    public static void main(String args[]) {
        System.out.println(josephus(10, 4));
    }

    private static Integer josephus(int n, int k) {
        List<Integer> numbers = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            numbers.add(i + 1);
        }
        
        int index = 0;
        Integer result = null;
        while (numbers.size() > 0) {
            index = (index + (k - 1)) % numbers.size();
            result = numbers.remove(index);
        }

        return result;
    }
}
