package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class p3_test {

	@Test
	public void test() {
		Main_function obj1= new Main_function();
		int[] arr={12,24,2,89,34,45};   
		int outputf=obj1.binarySearch(2,arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test2() {
		Main_function obj1= new Main_function();
		int[] arr={12,24,2,89,34,45};   
		int outputf=obj1.binarySearch(24,arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test3() {
		Main_function obj1= new Main_function();
		int[] arr={12,24,2,89,34,45};   
		int outputf=obj1.binarySearch(20,arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test4() {
		Main_function obj1= new Main_function();
		int[] arr={};   
		int outputf=obj1.binarySearch(20,arr);
		assertEquals(2,outputf);
	}


}
