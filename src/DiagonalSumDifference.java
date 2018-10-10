public class DiagonalSumDifference {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0]=1;
        arr[1][0]=2;
        arr[2][0]=3;
        arr[0][1]=4;
        arr[1][1]=5;
        arr[2][1]=6;
        arr[0][2]=9;
        arr[1][2]=8;
        arr[2][2]=9;

        int sum=0;
        int newSum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i][i];
        }

        System.out.println("sum: "+sum);

        int maxXaxis =         0;
        for(int j=arr[arr.length-1].length-1; j>=0; j--){
            newSum=newSum+arr[maxXaxis][j];
            maxXaxis= maxXaxis+1;
        }
         System.out.println("newSum: "+Math.abs(sum -newSum));

    }
}
