

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int array[][]=new int[num][num];

        for(int j=0;j<num;j++){

            for(int i=0;i<num;i++){
                array[j][i]=scanner.nextInt();
            }
        }

        int sum1 =0;
        int sum2 =0;

        for(int j=0;j<num;j++){

            for(int i=0;i<num;i++){
                if(i==j){
                    sum1=sum1+array[i][j];

                }
            }


        }

        for(int j=num-1;j>=0;j--){
            int dif=(num-1)-j;
              sum2=sum2+array[j][dif];


        }
//        System.out.println("sum1 :"+sum1);
//        System.out.println("sum1 :"+sum2);
        int answer=sum1-sum2;
        if(answer>0){
            System.out.println(answer);
        }
        else{
            System.out.println(answer/-1);
        }




    }
}
