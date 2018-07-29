package org.spookymon.practice.drawingbook;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DrawingBookTest {

    @Test
    public void test_case_1() {
        int ans = DrawingBook.solve(5,4);
        assertEquals(0, ans);
    }

    @Test
    public void test_case_2() {
        int ans = DrawingBook.solve(6,2);
        assertEquals(1, ans);
    }

    @Test
    public void test_case_7() {
        int ans = DrawingBook.solve(7,3);
        assertEquals(1, ans);
    }

    @Test
    public void test_case_16() {
        int ans = DrawingBook.solve(15600,1560);
        assertEquals(780, ans);
    }

    @Test
    public void test_case_16_mod() {
        int ans = DrawingBook.solve(1560,156);
        assertEquals(78, ans);
    }

    @Test
    public void test_case_20() {
        int ans = DrawingBook.solve(70809,46090);
        assertEquals(12359, ans);
    }

    @Test
    public void test_from_end_odd_target() {
        int ans = DrawingBook.solve(8,7);
        assertEquals(1, ans);
    }

    @Test
    public void test_from_end_same_target() {
        int ans = DrawingBook.solve(8,8);
        assertEquals(0, ans);
    }

    @Test
    public void test_from_end_odd() {
        int ans = DrawingBook.solve(9,8);
        assertEquals(0, ans);
    }

    @Test
    public void test_from_end_odd_diff_page() {
        int ans = DrawingBook.solve(9,7);
        assertEquals(1, ans);
    }
}
