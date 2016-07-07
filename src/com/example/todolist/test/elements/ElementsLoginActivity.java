package com.example.todolist.test.elements;

import android.widget.Button;
import android.widget.EditText;

import com.example.todolist.R;
import com.robotium.solo.Solo;

public class ElementsLoginActivity {

	private Solo solo;
	// 声明两个变量来存储账号输入框和密码框
	private EditText nameEditText, passwordEditText;
	private Button loginButton;

	public ElementsLoginActivity(Solo solo) {
		this.solo = solo;
	}

	/**
	 * 初始化的时候，找到所有登录页面的控件
	 */
	public void initViews() {
		// 通过id找出控件，赋值给变量
		nameEditText = (EditText) solo.getCurrentActivity().findViewById(
				R.id.nameET);
		passwordEditText = (EditText) solo.getCurrentActivity().findViewById(
				R.id.passwordET);
		loginButton = (Button) solo.getCurrentActivity().findViewById(
				R.id.loginBtn);
	}

	/**
	 * 获得用户名输入框
	 * 
	 * @return
	 */
	public EditText getNameEditText() {
		return nameEditText;
	}

	/**
	 * 获得密码输入框
	 * 
	 * @return
	 */
	public EditText getPasswordEditText() {
		return passwordEditText;
	}

	/**
	 * 获得登录按钮
	 * 
	 * @return
	 */
	public Button getLoginButton() {
		return loginButton;
	}

	/**
	 * 输入用户名
	 * 
	 * @param text
	 */
	public void enterName(String text) {
		solo.enterText(nameEditText, text);
	}

	/**
	 * 输入密码
	 * 
	 * @param text
	 */
	public void enterPassword(String text) {
		// 通过solo.enterText可以往输入框输入值，第一个参数指定要输入的输入框
		// 第二个参数只是往输入框输入的值
		solo.enterText(passwordEditText, text);
	}

	/**
	 * 点击登录按钮
	 */
	public void clickLoginButton() {
		// 通过solo.clickOnView点击你要点击的View
		solo.clickOnView(loginButton);
	}

	/**
	 * 
	 * 调用这个方法只需要传入账号密码的字符串数值就可以了
	 * account[0]存放的是账号信息
	 * account[1]存放的是密码信息
	 */
	public void doLoginWithAccount(String[] account) {
		//调用这个控件类里面的enterName方法，传入account[0],也就是账号信息，实现输入账号这个动作
		enterName(account[0]);
		//调用这个控件类里的enterPassword方法，传入account[1],也就是密码信息，实现输入密码这个动作
		enterPassword(account[1]);
		//调用这个控件类的登录方法
		clickLoginButton();
		//等待主页面出现
		solo.sleep(1500);
	}

}
