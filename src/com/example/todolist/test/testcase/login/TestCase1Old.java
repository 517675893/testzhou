package com.example.todolist.test.testcase.login;

import android.test.ActivityInstrumentationTestCase2;

import com.example.todolist.LoginActivity;
import com.robotium.solo.Solo;


public class TestCase1Old extends ActivityInstrumentationTestCase2<LoginActivity> {
	private com.robotium.solo.Solo solo;
	public TestCase1Old(){
		super(LoginActivity.class);		
	}
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
		solo=new Solo(getInstrumentation() , getActivity());
		
	}
	
	public void testTestCase1(){
	solo.enterText(0, "ascdef");
	solo.enterText(1, "12456");
	solo.clickOnButton(0);
	assertTrue("错误提示信息诶有出现 ，可能出现bug", solo.searchText("用户名或者密码错误", true));
	
	}
	
	@Override
	protected void tearDown() throws Exception{
		solo.finishOpenedActivities();
	}
}
