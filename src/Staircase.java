public class Staircase {
    public static void main(String[] args) {
        int n = 6;


        StringBuilder sb = new StringBuilder();
        for(int i=n-1 ; i>-1;i--){
            sb.append(new String(new char[i]).replace("\0"," "));
            sb.append(new String(new char[n-i]).replace("\0","#"));
            if(i!=0){
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }

}
