package DSA;
import java.util.*;
public class DSA {
    public static void main(String[] args){
        // System.out.println("hello world");
        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc.nextInt());


        // making a design
        for(int i = 2 ; i < 8 ; i++){
            for (int j = i-1 ; j<i ; j++){
                int a = j*j;
                System.out.print(a +" ");
                System.out.println();
            }
            System.out.print("");
        }

       
    }
}


