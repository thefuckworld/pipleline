package com.dw.pipleline.service;

import org.springframework.stereotype.Service;

import com.dw.pipleline.context.FlowContext;
import com.dw.pipleline.flow.Handler;
import com.dw.pipleline.flow.Node;

@Service("programmingHandler")
public class ProgrammingHandler implements Handler{

	@Override
	public Object doNext(Node next, FlowContext flowContext) {
		System.out.println("the second thing is to program. ");
		flowContext.setAttribute("secondResult", "I extract process, making it to a common module. ");
		return next.doFlow(flowContext);
	}

}
