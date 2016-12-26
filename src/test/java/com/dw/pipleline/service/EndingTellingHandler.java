package com.dw.pipleline.service;

import org.springframework.stereotype.Service;

import com.dw.pipleline.context.FlowContext;
import com.dw.pipleline.flow.Handler;
import com.dw.pipleline.flow.Node;

@Service("endingTellingHandler")
public class EndingTellingHandler implements Handler{

	@Override
	public Object doNext(Node next, FlowContext flowContext) {
		System.out.println("This is pipleline process. Our life can't do so. ");
		String[] keys = new String[]{"firstResult", "secondResult", "thirdResult", "fouthResult"};
		
		System.out.println("Result:");
		for(String key : keys) {
			System.out.println(flowContext.getAttribute(key));
		}
		return null;
	}

}
