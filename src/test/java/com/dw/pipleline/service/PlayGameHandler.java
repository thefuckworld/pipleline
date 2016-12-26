package com.dw.pipleline.service;

import org.springframework.stereotype.Service;

import com.dw.pipleline.context.FlowContext;
import com.dw.pipleline.flow.Handler;
import com.dw.pipleline.flow.Node;

@Service("playGameHandler")
public class PlayGameHandler implements Handler{

	@Override
	public Object doNext(Node next, FlowContext flowContext) {
		System.out.println("Let's play game of LOL. ");
		flowContext.setAttribute("thirdResult", "Team work is exciting.");
		return next.doFlow(flowContext);
	}

}
