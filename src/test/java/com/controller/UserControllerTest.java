package com.controller;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	@Test
	public void _WithNullUserObject_Returns200_WithErrorMessage() {
/*result = subject.insertUser(null);
		
		assertTrue(HttpStatus.200, ResponseBody.getStatus())
		assertEquals("There is no user data passed.", result.getErrorMessage);
	}

	public void insertUser_WithEmtpyUserObject_Returns200_WithErrorMessage() {
		when(mockUserService.insertUser(useObj)).thenReturn("The user object is emtpy.")
		
		result = subject.insertUser(useObj);
		
		assertTrue(HttpStatus.200, ResponseBody.getStatus())
		assertEquals("The user object is emtpy.", result.getErrorMessage);
		
		verify(mockUserSErvice).insertUSer(useObj);*/
	}

	public void insertUser_UserObject_WithNoName_Returns200_WithErrorMessage() {
		
	}

	public void insertUser_UserObject_WithNoUserId_Returns200_WithErrorMessage() {
		
	}

	public void insertUser_UserObject_WithNoUserPassword_Returns200_WithErrorMessage() {
		
	}

	public void insertUser_WithValidUserObject_Returns200() {
		
	}

	@Test
	public void testUpdateInfoByUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUser() {
		fail("Not yet implemented");
	}

}
