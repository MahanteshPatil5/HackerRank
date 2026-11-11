// loops 2
import java.util.*;
import java.io.*;

class code7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int currentSum= a;
            for(int j=0;j<n;j++){
                // Add (2^j * b) to the cumulative sum
                currentSum += (int) Math.pow(2, j) * b;
                System.out.print(currentSum + " ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
