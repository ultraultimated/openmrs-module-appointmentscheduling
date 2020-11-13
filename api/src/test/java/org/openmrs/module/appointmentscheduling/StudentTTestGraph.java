package org.openmrs.module.appointmentscheduling;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class StudentTTestGraph {

    //Calling function Test Case 1
    @Test
    public void testConfidenceIntervalCalling() {
        Assertions.assertArrayEquals(StudentT.confidenceInterval(new double[]{1.0, 1.0}, 0), new double[]{1.0, 0.0});
    }

    // Called Function
    @Test
    public void testTTableCalled() {
        // Test case 2
        assertEquals(StudentT.tTable(2, 0.1), 2.91, 0.01);
        // Test case 3
        assertEquals(StudentT.tTable(2, -2), 700, 0);
        // Test case 4
        assertEquals(StudentT.tTable(2, 2), -700, 0);

    }

    // All-def Coverage
    // Refer Wiki for more information
    @Test
    public void testConfidenceIntervalAllDef1() {
        //Test Case 1
        Assertions.assertArrayEquals(StudentT.confidenceInterval(new double[]{1.0, 1.0}, 0), new double[]{1.0, 0.0});
    }

    @Test
    public void testConfidenceIntervalAllDef2() {
        //Test Case 2
        assertEquals(StudentT.tTable(2, 0.1), 2.91, 0.01);
    }

    @Test
    public void testConfidenceIntervalAllDef3() {
        //Test Case 3
        assertEquals(StudentT.tTable(2, -2), 700, 0);
    }

    @Test
    public void testConfidenceIntervalAllDef4() {
        //Test Case 4
        assertEquals(StudentT.tTable(2, 2), -700, 0);
    }


}
