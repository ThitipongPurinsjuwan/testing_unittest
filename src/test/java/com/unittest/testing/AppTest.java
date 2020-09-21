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
import org.junit.Test;

public class AppTest 
{
	@Test
	  public void testAssertArrayEquals() {
	    byte[] expected = "trial".getBytes();
	    byte[] actual = "trial".getBytes();
	    assertArrayEquals("failure - byte arrays not same", expected, actual);
	  }

	  @Test
	  public void testAssertEquals() {
	    assertEquals("failure - strings are not equal", "text", "text");
	  }

	  @Test
	  public void testAssertFalse() {
	    assertFalse("failure - should be false", false);
	  }

	  @Test
	  public void testAssertNotNull() {
	    assertNotNull("should not be null", new Object());
	  }

	  @Test
	  public void testAssertNotSame() {
	    assertNotSame("should not be same Object", new Object(), new Object());
	  }

	  @Test
	  public void testAssertNull() {
	    assertNull("should be null", null);
	  }

	  @Test
	  public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(768);
	    assertSame("should be same", aNumber, aNumber);
	  }

	  // JUnit Matchers assertThat
	  @Test
	  public void testAssertThatBothContainsString() {
	    assertThat("albumen", both(containsString("a")).and(containsString("b")));
	  }

	  @Test
	  public void testAssertThatHasItems() {
	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
	  }

	  @Test
	  public void testAssertThatEveryItemContainsString() {
	    assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	  }

	  @Test
	  public void testAssertTrue() {
	    assertTrue("failure - should be true", true);
	  }
}

