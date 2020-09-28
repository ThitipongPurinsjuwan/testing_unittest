package com.unittest.testing;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	Fahrenheit object;
    
    @Before
    public void newClassFahrenheit() {
    	object = new Fahrenheit();
    }
    
    @Test
    public void testResult0Input0() {
    	double expected = 0;
    	double input = 0;
    	object.input(input);
    	double actual = object.getCelcius();
    	assertEquals(expected, actual,2);
    }
    
    @Test
    public void testResult1000Input1000() {
    	double expected = 1000;
    	double input = 1000;
    	object.input(input);
    	double actual = object.getCelcius();
    	assertEquals(expected, actual,2);
    }
    
    @Test
    public void testResultNegative1000InputNegative1000() {
    	double expected = -1000;
    	double input = -1000;
    	object.input(input);
    	double actual = object.getCelcius();
    	assertEquals(expected, actual,2);
    }
    
    
    
//  ---------------------------------  test input //
    
    @Test
    public void testResultTrueInputNegative1() {
    	boolean expected = true;
    	double input = -1;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    
    @Test
    public void testResultTrueInput499() {
    	boolean expected = true;
    	double input = 499;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInputNegative499() {
    	boolean expected = true;
    	double input = -499;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInput500() {
    	boolean expected = true;
    	double input = 500;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInputNegative500() {
    	boolean expected = true;
    	double input = -500;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInput501() {
    	boolean expected = true;
    	double input = 501;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInputNegative501() {
    	boolean expected = true;
    	double input = 501;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInputNegative999() {
    	boolean expected = true;
    	double input = -999;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInpute999() {
    	boolean expected = true;
    	double input = 999;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
   
    
    @Test
    public void testResultTrueInputNegative1000() {
    	boolean expected = true;
    	double input = -1000;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultTrueInput1000() {
    	boolean expected = true;
    	double input = 1000;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultFalseInputNegative1001() {
    	boolean expected = false;
    	double input = -1001;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultFalseInput1001() {
    	boolean expected = false;
    	double input = 1001;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultFalseInput1010() {
    	boolean expected = false;
    	double input = 1010;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultFalseInputNegative1010() {
    	boolean expected = false;
    	double input = -1010;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultFalseInputNegative2000() {
    	boolean expected = false;
    	double input = -2000;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testResultFalseInput2000() {
    	boolean expected = false;
    	double input = 2000;
    	boolean actual = object.isBound(input);
    	assertEquals(expected, actual);
    }
    
//    ----------------------------- End test input //
    
    
//    ------------------------------------------------------ test case expected output //
    
//    @Test
//    public void testResultNegative30InputNegative1() {
//    	double expected = 30.2;
//    	double input = -1;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual,2);
//    }
//    
//    @Test
//    public void testResultNegative866InputNegative499() {
//    	double expected = -866.2;
//    	double input = -499;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual,2);
//    }
//    
//    @Test
//    public void testResultNegative868InputNegative500() {
//    	double expected = -868;
//    	double input = -500;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResultNegative869InputNegative501() {
//    	double expected = -869.8;
//    	double input = -501;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResultNegative1766InputNegative999() {
//    	double expected = 1766.2;
//    	double input = -999;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResultNegative1768InputNegative1000() {
//    	double expected = -1768;
//    	double input = -1000;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResultErrorInputNegative1001() {
//    	double expected = 1;
//    	double input = -1001;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResultErrorInputNegative1010() {
//    	double expected = 1;
//    	double input = -1010;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//   
//    @Test
//    public void testResultErrorInputNegative2000() {
//    	double expected = 1;
//    	double input = -2000;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResult33Input1() {
//    	double expected = 33.8;
//    	double input = 1;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResult930Input499() {
//    	double expected = 930.2;
//    	double input = 499;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResult932Input500() {
//    	double expected = 932;
//    	double input = 500;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResult933Input501() {
//    	double expected = 933.8;
//    	double input = 501;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResult1830Input999() {
//    	double expected = 1830.2;
//    	double input = 999;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResult1832Input1000() {
//    	double expected = 1832;
//    	double input = 1000;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResultErrorInput1001() {
//    	double expected = 1;
//    	double input = 1001;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testResultErrorInput1010() {
//    	double expected = 1;
//    	double input = 1010;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
//   
//    @Test
//    public void testResultErrorInput2000() {
//    	double expected = 1;
//    	double input = 2000;
//    	object.input(input);
//    	double actual = object.getCelcius();
//    	assertEquals(expected, actual);
//    }
    
    
//    -------------------------------------------- end expected output //
    
    
    
    
    
//	@Test
//	  public void testAssertArrayEquals() {
//		int[] expected = {1,2,3,4,5};
////	    byte[] expected = "trial".getBytes();
//	    int[] actual = {2,3,1,4,5};
//	    assertArrayEquals("failure - byte arrays not same", expected, actual);
//	  }
//
//	  @Test
//	  public void testAssertEquals() {
//	    assertEquals("failure - strings are not equal", "text", "text");
//	  }
//
//	  @Test
//	  public void testAssertFalse() {
//	    assertFalse("failure - should be false", false);
//	  }
//
//	  @Test
//	  public void testAssertNotNull() {
//	    assertNotNull("should not be null", new Object());
//	  }
//
//	  @Test
//	  public void testAssertNotSame() {
//	    assertNotSame("should not be same Object", new Object(), new Object());
//	  }
////
//	  @Test
//	  public void testAssertNull() {
//	    assertNull("should be null", null);
//	  }
////
//	  @Test
//	  public void testAssertSame() {
//	    Integer aNumber = Integer.valueOf(768);
//	    assertSame("should be same", aNumber, aNumber);
//	  }
//
//	  // JUnit Matchers assertThat
//	  @Test
//	  public void testAssertThatBothContainsString() {
//	    assertThat("albumen", both(containsString("a")).and(containsString("b")));
//	  }
//
//	  @Test
//	  public void testAssertThatHasItems() {
//	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
//	  }
////
//	  @Test
//	  public void testAssertThatEveryItemContainsString() {
//	    assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
//	  }

//	  @Test
//	  public void testAssertTrue() {
//	    assertTrue("failure - should be true", true);
//	  }
}

