package org.openmrs.module.appointmentscheduling;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTTestLogic {


    /*
        Test cases for factorial method
     */
    @Test
    public void testStudentTFactorialRACCMajorC1() {
        // Major clause C1 in Factorial method
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> StudentT.factorial(-1));
        assertTrue(exception.getMessage().contains("n must be a positive integer"));
        assertEquals(StudentT.factorial(5), 120);
    }

    @Test
    public void testStudentTFactorialRACCMajorC2() {
        // Major clause C2 in Factorial method
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> StudentT.factorial(0.5));
        assertTrue(exception.getMessage().contains("n must be a positive integer"));
        assertEquals(StudentT.factorial(5), 120);
    }

    /*
        Test cases for gamma method
     */
    @Test
    public void testStudentTGammaRACCMajorC1() {
        // Major clause C1 in Gamma method
        assertEquals(StudentT.gamma(5), 24);
        assertTrue(Double.isInfinite(StudentT.gamma(0)));
    }

    @Test
    public void testStudentTGammaRACCMajorC2() {
        // Major clause C2 in Gamma method
        assertEquals(StudentT.gamma(5), 24);
        assertEquals(StudentT.gamma(1.5), 0.88, 0.01);
    }

    /*
    Test cases for regularisedBetaFunction method
    */
    @Test
    public void testStudentTRegularisedBetaFunctionRACCMajorC1() {
        // Major clause C1 in regularisedBetaFunction method
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> StudentT.regularisedBetaFunction(0.5, 0.5, -1));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
        assertEquals(StudentT.regularisedBetaFunction(0, 0, 0), 0.0, 0);
    }

    @Test
    public void testStudentTRegularisedBetaFunctionRACCMajorC2() {
        // Major clause C2 in regularisedBetaFunction method
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> StudentT.regularisedBetaFunction(0.5, 0.5, 5));
        assertTrue(exception.getMessage().contains("must be lie between 0 and 1 (inclusive)"));
        assertEquals(StudentT.regularisedBetaFunction(0, 0, 0), 0.0, 0);
    }

}
