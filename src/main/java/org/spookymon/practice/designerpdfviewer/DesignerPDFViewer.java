package org.spookymon.practice.designerpdfviewer;

import java.util.HashMap;
import java.util.Map;

public class DesignerPDFViewer {
    static Map<Character, Integer> charHeightMap = new HashMap<>();

    static void initCharHeightMap(int[] heights) {
        Character c = 'a';
        for(int i = 0; i < heights.length; i++) {
            charHeightMap.put(c, heights[i]);
            c++;
        }
    }

    static int solve(String word, int[] heights) {
        initCharHeightMap(heights);
        int width = word.length();
        int maxHeight = 0;
        for(int i = 0; i < width; i++) {
            int height = charHeightMap.get(word.charAt(i));
            if(height > maxHeight) {
                maxHeight = height;
            }
        }
        return width * maxHeight;
    }

    public static void main(String[] args) {
        int[] charHeightArray = new int[] {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(solve("abc", charHeightArray));
    }
}
