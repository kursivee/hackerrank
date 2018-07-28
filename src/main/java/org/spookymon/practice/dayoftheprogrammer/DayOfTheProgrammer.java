package main.java.org.spookymon.practice.dayoftheprogrammer;

import java.util.HashMap;
import java.util.Map;

public class DayOfTheProgrammer {
    static Map<Integer, Integer> monthMap = new HashMap<>();

    static Map<Integer, Integer> initMonthMap(int year) {
        monthMap.put(1,31);
        monthMap.put(3,31);
        monthMap.put(5,31);
        monthMap.put(7,31);
        monthMap.put(8,31);
        monthMap.put(10,31);
        monthMap.put(12,31);

        monthMap.put(4,30);
        monthMap.put(6,30);
        monthMap.put(9,30);
        monthMap.put(11,30);

        monthMap.put(2, getFebDays(year));
        return monthMap;
    }

    static int getFebDays(int year) {
        if(year == 1918) {
            return 15;
        }
        if((year > 1918 && isGregorianLeapYear(year)) || (year < 1918 && isJulianLeapYear(year))) {
            return 29;
        }
        return 28;
    }

    static boolean isJulianLeapYear(int year) {
        return year % 4 == 0;
    }

    static boolean isGregorianLeapYear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    static String getTargetDay(int year, int targetDay) {
        int totalDays = 0;
        for(int i = 1; i <= 12; i++) {
            int daysInMonth = monthMap.get(i);
            totalDays += monthMap.get(i);
            if(totalDays > targetDay) {
                return getDateString(i, daysInMonth - (totalDays - targetDay), year);
            } else if(totalDays == targetDay) {
                return getDateString(i, daysInMonth, year);
            }
        }
        return "NOT FOUND";
    }

    static String getDateString(int month, int day, int year) {
        String formattedMonth = String.format("%02d", month);
        String formattedDay = String.format("%02d", day);
        String formattedYear = String.format("%02d", year);
        return formattedDay + "." + formattedMonth + "." + formattedYear;
    }

    public static void main(String[] args) {
        int year = 1918;
        initMonthMap(year);
        String date = getTargetDay(year, 256);
        System.out.println(date);
    }
}
