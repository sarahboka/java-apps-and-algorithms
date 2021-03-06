/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

import java.util.Arrays;

/*
 * @author Sarah
 */

public class Add2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        System.out.println(Arrays.toString(addArrays2(arr1, arr2)));
    }
    
    public static int[] addArrays(int[] a, int[] b){
        int[] arr = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (a.length > i){
                    arr[i] = a[i];
            } else {
                    arr[i] = b[count];
                    count++;
            }
        }
        return arr;
    }
    
    //using library
    public static int[] addArrays2(int[] a, int[] b){
        int aLen = a.length;
        int bLen = b.length;
//        System.arraycopy(a, 0, sumArr, 0, aLen);
        int[] sumArr = Arrays.copyOf(a, aLen + bLen);
        System.arraycopy(b, 0, sumArr, aLen, bLen);
        
        return sumArr;
    }
}
