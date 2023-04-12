package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class p1_test {

	@Test
	public void test() {
		Main_function obj1= new Main_function();
		int[] arr={10};   
		int outputf=obj1.linearSearch(10,arr);
		assertEquals(0,outputf);
	}
	
	@Test
	public void test2() {
		Main_function obj1= new Main_function();
		int[] arr={5};   
		int outputf=obj1.linearSearch(10,arr);
		assertEquals(-1,outputf);
	}
	
	@Test
	public void test3() {
		Main_function obj1= new Main_function();
		int[] arr={2,4,6,8,10};   
		int outputf=obj1.linearSearch(6,arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test4() {
		Main_function obj1= new Main_function();
		int[] arr={};   
		int outputf=obj1.linearSearch(10,arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test5() {
		Main_function obj1= new Main_function();
		int[] arr={1,3,5,7,9};   
		int outputf=obj1.linearSearch(4,arr);
		assertEquals(-1,outputf);
	}


	
	


}
