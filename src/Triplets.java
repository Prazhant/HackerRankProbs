import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Triplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList(2){{this.add(0);this.add(0);}};
        IntStream.range(0,a.size())
                .forEach(i->{if(a.get(i)>b.get(i)){
                    result.set(0,result.get(0)+1);
                } else if(a.get(i)<b.get(i)){
                    result.set(1,result.get(1)+1);
                }});
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> a = Arrays.asList(10,11,32);

        List<Integer> b = Arrays.asList(99,12,10);

        List<Integer> result = compareTriplets(a, b);

       result.forEach(System.out::println);


        bufferedReader.close();

    }
}
