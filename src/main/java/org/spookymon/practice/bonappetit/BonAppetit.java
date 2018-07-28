package main.java.org.spookymon.practice.bonappetit;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {
    static int calcSplitBillTotal(List<Integer> itemizedBill) {
        int sum = 0;
        for(int i = 0; i < itemizedBill.size(); i++) {
            sum += itemizedBill.get(i);
        }
        return sum / 2;
    }

    static void removeItemFromBill(List<Integer> itemizedBill, int removedItemIndex) {
        itemizedBill.remove(removedItemIndex);
    }

    static String getPaymentDifference(int shouldPay, int paid) {
        int diff = Math.abs(shouldPay - paid);
        if(diff == 0) {
            return "Bon Appetit";
        }
        return Integer.toString(diff);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);
        int paid = 12;
        int removedItemIndex = 1;
        removeItemFromBill(list, removedItemIndex);
        System.out.println(getPaymentDifference(calcSplitBillTotal(list), paid));
    }
}
