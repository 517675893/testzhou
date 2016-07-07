package com.example.todolist.test;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;

import com.example.todolist.LoginActivity;
import com.example.todolist.test.utils.NetworkUtil;
import com.example.todolist.test.utils.Util;
import com.robotium.solo.Solo;

abstract public class BasicTestCaseOld extends
		ActivityInstrumentationTestCase2<LoginActivity> {
	private Solo solo;
	private PowerManager.WakeLock wakeScreenObject = null;

	public BasicTestCaseOld() {
		super(LoginActivity.class);
	}
	

	/**
	 * 复写setUp进行异常捕获，截图处理
	 * 
	 * @throws Exception
	 */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		try {
			super.setUp();
			init();
		} catch (Throwable tr) {
			throw new SetUpException(tr);
		}
	}
	
	
	/**
	 * 复写runTest,捕获异常进行截图处理
	 * 
	 * @throws Throwable
	 */
	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		try {
			super.runTest();
		} catch (junit.framework.AssertionFailedError afe) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw afe;
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new RunTestException(th);
		}
	}

	
	/**
	 * 复写tearDown,进行异常捕获，截图处理
	 * 
	 * @throws Exception
	 */
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		try {
			if (wakeScreenObject != null) {
				wakeScreenObject.release();
				wakeScreenObject = null;
			}
			super.tearDown();
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new TearDownException(th);
		}finally{
			solo.finishOpenedActivities();
		}

	}

	private void init() {
		solo = new Solo(getInstrumentation(), getActivity());
		// 唤醒设备
		if (wakeScreenObject == null) {
			wakeScreenObject = Util.wakeScreen(this);
		}
		// 解锁
		Util.unlock(getInstrumentation());
		// 连接网络
		NetworkUtil.setAirplaneModeOffAndNetworkOn(getInstrumentation()
				.getTargetContext());
	}
	

	/**
	 * 只有setUp没有被包含在异常处理里面，重写runBare把异常处理加进去
	 * 
	 * @throws Throwable
	 */
	@Override
	public void runBare() throws Throwable {
		try {
			super.runBare();
		} catch (SetUpException smte) {
			solo.takeScreenshot(this.getClass().getSimpleName());
            this.tearDown();
            throw smte;
		}
	}


	/**
	 * 三个自定义的异常类，对应setUp时发生的异常，runTest发生的异常，tearDown发生的异常
	 * 
	 * @author hiworld
	 *
	 */
	class SetUpException extends Exception {
		private static final long serialVersionUID = 1L;

		SetUpException(Throwable e) {
			super("Error in BasicTestCase.setUp()!", e);
		}
	}

	class RunTestException extends Exception {
		private static final long serialVersionUID = 2L;

		RunTestException(Throwable e) {
			super("Error in BasicTestCase.runTest()", e);
		}
	}

	class TearDownException extends Exception {
		private static final long serialVersionUID = 3L;

		TearDownException(Throwable e) {
			super("Error in MultiTestCase.tearDown()", e);
		}
	}

}