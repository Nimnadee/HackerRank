

import java.util.Scanner;
public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int[] arr=new int[num];

        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int total=0;
        for(int j=0;j< arr.length;j++){
            total=total+arr[j];
        }
        System.out.println(total);
    }
}
