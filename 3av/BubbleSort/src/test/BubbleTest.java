package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import bubble.BubbleSort;

class BubbleTest {
	
	
	@Test
	void bubbleTestOneByOne() {
		BubbleSort bs = new BubbleSort();
		assertArrayEquals(bs.sort(new int[]{1,2,3,4,5}),  new int[]{1,2,3,4,5});
		assertArrayEquals(bs.sort(new int[]{5,4,3,2,1}),  new int[]{1,2,3,4,5});
		assertArrayEquals(bs.sort(new int[]{-1,0,1}),     new int[]{-1,0,1});
		assertArrayEquals(bs.sort(new int[]{1,-1,0}),  	  new int[]{-1,0,1});
		assertArrayEquals(bs.sort(new int[]{3,2,3,0,3}),  new int[]{0,2,3,3,3});
		assertArrayEquals(bs.sort(new int[]{64, 34, 25, 12, 22, 11, 90}),  new int[]{11,12,22,25,34,64,90});
		
	}
}
