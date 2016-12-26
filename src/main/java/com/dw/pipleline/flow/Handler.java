package com.dw.pipleline.flow;

import com.dw.pipleline.context.FlowContext;

public interface Handler {
	
	Object doNext(Node next, FlowContext flowContext);
}
