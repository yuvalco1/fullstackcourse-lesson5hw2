import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.Write a Java program to sum values of an array
        int[] numbers = {7, 15, 3, 22, 10, 9, 14, 6};
        int sum = 0;
        for (int num:numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers in the array is: "+ sum);


        //2. Write a Java program to calculate the average value of array elements.
        int[] numbers2= {7, 15, 3, 22, 10, 9, 14, 6};
        float sum2=0;
        for (int num2:numbers2) {
            sum2 += num2;
        }
        float average = sum2/ numbers2.length;
        System.out.println("Average of numbers in the array is: "+ average);


        //3.Write a Java program to test if an array contains a specific value
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number to check if it is in the array:");
        int input_number = scanner.nextInt();
        boolean number_exsits=false;
        for (int check:numbers){
            if (check == input_number){
                number_exsits = true;
            }
        }
        if (number_exsits) {
            System.out.println("The number " + input_number + " exists in the array.");
            }
        else {
            System.out.println("The number " + input_number + " does NOT exists in the array.");
        }

        //4.Write a Java program to find the index of an array element

        System.out.println("please enter number to check its index in the array:");
        int input_number2 = scanner.nextInt();
        boolean number_exsits2=false;
        int index_found = -1;
        for (int i=0; i< numbers2.length; i++){
            if (numbers2[i] == input_number){
                number_exsits2 = true;
                index_found = i;
                break;
            }
        }

        if (number_exsits2) {
            System.out.println("The index of number " + input_number + " in the array is: " + index_found);
        }
        else {
            System.out.println("The number " + input_number + " does NOT exists in the array.");
        }

        //5.Write a Java program to copy an array by iterating the array

        int[] numbers3= {7, 15, 3, 22, 10, 9, 14, 6};
        int[] numbers4= new int[numbers3.length];

        for (int n = 0; n < numbers3.length; n++) {
            numbers4[n] = numbers3[n];
        }
        System.out.println(Arrays.toString(numbers4));



        //6.Write a Java program to find the maximum and minimum value of an array

        int[] numbers5= {7, 15, 3, 22, 10, 9, 14, 6};
        int min_num= numbers5[0];
        int max_num= numbers5[0];
        for (int itera:numbers){
            if (itera < min_num){
                min_num = itera;
            }
            if (itera > max_num){
                max_num = itera;
            }
        }

        System.out.println("The biggest number in the array is: "+ max_num);
        System.out.println("The smallest number in the array is: "+ min_num);

        //7.Write a Java program to find the common elements between two arrays of integers.

        int[] numbers6= {7, 15, 3, 22, 10, 9, 14, 6};
        int[] numbers7= {78, 15, 23, 212, 110, 99, 14, 16};

        System.out.print("The following numbers are common to both arrays (none if any): ");
        for (int i:numbers6) {
            for (int j:numbers7){
                if (j == i){
                    System.out.print(j+", ");
                }
            }
        }
        System.out.println(",,, THE END");

        //8 (extra) - check if array is a polindrom
        int [] numbers8 = {1, 3, 5, 8, 8, 5, 3, 1};
        int [] numbers9 = {1, 3, 5, 6, 5, 3, 1};
        int [] numbers10 = {1, 3, 5, 8, 8, 55, 3, 1};

        Boolean is_polindrom = false;
        if (numbers10.length % 2 == 0) {
            for (int i = 0; i < numbers10.length / 2; i++) {
                if (numbers10[i] != numbers10[numbers10.length - 1 - i]) {
                    is_polindrom = false;
                    break;
                } else {
                    is_polindrom = true;
                }
            }
        }
        else {
                is_polindrom = false;
        }
        if (is_polindrom){
            System.out.println("The array: "+Arrays.toString(numbers10)+ " is a polindrom :-)");
        }
        else {
            System.out.println("The array: "+Arrays.toString(numbers10)+ " is NOT a polindrom :-(");

        }

    }
}