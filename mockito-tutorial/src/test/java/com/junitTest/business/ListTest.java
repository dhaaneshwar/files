package com.junitTest.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {
	
	@Test
	public void letsMockListSize() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void letsMockListSize_withMultipleMethods() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void letsMockListGet() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn("Dhaanesh");
		assertEquals("Dhaanesh", listMock.get(0));
	}

}
