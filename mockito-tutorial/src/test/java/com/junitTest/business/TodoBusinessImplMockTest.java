package com.junitTest.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.junitTest.mockito.TodoServiceStub;
import com.junitTesting.business.TodoBusinessImpl;
import com.junitTesting.mockito.TodoService;

public class TodoBusinessImplMockTest {
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		
		TodoService todoServiceMock=mock(TodoService.class);
//		List<String> todos=Arrays.asList();
		List<String> todos=Arrays.asList("Learn Spring MVC","Learn Spring","Learn to dance");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		System.out.println(todoServiceMock);

		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos=todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
	}

}
