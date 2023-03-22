package L07.exercise2;

import java.util.*;

public class RunningMinMaxProduct {

    public static List<Integer> runningMax(Iterable<Integer> iters) {
        List<Integer> output = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;
        Iterator<Integer> integerIterator = iters.iterator();
        while (integerIterator.hasNext()) {
            int currentValiue = integerIterator.next();
            maxValue = Math.max(maxValue, currentValiue);
            output.add(maxValue);
        }
        return output;
    }

    public static List<Integer> runningMin(Iterable<Integer> iters) {
        List<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Iterator<Integer> iter = iters.iterator();
        while (iter.hasNext()) {
            int i = iter.next();
            min = Math.min(min, i);
            result.add(min);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 5, 7, 2, 6, 14, 10, 16, 15, 13, 11, 9);
        List<Integer> result = runningMax(list);
        System.out.println("Running maximum value of a list:");
        for (int i : result) {
            System.out.println(i);
        }


        list = Arrays.asList(10, 11, 5, 7, 2, 6, 14, 11, 2, 15, 1, 11, 9);
        result = runningMin(list);
        System.out.println("Running minimum value of a list:");
        for (int i : result) {
            System.out.println(i);
        }
    }
}
