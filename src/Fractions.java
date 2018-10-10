import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Fractions {

    public static void main(String[] args) {
        AtomicInteger countPositive=new AtomicInteger();
        AtomicInteger countNegative = new AtomicInteger();
        AtomicInteger countZeros = new AtomicInteger();
        AtomicInteger countTotal = new AtomicInteger();


        int[] arr = {-1,-1,0,1,1};
        Arrays.stream(arr).forEach(x->{
            if(x>0){
                countPositive.getAndIncrement();
            } else if(x==0){
                countZeros.getAndIncrement();
            }else{
                countNegative.getAndIncrement();
            }
            countTotal.getAndIncrement();
        });

        System.out.println(new BigDecimal(countPositive.doubleValue()/countTotal.doubleValue()).setScale(6,BigDecimal.ROUND_HALF_EVEN));
        System.out.println(new BigDecimal(countNegative.doubleValue()/countTotal.doubleValue()).setScale(6,BigDecimal.ROUND_HALF_EVEN));
        System.out.println(new BigDecimal(countZeros.doubleValue()/countTotal.doubleValue()).setScale(6,BigDecimal.ROUND_HALF_EVEN));
    }
}
