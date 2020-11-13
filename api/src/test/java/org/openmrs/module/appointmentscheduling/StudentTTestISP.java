package org.openmrs.module.appointmentscheduling;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class StudentTTestISP {

    /*
         Testing for regularizedBetaFunction
     */
    @Test
    public void testRegularizedBetaFunctionThrowsException1() {
        //Test Id 2
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.regularisedBetaFunction(0, -1, 0.5));
        assertTrue(exception.getMessage().contains("gamma function is negative"));
    }

    @Test
    public void testRegularizedBetaFunctionThrowsException2() {
        //Test Id 4
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.regularisedBetaFunction(-1, 0, -1));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
    }

    @Test
    public void testRegularizedBetaFunctionThrowsException3() {
        // Test Id 6
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.regularisedBetaFunction(1, 0, 2));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
    }

    @Test
    public void testRegularizedBetaFunctionReturnsValue1() {
        // Test Id 8
        assertEquals(StudentT.regularisedBetaFunction(0, 1, 0.5), 1.0, 0.0);
    }

    @Test
    public void testRegularizedBetaFunctionReturnsValue2() {
        // Test Id 12
        assertEquals(StudentT.regularisedBetaFunction(-1, 1, 1), 1.0d, 0.0);
    }

    @Test
    public void testRegularizedBetaFunctionThrowsException4() {
        // Test Id 13
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.regularisedBetaFunction(1, -1, 0.5));
        assertTrue(exception.getMessage().contains("gamma function is negative"));
    }

    /*
        Testing studentTCDF method
     */
    @Test
    public void testStudentTcdfShouldThrowException1() {
        // Test Id 1
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.studentTcdf(-1.0, -1));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
    }


    @Test
    public void testStudentTcdfShouldReturnValue1() {
        // Test Id 2
        assertEquals(StudentT.studentTcdf(0, -1), 0.5d, 0);
    }

    @Test
    public void testStudentTcdfShouldThrowException2() {
        // Test Id 3
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.studentTcdf(5.0, -1));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
    }

    @Test
    public void testStudentTcdfShouldReturnValue2() {
        // Test Id 4
        assertEquals(StudentT.studentTcdf(-5, 0), 0.0d, 0);
    }

    // 0d / 0d is a way to represent NaN
    @Test
    public void testStudentTcdfShouldReturnValue3() {
        // Test Id 5
        assertEquals(StudentT.studentTcdf(0, 0), 0d / 0d, 0);
    }

    @Test
    public void testStudentTcdfShouldReturnValue4() {
        // Test Id 6
        assertEquals(StudentT.studentTcdf(5, 0), 1.0d, 0);
    }

    @Test
    public void testStudentTcdfShouldReturnValue5() {
        // Test Id 7
        assertEquals(StudentT.studentTcdf(-1, 1), 0.25d, 0.0001);
    }

    @Test
    public void testStudentTcdfShouldReturnValue6() {
        // Test Id 8
        assertEquals(StudentT.studentTcdf(0, 1), 0.5d, 0);
    }

    @Test
    public void testStudentTcdfShouldReturnValue7() {
        // Test Id 9
        assertEquals(StudentT.studentTcdf(1, 1), 0.75d, 0.0001);
    }

    /*
        Testing studenttTable method
     */
    @Test
    public void testTTableShouldThrowException1() {
        // Test Id 1
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.tTable(-1, -1.0));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
    }

    @Test
    public void testTTableShouldThrowException2() {
        // Test Id 2
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.tTable(-1, 0.0));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
    }

    @Test
    public void testTTableShouldThrowException3() {
        // Test Id 3
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.tTable(-1, 1.0));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
    }

    @Test
    public void testTTableShouldReturnValue1() {
        // Test Id 4
        assertTrue(StudentT.tTable(0, -1.0) < 0);
    }

    @Test
    public void testTTableShouldReturnValue2() {
        // Test Id 5
        assertTrue(StudentT.tTable(0, 0) < 0);
    }

    @Test
    public void testTTableShouldReturnValue3() {
        // Test Id 6
        assertTrue(StudentT.tTable(0, 1.0) < 0);
    }

    @Test
    public void testTTableShouldReturnValue4() {
        // Test Id 7
        assertTrue(StudentT.tTable(1, -1.0) > 0);
    }

    @Test
    public void testTTableShouldReturnValue5() {
        // Test Id 8
        assertTrue(StudentT.tTable(1, 0.0) > 0);
    }

    @Test
    public void testTTableShouldReturnValue6() {
        // Test Id 9
        assertTrue(StudentT.tTable(1, 1.0) < 0);
    }

    /*
    Testing for confidence Interval method
     */

    @Test
    public void testConfidenceIntervalThrowsException1() {
        // Test Id 1
        Assertions.assertThrows(NullPointerException.class,
                () -> StudentT.confidenceInterval(null, -1));
    }

    @Test
    public void testConfidenceIntervalThrowsException2() {
        // Test Id 2
        Assertions.assertThrows(NullPointerException.class,
                () -> StudentT.confidenceInterval(null, 0));
    }

    @Test
    public void testConfidenceIntervalThrowsException3() {
        // Test Id 3
        Assertions.assertThrows(NullPointerException.class,
                () -> StudentT.confidenceInterval(null, 1));
    }

    @Test
    public void testConfidenceIntervalThrowsException4() {
        // Test Id 4
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.confidenceInterval(new double[]{}, -1));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));

    }

    @Test
    public void testConfidenceIntervalThrowsException5() {
        // Test Id 5
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.confidenceInterval(new double[]{}, 0));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));

    }

    @Test
    public void testConfidenceIntervalThrowsException6() {
        // Test Id 6
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> StudentT.confidenceInterval(new double[]{}, 1));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));

    }

    @Test
    public void testConfidenceIntervalShouldReturnValue1() {
        // Test Id 7
        assertNotNull(StudentT.confidenceInterval(new double[]{2, 3}, -1));
    }

    @Test
    public void testConfidenceIntervalShouldReturnValue2() {
        // Test Id 8
        Assertions.assertArrayEquals(StudentT.confidenceInterval(new double[]{2}, 0), new double[]{2.0d, 0d / 0d});
    }

    @Test
    public void testConfidenceIntervalShouldReturnValue3() {
        // Test Id 9
        assertNotNull(StudentT.confidenceInterval(new double[]{2, 3}, 1));
    }

}
