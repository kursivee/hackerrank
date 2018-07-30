package org.spookymon.practice.electronicsshop;

public class ElectronicsShop {
    static int solve(int budget, int[] keyboardPrices, int[] usbPrices) {
        int max = -1;
        for(int i = 0; i < keyboardPrices.length; i++) {
            for(int j = 0;j < usbPrices.length; j++) {
                int total = keyboardPrices[i] + usbPrices[j];
                if(total <= budget && total > max) {
                    max = total;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int budget = 5;
        int[] keyboardPrices = new int[] {4};
        int[] usbPrices = new int[] {5};
        System.out.println(solve(budget, keyboardPrices, usbPrices));
    }
}
