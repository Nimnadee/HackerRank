

import java.util.Scanner;
public class ArraysDS_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();

        int[] arr= new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i] = myObj.nextInt();

        }

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" " );
        }


    }

}
