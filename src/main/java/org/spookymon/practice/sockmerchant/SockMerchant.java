package main.java.org.spookymon.practice.sockmerchant;

import java.util.Arrays;

public class SockMerchant {

    static int getPairCount(int[] sortedArray) {
        int count = 0;
        for(int i = 0; i < sortedArray.length; i++) {
            if(i+1 == sortedArray.length) {
                break;
            }
            if(sortedArray[i] == sortedArray[i+1]) {
                count++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Arrays.sort(array);
        System.out.println(getPairCount(array));
    }
}
