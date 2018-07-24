package main.java.org.spookymon.practice.birthdaychocolate;

public class BirthdayChocolate {

    static int getCount(int[] array, int targetSum, int length) {
        int count = 0;
        for(int i = 0; i <= array.length - length; i++) {
            if(targetSum == sumArray(array, i, length)) {
                count++;
            }
        }
        return count;
    }

    static int sumArray(int[] array, int startIndex, int length) {
        int sum = 0;
        for(int i = startIndex; i < startIndex + length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,1,1,3};
        int count = getCount(array, 3, 3);
        System.out.println(count);
    }
}
