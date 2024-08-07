package com.multi.shop.product.controller;

public class SearchCriteria {
	
	private String condition;
	private String value;
	
	public SearchCriteria() {}

	public SearchCriteria(String condition, String value) {
		super();
		this.condition = condition;
		this.value = value;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SearchCreteria [condition=" + condition + ", value=" + value + "]";
	}
	
	
}
