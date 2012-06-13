package com.nawf.dom.validate;

import com.nawf.client.Message;

public class RequiredRule<T> extends ValidationRule<T>{
	@Override
	public Message validate(T value) throws FieldValidationException {
		if(value == null){
			return new Message(Message.Level.Error, " is a required field.");
		}
		return null;
	}
}
