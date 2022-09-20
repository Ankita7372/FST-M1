package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int arr []= {77,10,1,222,30,5,90,2};
        System.out.println("Original array: "+Arrays.toString(arr));
        for (int i=1;i<arr.length;i++){
            int curr=arr[i];
            int k=i;
            for(int j=i-1;j>=0;j--){
                if (curr<arr[j]){
                    int temp= arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    k--;
                }
            }
        }
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
