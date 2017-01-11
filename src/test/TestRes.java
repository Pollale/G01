package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Res;

public class TestRes {

	@Test
	public void testRes2() {
		assertEquals(0, Res.res(2, 2));
	}

}
