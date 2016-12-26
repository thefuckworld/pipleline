package com.dw.pipleline;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dw.framework.threadpool.CommonThreadPool;
import com.dw.pipleline.task.DefaultCallback;

public class TestPipleline{

	public void start() {
		Map<String, Object> params = new HashMap<String, Object> ();
		CommonThreadPool.executeForResult(new DefaultCallback(params, RoutingEnum.ONEDAYROUTING.getName()));
	}
	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"services.xml", "flow-context.xml"});
		 TestPipleline testRun = ctx.getBean("start", TestPipleline.class);
		 testRun.start();
	}
}
