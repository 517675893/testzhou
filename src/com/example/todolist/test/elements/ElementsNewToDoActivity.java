package com.example.todolist.test.elements;

import android.widget.Button;
import android.widget.EditText;

import com.example.todolist.R;
import com.robotium.solo.Solo;

public class ElementsNewToDoActivity {

	private Solo solo;
	//待办事项文本输入框
	private EditText toDoItemDetailET;
	//保存按钮
	private Button saveBtn;

	public ElementsNewToDoActivity(Solo solo) {
		this.solo = solo;
	}

	/**
	 * 初始化的时候，找到所有登录页面的控件
	 */
	public void initViews() {
		solo.sleep(1500);
		// 通过id找出控件，赋值给变量
		toDoItemDetailET = (EditText) solo.getCurrentActivity().findViewById(
				R.id.toDoItemDetailET);
		saveBtn = (Button) solo.getCurrentActivity().findViewById(R.id.saveBtn);
	}

	/**
	 * 获得输入框
	 * 
	 * @return
	 */
	public EditText getToDoItemDetailET() {
		return toDoItemDetailET;
	}

	/**
	 * 点击保存按钮
	 */
	public void clickSaveButton() {
		solo.clickOnView(saveBtn);
	}

	/**
	 * 往任务项输入框中输入值
	 * 
	 * @param text
	 */
	public void enterTextToToDoItemDetailET(String text) {
		solo.enterText(toDoItemDetailET, text);
	}

}
