package org.spookymon.practice.pickingnumbers;

import java.util.Arrays;

public class PickingNumbers {
    static int getMax(int[] a) {
        int max = 0;
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                int dist = 0;
                if(a[j] - a[i] <= 1) {
                    dist = j - i + 1;
                    if(dist > max) {
                        max = dist;
                    }
                }
            }
        }
        return max;
    }
    static int solve(int[] array) {
        Arrays.sort(array);
        return getMax(array);
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,1,2,2,2,3}));
        System.out.println(solve(new int[] {1,3,3,4,5,6}));
    }
}
