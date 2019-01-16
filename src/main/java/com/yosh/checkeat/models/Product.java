package com.yosh.checkeat.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	private double unitPrice;
	private long idPromotion;
	private double discountPrice;
	private String name;
	private long idProduct;
	private String description;
	private double discount;
	//private String []detail;
	private String productKey;
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public long getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(long idPromotion) {
		this.idPromotion = idPromotion;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
//	public String[] getDetail() {
//		return detail;
//	}
//	public void setDetail(String[] detail) {
//		this.detail = detail;
//	}
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	
}
