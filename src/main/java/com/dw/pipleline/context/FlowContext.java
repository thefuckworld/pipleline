package com.dw.pipleline.context;

import java.util.HashMap;
import java.util.Map;

public class FlowContext {
	
	private Map<String, Object> ctx = new HashMap<String, Object> ();
	
	public Object setAttribute(String key, Object obj) {
		ctx.put(key, obj);
		return obj;
	}
	
	public Object getAttribute(String key) {
		return ctx.get(key);
	}

}
