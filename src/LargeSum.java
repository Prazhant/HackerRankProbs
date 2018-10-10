import java.util.stream.IntStream;

public class LargeSum {

    public static void main(String[] args) {
        int[] a = new int[]{};

        long sum = IntStream.of(a).asLongStream().sum();
        System.out.println("sum:"+sum);
    }
}
