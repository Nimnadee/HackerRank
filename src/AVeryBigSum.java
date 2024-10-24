

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> arr){
        Scanner scanner=new Scanner(System.in);
        long value;
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            value=scanner.nextInt();
            arr.add(i,value);
        }
        long total=0;
        for(int j=0;j<num;j++){
            total=total+arr.get(j);
        }
        return total;
    }

    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>();
        System.out.println(aVeryBigSum(list));
    }
}
