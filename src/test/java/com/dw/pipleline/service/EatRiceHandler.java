package com.dw.pipleline.service;

import org.springframework.stereotype.Service;

import com.dw.pipleline.context.FlowContext;
import com.dw.pipleline.flow.Handler;
import com.dw.pipleline.flow.Node;

@Service("eatRiceHandler")
public class EatRiceHandler implements Handler{

	@Override
	public Object doNext(Node next, FlowContext flowContext) {
		System.out.println("A new day, the first thing is to eat.");
		flowContext.setAttribute("firstResult", "I'm full.");
		return next.doFlow(flowContext);
	}

}
