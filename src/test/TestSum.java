package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Sum;

public class TestSum {

	@Test
	public void testSum2() {
		assertEquals(4, Sum.sum(2, 2));
	}

}
