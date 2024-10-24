import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int[] score={0,0};

        for(int i=0;i<3;i++){
            a[i]= scanner.nextInt();
        }
        for(int j=0;j<3;j++){
            b[j]=scanner.nextInt();
        }

        for(int k=0;k<3;k++){
            if(a[k]<b[k]){
                score[1]+=1;
            } else if (a[k]>b[k]) {
                score[0]+=1;
            }
        }
        System.out.println(score[0]+" "+score[1]);

    }

}
