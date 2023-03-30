package practisee;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MergeAndSortArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get input for the first array
        System.out.println("Enter the number of elements in the first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        // get input for the second array
        System.out.println("Enter the number of elements in the second array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        mergeArray(arr1,arr2);
    }
        public static int[] mergeArray(int[]arr1,int[]arr2)
        {
         
        // merge the two arrays using for loop
        int[] mergedArr = new int[arr1.length+arr2.length];
        int k = 0;
        for(int i=0;i<arr1.length;i++) {
            mergedArr[k++] = arr1[i];
        }
        for(int j=0;j<arr2.length;j++) {
            mergedArr[k++] = arr2[j];
        }
  

        // sort the merged array in ascending order using Arrays.sort()
        Arrays.sort(mergedArr);
        for(int l=0;l<mergedArr.length/2;l++) {
        	int temp=mergedArr[l];
        	mergedArr[l]=mergedArr[mergedArr.length-1-l];
        	mergedArr[mergedArr.length-1-l]=temp;
        }
        // print the sorted merged array
        System.out.println("The sorted merged array is: " + Arrays.toString(mergedArr));
        return mergedArr;
    }
       
}

