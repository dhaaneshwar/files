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

public class TodoBusinessImplStubTest {
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		TodoService todoServiceStub=new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos=todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
	}

}
