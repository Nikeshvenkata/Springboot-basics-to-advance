package com.nikesh.springboot.java.telusko;

import java.util.ArrayList;

public class BasicArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        System.out.println(list);

        int count = 0;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                System.out.print( (matrix[i][j] + 1) + " ");
                count++;
            }
            System.out.println();
        }
    }
}
