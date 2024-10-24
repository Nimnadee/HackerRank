import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        int arr[]=new int[num];

        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        double negative=0;
        double positive=0;
        double zero=0;
        for(int i=0;i<num;i++){
            if(arr[i]<0){
                negative=negative+1;
            } else if (arr[i]>0) {
                positive=positive+1;

            }
            else{
                zero=zero+1;
            }
        }
        System.out.println((String.format("%.6f",(positive/num))) );
        System.out.println(String.format("%.6f",(negative/num)));
        System.out.println((String.format("%.6f",zero/num)) );
    }
}
