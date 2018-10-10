import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Candles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] arr) {
        int count=1;
       PriorityQueue queue = new PriorityQueue(arr.length,Collections.reverseOrder());
       for(int i=0;i<arr.length;i++){
           queue.add(arr[i]);
       }

        boolean continueLoop=true;
        int topElement = (int)queue.remove();
        do{
            int currentElement = (int)queue.remove();
            if(topElement == currentElement){
                count++;
            } else{
                continueLoop=false;
            }


        }while(continueLoop);

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("input.txt"));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        System.out.println("result: "+result);

        scanner.close();
    }
}
