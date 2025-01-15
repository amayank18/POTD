package Week4.DAY24;

import java.util.ArrayList;
import java.util.Collections;

public class medianInRowWiseSortedMatrix {
    static int median(int[][] mat) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                list.add(mat[i][j]);
            }
        }
        int n = list.size();
        Collections.sort(list);
        System.out.println(list);
        if (n % 2 != 0)
            return list.get(n/2);

        else
            return (list.get(n / 2) + list.get((n + 1) / 2)) / 2;
    }

    public static void main(String[] args) {
        int[][] mat={
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };
//        int[][] mat={
//                {1, 3, 5, 10},
//                {2, 6, 9, 11},
//                {3, 6, 9, 12}
//        };
        System.out.println(median(mat));
    }
}
