package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourGlassArrays {

    static int hourglassSums(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                int hourGlassSum = 0;
                hourGlassSum += arr.get(i).get(j);
                hourGlassSum += arr.get(i).get(j + 1);
                hourGlassSum += arr.get(i).get(j + 2);

                hourGlassSum += arr.get(i + 1).get(j + 1);

                hourGlassSum += arr.get(i + 2).get(j);
                hourGlassSum += arr.get(i + 2).get(j + 1);
                hourGlassSum += arr.get(i + 2).get(j + 2);

                if (hourGlassSum > maxSum) {
                    maxSum = hourGlassSum;
                }
            }
        }
        return maxSum;
}

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> element1 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> element2 = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> element3 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> element4 = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> element5 = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> element6 = Arrays.asList(0, 0, 1, 2, 4, 0);
        arr.add(0, element1);
        arr.add(1, element2);
        arr.add(2, element3);
        arr.add(3, element4);
        arr.add(4, element5);
        arr.add(5, element6);

        int result = hourglassSums(arr);

        System.out.println(result);
    }
}
