package org.spookymon.practice.drawingbook;

public class DrawingBook {
    static boolean shouldStartFromFront(int totalPages, int targetPage) {
        int halfwayPage = totalPages / 2;
        if(targetPage <= halfwayPage) {
            return true;
        }
        return false;
    }

    static int calcPageDistance(int startPage, int targetPage) {
        int dist = (int)Math.ceil(Math.abs(startPage - targetPage) / 2.0);
        if(dist == 0) {
            dist = 1;
        }
        return dist;
    }

    static boolean isEndPage(int totalPages, int targetPage) {
        if(targetPage == 1 || (totalPages % 2 != 0 && targetPage > totalPages - 2)
            || targetPage == totalPages) {
            return true;
        }
        return false;
    }

    public static int solve(int totalPages, int targetPage) {
        int startPage = 1;
        if(isEndPage(totalPages, targetPage)) {
            return 0;
        }
        if(!shouldStartFromFront(totalPages, targetPage)) {
            startPage = totalPages - 1;
        }
        return calcPageDistance(startPage, targetPage);
        /*
            Better Solution:
            return Math.min(targetPage / 2, totalPages / 2 - targetPage / 2);
         */
    }

    public static void main(String[] args) {
        System.out.println(solve(7,3));
    }
}
