package com.dw.pipleline.flow;

import com.dw.pipleline.context.FlowContext;

public class DefaultNode implements Node{

	private Handler handler;
	private Node next;
	

	@Override
	public Object doFlow(FlowContext flowContext) {
		if(handler != null) {
			return handler.doNext(next, flowContext);
		}
		
		return null;
	}
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
