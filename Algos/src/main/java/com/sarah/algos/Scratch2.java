/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Scratch2 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        for (int i = 0; i < len; i++){
            System.out.println(isPrime(scan.nextInt()) ? "Prime" : "Not prime");
        }
    }
    
    public static boolean isPrime(int n){
        if (n < 2)return false;
        else {
            for (int i = 2; i <= (int) Math.sqrt(n); i++){
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}
