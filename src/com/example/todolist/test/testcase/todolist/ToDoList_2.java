package com.example.todolist.test.testcase.todolist;


import com.example.todolist.test.BasicTestCaseWithLogin;

public class ToDoList_2 extends BasicTestCaseWithLogin {
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testToDoList_2() {
		//点击新建待办事项按钮
		uiHelper.getElementsMainActivity().clickOnActionNewView();
		//往输入框输入testlongclick文本
		uiHelper.getElementsNewToDoActivity().enterTextToToDoItemDetailET(
				"testlongclick");
		//点击保存按钮
		uiHelper.getElementsNewToDoActivity().clickSaveButton();
		uiHelper.getSolo().sleep(1500);
		//验证添加成功
		assertTrue(uiHelper.getSolo().searchText("testlongclick", true));
		uiHelper.getSolo().clickLongOnText("testlongclick");
		//验证编辑选项存在
		assertTrue(uiHelper.getSolo().searchText("编辑", true));
		//验证删除选项存在
		assertTrue(uiHelper.getSolo().searchText("删除", true));
	}
}
