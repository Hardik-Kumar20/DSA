package DSA;
import java.util.*;
public class Array {

    public static void main(String[] args) {
        // Arr();
        reverseArray();
    }

    //2d array
    // static void Arr(){
    //     Scanner sc = new Scanner(System.in);
    //     int[][] arr = new int[3][3];
    //     for(int i = 0 ; i< 3 ; i++){
    //         for(int j = 0 ; j<3 ; j++){
    //              arr[i][j] = sc.nextInt();
    //         }
    //     }
    //     for(int i = 0 ; i< 3 ; i++){
    //         for(int j = 0 ; j<3 ; j++){
    //              System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }


        // static void dyArr(){
        //    Scanner sc = new Scanner(System.in);
        //     int[][] arr= new int[3][3];
        //     for(int i = 0 ; i < arr.length ; i++){
        //         for(int j = 0 ; j < arr[i].length ; j++){
        //             arr[i][j] = sc.nextInt();
        //         }
        //     }

        //     //for loop to represent
        //     for(int i = 0 ; i<arr.length ; i++){
        //         System.out.println(Arrays.toString(arr[i]));
        //     }
        // }



        // static void noFixArr(){
        //     int[][] arr = {
        //         {1,2,3,4,5},
        //         {1 ,2 ,3 },
        //         {1,1,2,4,5}
        //     };

        //     for(int i = 0 ; i< arr.length ; i++){
        //         for(int j = 0 ; j<arr[i].length; j++){
        //             System.out.print(arr[i][j] + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.print(Arrays.deepToString(arr));
        // }


        // static void arrayList(){
        //     ArrayList<Integer> list = new ArrayList<>(10);
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter the number of integers you want to submkt ::");
        //     int n = sc.nextInt();
        //     System.out.println("Enter " + n + " integers:");
        //     for (int i = 0; i < n; i++) {
        //         list.add(sc.nextInt()); // Adding user input to the list
        //     }
    
        //     // Printing the list values
        //     System.out.println("List elements are:");
        //     for (int i = 0; i < n; i++) {
        //         System.out.println(list.get(i)); // Getting the elements of the list
        //     }
        //     System.out.println(list.contains(124));
        // }



        // static void maxNumber(){
        //     //max number in array
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Please enter the size of array you want");
        //     int n = sc.nextInt();
        //     int[] arr = new int[n];
        //     for(int i = 0 ; i < n ; i++){
        //         arr[i] = sc.nextInt(); 
        //     }
        //     int max = arr[0];
        //     //finding the largest number in array
        //     for (int i = 1; i < n; i++) { // Start from index 1 since max is initialized with arr[0]
        //         if (arr[i] > max) {
        //             max = arr[i]; // Update max if the current element is larger
        //         }
        //     }
        //         System.out.println(max);
        //     }


        //reversing an array
        static void reverseArray(){
            int array[] = {1,2,18,19,55,77,32};
            int start = 0;
            int end = array.length-1;
            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
            for(int i = 0 ; i<array.length ; i++){
                System.out.print(array[i] + " ");
            }
        }

        }
