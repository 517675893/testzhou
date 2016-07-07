package com.example.todolist.test.testcase.login;

import com.example.todolist.test.BasicTestCase;

public class Login_2 extends BasicTestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testTestCase2() {
		//通过统一入口对象uiHelper得到登录页面的控件类
		//通过控件类调用点击登录按钮的方法
		uiHelper.getElementsLoginActivity().clickLoginButton();
		//搜索错误提示文本是否存在，如果不存在的话就断言失败，并给出错误提示信息‘错误提示信息没有出现,可能出现BUG.’
	    assertTrue("错误提示信息没有出现,可能出现BUG.",uiHelper.getSolo().searchText("用户名或者密码不能为空！", true));
	}
}
