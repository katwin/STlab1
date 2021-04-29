package com.githab.eefimova.part1;

import com.githab.eefimova.part1.TanTaylor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaylorTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void test(Double expectedResult, Integer numerator, Integer denominator) {
        TanTaylor taylor = new TanTaylor();
        assertEquals(expectedResult, Math.round(taylor.tan3(numerator * Math.PI / denominator) * 100000.0) / 100000.0, 0.005);
    }

    @Test
    public void boundary() {
        TanTaylor taylor = new TanTaylor();
        assertEquals(0.0, taylor.tan3(0), 0.005);
        assertEquals(0.0, taylor.tan3(Math.PI), 0.005);
        assertEquals(1.0, taylor.tan3(Math.PI / 4), 0.005);
        assertEquals(-1.0, taylor.tan3(3 * Math.PI / 4), 0.005);
        assertEquals(Double.NaN, taylor.tan3(Double.POSITIVE_INFINITY), 0.005);
        assertEquals(Double.NaN, taylor.tan3(Double.NEGATIVE_INFINITY), 0.005);
        assertEquals(Double.NaN, taylor.tan3(Double.NaN), 0.005);
    }

    @Test
    public void firstQuarter() {
        TanTaylor taylor = new TanTaylor();
        assertEquals(Math.sqrt(3) / 3, taylor.tan3(Math.PI / 6), 0.005);
        assertEquals(1, taylor.tan3(Math.PI / 4), 0.005);
        assertEquals(1*Math.sqrt(3), taylor.tan3(Math.PI / 3), 0.005);
    }

    @Test
    public void secondQuarter() {
        TanTaylor taylor = new TanTaylor();
        assertEquals(-1 * Math.sqrt(3), taylor.tan3(2 * Math.PI / 3), 0.005);
        assertEquals(-1, taylor.tan3(3 * Math.PI / 4), 0.005);
        assertEquals(-1 * Math.sqrt(3) / 3, taylor.tan3(5 * Math.PI / 6), 0.005);
    }

    @Test
    public void thirdQuarter() {
        TanTaylor taylor = new TanTaylor();
        assertEquals(Math.sqrt(3) / 3, taylor.tan3(7 * Math.PI / 6), 0.005);
        assertEquals(1, taylor.tan3(5 * Math.PI / 4), 0.005);
        assertEquals(Math.sqrt(3), taylor.tan3(4 * Math.PI / 3), 0.005);
    }

    @Test
    public void forthQuarter() {
        TanTaylor taylor = new TanTaylor();
        assertEquals(-Math.sqrt(3) / 3, taylor.tan3(-Math.PI / 6), 0.005);
        assertEquals(-1, taylor.tan3(-Math.PI / 4), 0.005);
        assertEquals(-Math.sqrt(3), taylor.tan3(-Math.PI / 3), 0.005);
    }

    @Test
    public void tan3() {
        TanTaylor taylor = new TanTaylor();
        Assertions.assertEquals(taylor.tan3(Math.PI/2), Double.POSITIVE_INFINITY);
    }
}










//assertNotEquals(expectedResult, (Math.round(taylor.tan3(numerator * Math.PI / denominator) * 100000.0) / 100000.0) + 0.005, 0.005);
//assertNotEquals(expectedResult, (Math.round(taylor.tan3(numerator * Math.PI / denominator) * 100000.0) / 100000.0) - 0.005, 0.005);