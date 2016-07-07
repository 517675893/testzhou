package com.example.todolist.test.testcase.login;

import com.example.todolist.test.BasicTestCase;

public class Login_1 extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testTestCase1() {
		// 在用户名输入框输入abcdef
		uiHelper.getElementsLoginActivity().enterName("abcdef");
		// 在密码框输入123456
		uiHelper.getElementsLoginActivity().enterPassword("12345678");
		// 点击登录按钮
		uiHelper.getElementsLoginActivity().clickLoginButton();
		// 点击登录按钮
		//第一个参数是指如果验证失败的情况下，要显示的提示字符串
		//第二个参数是指要用来断言的表达式
		assertTrue("错误提示信息没有出现,可能出现BUG.", uiHelper.getSolo().searchText("用户名或者密码错误！", true));
	}

}