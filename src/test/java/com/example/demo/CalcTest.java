package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.util.Calc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalcTest {

	@Autowired
	private Calc calc;
	
	@Test
	public void addTest() {
		int result = calc.add(4, 4);
		assertEquals(8, result);
	}
	
	@Test
	public void minusTest() {
		int result = calc.minus(8, 4);
		assertEquals(4, result);
	}
	
	@Test
	public void multiplyTest() {
		int result = calc.multiply(4, 4);
		assertEquals(16, result);
	}
	
	@Test
	public void division() {
		int result = calc.division(4, 4);
		assertEquals(1, result);
	}
}
