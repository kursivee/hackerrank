package org.spookymon.practice.catsandamouse;

public class CatsAndAMouse {

    static int calcDistFromMouse(int catPos, int mousePos) {
        return Math.abs(catPos - mousePos);
    }

    static String solve(int catAPos, int catBPos, int mousePos) {
        int catAMouseDist = calcDistFromMouse(catAPos, mousePos);
        int catBMouseDist = calcDistFromMouse(catBPos, mousePos);
        if(catAMouseDist < catBMouseDist) {
            return "Cat A";
        } else if(catBMouseDist < catAMouseDist) {
            return "Cat B";
        }
        return "Mouse C";
    }

    public static void main(String[] args) {
        int catAPos = 1;
        int catBPos = 3;
        int mousePos = 2;
        System.out.println(solve(catAPos, catBPos, mousePos));
    }
}
