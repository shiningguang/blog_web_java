package com.chen.common.db.model;

import java.io.Serializable;

public class EntityModel<T extends Serializable> implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7857539476919437601L;
	
	private T id;

	public T getId() {
		return id;
	}

	
}
