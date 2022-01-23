package com.company;

import java.util.Scanner;

public class insertionSortByStep {
//    static int[] list = {1, 9, 7, 6, 10, 100};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }


        System.out.println("\nBegin sort processing...");
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            System.out.println("Bước " + i + ": ");
            System.out.println("Xét từ phần tử " + array[i]);
            int x = array[i];
            int pos = i;
            for (int j = i; j > 0; j--) {
                if (x < array[j - 1]) {
                    array[j] = array[j - 1];
                    pos = j-1;
                }
            }
            array[pos] = x;
            System.out.println("Kết thúc bước " + i + " ta được kết quả: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}