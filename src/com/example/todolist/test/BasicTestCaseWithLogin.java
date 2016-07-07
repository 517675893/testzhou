package com.example.todolist.test;


abstract public class BasicTestCaseWithLogin extends
		BasicTestCase {
	
	 @Override
	  protected void setUp() throws Exception {
	    // TODO Auto-generated method stub
	    super.setUp();
	    //因为用户名是1，密码是1，所以构造账号密码字符串数组new String[]{"1","1"}
	    uiHelper.getElementsLoginActivity().doLoginWithAccount(new String[]{"1","1"});
	  }

}