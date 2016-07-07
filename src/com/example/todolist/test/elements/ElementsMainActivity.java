package com.example.todolist.test.elements;

import android.view.View;

import com.example.todolist.R;
import com.robotium.solo.Solo;

public class ElementsMainActivity {

	private Solo solo;
	private View actionNewView;


	public ElementsMainActivity(Solo solo) {
		this.solo = solo;
	}

	/**
	 * 初始化的时候，找到所有登录页面的控件
	 */
	public void initViews() {
		// 通过id找出控件，赋值给变量
		actionNewView = (View)solo.getCurrentActivity().findViewById(R.id.action_new);
	}

	public View getActionNewView(){
		return actionNewView;
	}
	
	public void clickOnActionNewView(){
		solo.clickOnView(actionNewView);
	}

}
