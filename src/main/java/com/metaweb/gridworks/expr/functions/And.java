package com.metaweb.gridworks.expr.functions;

import java.util.Properties;

import com.metaweb.gridworks.expr.Function;

public class And implements Function {

	@Override
	public Object call(Properties bindings, Object[] args) {
		for (Object o : args) {
			if (!Not.objectToBoolean(o)) {
				return false;
			}
		}
		return true;
	}
}