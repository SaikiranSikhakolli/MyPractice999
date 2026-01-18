package com.JavaPractice;

public class LargestNumInArray {

	public static void main(String[] args) {
        int[] arr = {12,45,7,89,67,2};
        int largest = arr[0];
        int smallest=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest) {
            	smallest = arr[i];
            }
        }
        System.out.println("Largest number is : " + largest);
        System.out.print("Smallest number is : " + smallest);
	}

}
