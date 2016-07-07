package com.example.todolist.test.testcase.login;

import com.example.todolist.test.BasicTestCase;

public class DebugTest extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDebug() {
		uiHelper.getElementsLoginActivity().enterName("abc");
		uiHelper.getElementsLoginActivity().enterPassword("123");
		uiHelper.getSolo().clearEditText(uiHelper.getElementsLoginActivity().getNameEditText());
		String pwdValue = uiHelper.getElementsLoginActivity().getPasswordEditText().getText().toString();
		assertTrue("".equals(pwdValue));
		//为了举例需要，正常情况下这个验证点用如下的方式比较好，运行失败直接从错误信息就可以知道密码框的值是多少
//		assertEquals("",pwdValue);
	}

}
