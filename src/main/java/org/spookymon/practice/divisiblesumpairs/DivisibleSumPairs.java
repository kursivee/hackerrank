package main.java.org.spookymon.practice.divisiblesumpairs;

public class DivisibleSumPairs {

    static int getSumPairCount(int[] array, int divisor) {
        int count = 0;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                int sum = array[i] +  array[j];
                if(sum % divisor == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[] {5,9,10,7,4};
        int count = getSumPairCount(array, 2);
        System.out.println(count);
    }
}
