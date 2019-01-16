package com.yosh.checkeat.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryProduct {
	private String name;
	private long idCategory;
	private Product []productList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}
	public Product[] getProductList() {
		return productList;
	}
	public void setProductList(Product[] productList) {
		this.productList = productList;
	}
}
