package mypackage;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0; i<5;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.print("Array before sorting: ["+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4]+"] ");
	    Arrays.sort(arr);
        System.out.println();
        System.out.print("Array after sorting: ["+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4]+"] ");
    }
}
