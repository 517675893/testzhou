package com.example.todolist.test;

import com.example.todolist.test.elements.ElementsEditToDoItemActivity;
import com.example.todolist.test.elements.ElementsLoginActivity;
import com.example.todolist.test.elements.ElementsMainActivity;
import com.example.todolist.test.elements.ElementsNewToDoActivity;
import com.robotium.solo.Solo;

public class UIHelper {
	private Solo solo = null;
	private ElementsLoginActivity elementsLoginActivity;
	private ElementsMainActivity elementsMainActivity;
	private ElementsNewToDoActivity elementsNewToDoActivity;
	private ElementsEditToDoItemActivity elementsEditToDoItemActivity;

	public UIHelper(Solo solo) {
		this.solo = solo;
	}

	public Solo getSolo() {
		return solo;
	}

	/**
	 * 获取登录页面控件类的方法
	 * @return
	 */
	public ElementsLoginActivity getElementsLoginActivity() {
		//控件类对象为空的时候在实例化
		if (elementsLoginActivity == null) {
			elementsLoginActivity = new ElementsLoginActivity(solo);
		}
		elementsLoginActivity.initViews();
		return elementsLoginActivity;
	}
	
	/**
	 * 获取任务列表控件类的方法
	 * @return
	 */
	public ElementsMainActivity getElementsMainActivity() {
		//控件类对象为空的时候在实例化
		if (elementsMainActivity == null) {
			elementsMainActivity = new ElementsMainActivity(solo);
		}
		elementsMainActivity.initViews();
		return elementsMainActivity;
	}
	
	/**
	 * 获取添加任务列表控件类的方法
	 * @return
	 */
	public ElementsNewToDoActivity getElementsNewToDoActivity() {
		//控件类对象为空的时候在实例化
		if (elementsNewToDoActivity == null) {
			elementsNewToDoActivity = new ElementsNewToDoActivity(solo);
		}
		elementsNewToDoActivity.initViews();
		return elementsNewToDoActivity;
	}
	
	/**
	 * 获取任务编辑页面控件类的方法
	 * @return
	 */
	public ElementsEditToDoItemActivity getElementsEditToDoItemActivity() {
		//控件类对象为空的时候在实例化
		if (elementsEditToDoItemActivity == null) {
			elementsEditToDoItemActivity = new ElementsEditToDoItemActivity(solo);
		}
		elementsEditToDoItemActivity.initViews();
		return elementsEditToDoItemActivity;
	}
}