package main.java.org.spookymon.practice.timeconversion;

import java.io.*;
import java.util.*;

public class TimeConversion {

    static class Time {
        private static final String NUMBER_FORMAT = "%02d";
        
        private int hour;
        private int minute;
        private int second;
        private String timePeriod;

        public enum TimePeriod {
            AM, PM
        }

        public Time(String time) {
            timePeriod = getTimePeriod(time);
            String [] timeArray = time.replace(timePeriod, "").split(":");
            hour = Integer.parseInt(timeArray[0]);
            minute = Integer.parseInt(timeArray[1]);
            second = Integer.parseInt(timeArray[2]);
        }

        public String getAsMiltiaryTime() {
            int hour;
            if(TimePeriod.PM == (TimePeriod.valueOf(timePeriod))) {
                hour = this.hour + 12;
                if(hour == 24) {
                    hour = 12;
                }
            } else {
                hour = this.hour;
                if(hour == 12) {
                    hour = 0;
                }
            }
            return toString(hour, this.minute, this.second, "");
        }

        private String getTimePeriod(String time) {
            int length = time.length();
            String timePeriod = time.substring(length - 2);
            return timePeriod;
        }

        private String toString(int hour, int minute, int second, String timePeriod) {
            String formattedHour = String.format(NUMBER_FORMAT, hour);
            String formattedMinute = String.format(NUMBER_FORMAT, minute);
            String formattedSecond = String.format(NUMBER_FORMAT, second);
            return formattedHour + ":" + formattedMinute + ":" + formattedSecond + timePeriod;
        }

        @Override
        public String toString() {
            return toString(hour, minute, second, timePeriod);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();
        Time time = new Time(s);
        String result = time.getAsMiltiaryTime();

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
