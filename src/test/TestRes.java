package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Res;

public class TestRes {

	@Test
	public void testRes2() {
		assertEquals(0, Res.res(2, 2));
	}
	
	@Test
	public void testRes3() {
		assertEquals(1, Res.res(5, 2,2));
	}
	
	@Test
	public void testResNumWithZero() {
		assertEquals(3, Res.res(3, 0));
		assertEquals(-3, Res.res(0, 3));
	}

}
