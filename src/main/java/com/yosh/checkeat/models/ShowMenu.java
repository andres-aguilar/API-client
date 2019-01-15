package com.yosh.checkeat.models;

public class ShowMenu {
	/*
	 * "method": "GET", 
	 * "href": "https://sandbox-checkeat.appspot.com/api/v2/subsidiary/ahJzfnNhbmRib3gtY2hlY2tlYXRyKwsSB0NvbXBhbnkYgICAgO6shAkMCxIKU3Vic2lkaWFyeRiAgICAgICACgw" 
	 */
	
	private String method;
	private String href; 
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	
}
