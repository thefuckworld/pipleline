package com.dw.pipleline.flow;

import com.dw.pipleline.context.FlowContext;


public interface Node {
	
	Object doFlow(FlowContext flowContext);

}
