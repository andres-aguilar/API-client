package com.yosh.checkeat.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainRequest {
	private Subsidiary []subsidiaryList;
	private int total;
	private Category []categoryList;
	private Category []principalCategoryList;
	private boolean error;
	private int statusCode;
	
	public Subsidiary[] getSubsidiaryList() {
		return subsidiaryList;
	}
	public void setSubsidiaryList(Subsidiary[] subsidiaryList) {
		this.subsidiaryList = subsidiaryList;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Category[] getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(Category[] categoryList) {
		this.categoryList = categoryList;
	}
	public Category[] getPrincipalCategoryList() {
		return principalCategoryList;
	}
	public void setPrincipalCategoryList(Category[] principalCategoryList) {
		this.principalCategoryList = principalCategoryList;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
