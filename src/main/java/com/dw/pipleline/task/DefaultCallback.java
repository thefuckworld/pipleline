package com.dw.pipleline.task;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.dw.framework.threadpool.IAsynchronousHandler;
import com.dw.pipleline.context.FlowContext;
import com.dw.pipleline.flow.Node;
import com.dw.pipleline.util.SpringUtil;

public class DefaultCallback implements IAsynchronousHandler{
	private final String flowStartNodeName;
    private final Map<String, Object> params;
	
    public DefaultCallback(Map<String, Object> params, String flowStartNodeName) {
    	this.params = params;
    	this.flowStartNodeName = flowStartNodeName;
    }
    
	@Override
	public Object call() throws Exception {
		
		if(StringUtils.isBlank(flowStartNodeName)) {
			return null;
		}
		
		FlowContext flowContext = new FlowContext();
		
		if(params != null && !params.isEmpty()) {
			Iterator<String> iterator = params.keySet().iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				Object value = params.get(key);
				flowContext.setAttribute(key, value);
			}
		}
		
		Node startNode = SpringUtil.getApplicationContext().getBean(flowStartNodeName, Node.class);
		return startNode.doFlow(flowContext);
	}

	@Override
	public void executeAfter(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeBefore(Thread t) {
		// TODO Auto-generated method stub
		
	}
}
