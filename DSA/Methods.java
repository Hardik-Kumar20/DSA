package DSA;
import java.util.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // System.out.println("Enter two integers");
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // System.out.println(sum(a,b));;

        // demo(1,2,3,4,5);

        System.out.println("Enter an integer");
        int n = sc.nextInt();
        System.out.println(isPrime(n));


    }

    static int sum(int a , int b){
        return(a+b);
    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c= 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
                
            }
            c++;
        }
        if(c*c >n){
            return true;
        }
        return false;

    }

}
