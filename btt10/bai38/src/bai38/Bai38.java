/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai38;

/**
 *
 * @author DELL
 */
interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

public class Bai38 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Mảng sau khi sắp xếp bằng BubbleSort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Mảng sau khi sắp xếp bằng SelectionSort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}