import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOfRange;

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
            if (numbers2[i] == input_number2){
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

        boolean is_polindrom = false;
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

        // do exercises 2,4,5,6,8,9,10,11,12,15 in https://www.w3resource.com/java-exercises/array/index.php
        // 2. Write a Java program to sum values of an array == #1 above
        // 4. Write a Java program to calculate the average value of array elements == #2 above
        // 5. Write a Java program to test if an array contains a specific value  == #3 above
        // 6. Write a Java program to find the index of an array element == #4 above
        // 8. Write a Java program to copy an array by iterating the array == #5 above

        // 9. Write a Java program to insert an element (specific position) into an array

        int [] nums1 = {1, 3, 5, 8, 8, 5, 3, 1};
        System.out.println("please enter number to add it to the array:");
        int input_num = scanner.nextInt();
        int nums1_length = nums1.length;
        System.out.println("The array length is: "+nums1_length+". Please enter the index to insert the number");
        int input_index = scanner.nextInt();
        int [] nums2 = new int [nums1_length+1];
        for (int i = 0; i < input_index ; i++) {
            nums2[i] = nums1[i];
            }
        nums2[input_index] = input_num;
        for (int i = input_index+1; i < nums1_length+1 ; i++) {
            nums2[i] = nums1[i-1];
        }
        System.out.println("The original array is: "+Arrays.toString(nums1));
        System.out.println("The new array is: "+Arrays.toString(nums2));

        //10. Write a Java program to find the maximum and minimum value of an array == #6 above

        //11. Write a Java program to reverse an array of integer values

        int [] before_reverse = {1,2,3,4,5,6,7,8};
        int [] after_reverse = new int [before_reverse.length];
        for (int i = 0; i <before_reverse.length; i++) {
            after_reverse[i] = before_reverse[before_reverse.length-1-i];
        }
        System.out.println("The original array is: "+Arrays.toString(before_reverse));
        System.out.println("The new reversed array is: "+Arrays.toString(after_reverse));


        //12. Write a Java program to find duplicate values in an array of integer values.

        int [] numbers_not_sorted = {1, 3, 5, 8, 8, 5, 3, 1};
        System.out.println("The original array is: "+Arrays.toString(numbers_not_sorted));
        Arrays.sort(numbers_not_sorted);
        System.out.println("The sorted array is: "+Arrays.toString(numbers_not_sorted));
        for (int i = 0; i < numbers_not_sorted.length-1; i++) {
            if (numbers_not_sorted[i] == numbers_not_sorted[i+1]){
                System.out.println("the following number is duplicated in the array: "+numbers_not_sorted[i]);
            }
        }

        //15. Write a Java program to find common elements between two integer arrays.

        int [] num_array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] num_array2 = {1, 3, 5, 8, 8, 5, 3, 1};

        for (int a:num_array1) {
            for (int b:num_array2) {
                if (a==b){
                    System.out.println("the following number exists in both array1 and array2: "+a);
                }
            }

        }

    }
}