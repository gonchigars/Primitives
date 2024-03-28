package com.academix;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testCalculateSum() {
        int sum = App.calculateSum(2, 3);
        assertEquals(5, sum);
    }
}