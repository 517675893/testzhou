package com.example.todolist.test.testcase.login;

import com.example.todolist.test.BasicTestCaseWithLogin;

public class Login_3 extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testTestCase3() {
		//验证待办事项的按钮有没有存在，不存在的话就给出错误提示信息‘新建待办事项的按钮不存在！’
		assertTrue("新建待办事项的按钮不存在！",uiHelper.getElementsMainActivity().getActionNewView().isShown());
	}

}