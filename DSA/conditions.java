package DSA;
import java.util.*;
public class conditions {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary ::");
        int salary = sc.nextInt();
        System.out.println("Your salary is " + salary);
        if(salary > 20000){
            salary = salary+4000;
            System.out.println("Salary with bonus " + salary);
        }
        else{
            salary = salary+1000;
            System.out.println(salary);
        }

                // using while loop
                int n=1;
                while (n != 11) {
                    int a = 2*n;
                    System.out.println("2 * " + n + " = " +a);
                    n++;
                }

    }
}


