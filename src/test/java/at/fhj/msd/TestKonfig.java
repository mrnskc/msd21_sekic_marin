package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestKonfig {
    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd1() {
        Assertions.assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void testAdd2() {
        int test = 2+2;
        Assertions.assertEquals(test, calc.add(2, 2));
    }

    @Test
    public void testMinus1(){
        Assertions.assertEquals(4,calc.minus(8,4));
    }

    @Test
    public void testMinus2(){
        int test = 8-4;
        Assertions.assertEquals(test,calc.minus(8,4));
    }

    @Test
    public void testDivide1(){
        Assertions.assertEquals(4,calc.divide(16,4));
    }

    @Test
    public void testDivide2(){
        int test = 16/4;
        Assertions.assertEquals(test,calc.divide(16,4));
    }

    @Test
    public void testMultiply1(){
        Assertions.assertEquals(4,calc.multiply(2,2));
    }

    @Test
    public void testMultiply2(){
        int test = 2*2;
        Assertions.assertEquals(test,calc.multiply(2,2));
    }

    @Test
    public void testFaculty1(){
        Assertions.assertEquals(5,calc.faculty(5));
    }

    @Test
    public void testFaculty2(){
        Assertions.assertEquals(-1,calc.faculty(-1));
    }

    @Test
    public void testFaculty3(){
        Assertions.assertEquals(10,calc.faculty(10));
    }
}
