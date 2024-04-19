package Practice;

import java.util.Arrays;
import java.util.List;

public class Stream30thJan {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 1, 42, 67, 9, 2, 6, 23, 72, 99);
//        nums.forEach(n -> System.out.println(n * n)); //also works
//        Stream<Integer> data = nums.stream(); //Stream only can be used once
//        long cnt = data.count();
//        System.out.println(cnt);
//        data.forEach(n -> System.out.println(n));

//        RETURN DOUBLE OF SQUARE VALUE
        nums.stream()
                .filter(n -> n % 2 == 1) //filters out only odd value
                .sorted()
                .map(x -> x * x)
                .forEach(x -> System.out.println(2 * x));

        //        RETURN SUM OF SQUARES LESS THAN 40 VALUES
        int res = nums.stream()
                .filter(n -> n < 40) //filters out only odd value
                .map(x -> x * x)
                .reduce(0, (c, e) -> c + e);
        System.out.println(res);


    }
}