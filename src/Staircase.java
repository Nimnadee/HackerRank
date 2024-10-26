import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();


        for(int i=input;i>0;i--){

            for(int z=i-1;z>0;z--){
                System.out.print(" ");


            }
            for(int j=i;j<input+1;j++){
                System.out.print("#");
            }
            System.out.println("");

        }
    }
}
