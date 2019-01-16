package com.yosh.checkeat.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubsidiaryDetails {
	// https://sandbox-checkeat.appspot.com/api/v2/subsidiary/ahJzfnNhbmRib3gtY2hlY2tlYXRyKwsSB0NvbXBhbnkYgICAgICAgAoMCxIKU3Vic2lkaWFyeRiAgICAoJKfCgw/detail
	private long idSubsidiary;
	private String image;
	private String subsidiaryKey;
	private String images[];
	private String address[];
	private long idCompany;
	private String txtShare;
	private String description;
	private boolean []services;
	private boolean carousel;
	private boolean error;
	private String homePage;
	private long idCategory;
	private String horary;
	private String phone;
	private String name;
	private String category;
	private int statusCode;
	
	public long getIdSubsidiary() {
		return idSubsidiary;
	}
	public void setIdSubsidiary(long idSubsidiary) {
		this.idSubsidiary = idSubsidiary;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSubsidiaryKey() {
		return subsidiaryKey;
	}
	public void setSubsidiaryKey(String subsidiaryKey) {
		this.subsidiaryKey = subsidiaryKey;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public long getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(long idCompany) {
		this.idCompany = idCompany;
	}
	public String getTxtShare() {
		return txtShare;
	}
	public void setTxtShare(String txtShare) {
		this.txtShare = txtShare;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean[] getServices() {
		return services;
	}
	public void setServices(boolean[] services) {
		this.services = services;
	}
	public boolean isCarousel() {
		return carousel;
	}
	public void setCarousel(boolean carousel) {
		this.carousel = carousel;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}
	public String getHorary() {
		return horary;
	}
	public void setHorary(String horary) {
		this.horary = horary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
