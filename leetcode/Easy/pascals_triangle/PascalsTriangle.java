import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PascalsTriangle {

    public static void main(String args[]) {
        System.out.println("pascal's triangle is " + generate(5));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows < 1) {
            return result;
        }

        // row 1
        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = result.get(i - 1);
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);

            for (int j = 1; j < pre.size(); j++) {
                row.add(pre.get(j - 1) + pre.get(j));
            }

            row.add(1);
            result.add(row);
        }

        return result;
    }

    // private static List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> result = new ArrayList<List<Integer>>();
    //     if (numRows < 0) {
    //         return result;
    //     }
    //
    //     List<Integer> row = new ArrayList<Integer>();
    //
    //     for (int i = 0; i < numRows; i++) {
    //         row.add(0, 1);
    //
    //         // sample:
    //         // row 3 initial value: [1, 1, 1]
    //         // row 4 initial value: [1, 1, 2, 1]
    //         // row 5 initial value: [1, 1, 3, 3, 1]
    //         for (int j = 1; j < row.size() - 1; j++) {
    //             row.set(j, row.get(j) + row.get(j + 1));
    //         }
    //
    //         result.add(new ArrayList<Integer>(row));
    //     }
    //
    //     return result;
    // }
}
