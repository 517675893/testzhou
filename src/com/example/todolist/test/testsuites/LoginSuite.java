package com.example.todolist.test.testsuites;

import junit.framework.TestSuite;

import com.example.todolist.test.testcase.login.Login_1;
import com.example.todolist.test.testcase.login.Login_2;
import com.example.todolist.test.testcase.login.Login_3;

public class LoginSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(Login_1.class);
		suite.addTestSuite(Login_2.class);
		suite.addTestSuite(Login_3.class);
		return suite;
	}
}
