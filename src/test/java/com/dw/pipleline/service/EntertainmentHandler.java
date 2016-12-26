package com.dw.pipleline.service;

import org.springframework.stereotype.Service;

import com.dw.pipleline.context.FlowContext;
import com.dw.pipleline.flow.Handler;
import com.dw.pipleline.flow.Node;

@Service("entertainmentHandler")
public class EntertainmentHandler implements Handler{

	@Override
	public Object doNext(Node next, FlowContext flowContext) {
		System.out.println("Do other entertainment thing with friend.");
		flowContext.setAttribute("fouthResult", "Relaxing.");
		return next.doFlow(flowContext);
	}
}
