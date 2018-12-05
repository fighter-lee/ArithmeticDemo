package com.fighter.arithmetic;

public class Sort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 1, 3, 2};
//        insertSort(a, 6);
        selectSort(a, 6);
        for (int i = 0; i < a.length; i++) {
            System.out.print("" + a[i]);
        }
    }

    public static void bubbleSort(int[] a, int n) {
        if (n < 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void insertSort(int[] a, int n) {
        if (n < 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int value = a[i];
            for (; j >= 0; j--) {
                if (value < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    public static void selectSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

}
