package org.spookymon.practice.thehurdlerace;

public class TheHurdleRace {
    static int getMax(int[] a) {
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int solve(int jumpHeight, int[] hurdleHeights) {
        return Math.max(getMax(hurdleHeights) - jumpHeight, 0);
    }

    public static void main(String[] args) {
        int potions = solve(7, new int[] {2,5,4,5,2});
        System.out.println(potions);
    }
}
