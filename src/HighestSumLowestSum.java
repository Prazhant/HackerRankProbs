import java.math.BigInteger;
import java.util.Arrays;

public class HighestSumLowestSum {
    public static void main(String[] args) {
        int[] arr= {1000000000,1200000000,1300000000,1400000000,500000000};

        Arrays.sort(arr);
        BigInteger maxSum = BigInteger.valueOf(arr[arr.length-1]).add(BigInteger.valueOf(arr[arr.length-2])).add(BigInteger.valueOf(arr[arr.length-3])).add(BigInteger.valueOf(arr[arr.length-4]));
        BigInteger minSum= BigInteger.valueOf(arr[0]).add(BigInteger.valueOf(arr[1])).add(BigInteger.valueOf(arr[2])).add(BigInteger.valueOf(arr[3]));
        System.out.println(minSum+" "+maxSum);
    }
}
