package com.yosh.checkeat.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubsidiaryGeneral {
	//private long idFavorite;
	private long idCompany;
	private boolean activeTakeAway;
	private String deliveryTime;
	private boolean error;
	private String homePage;
	private Product []promotionProductList;
	private long idCategory;
	private boolean activeDelivery;
	private boolean activeReservations;
	private Category []categoryList;
	private boolean activeDineIn;
	private boolean activePromotions;
	private long idSubsidiary;
	private CategoryProduct []categoryProductList;
	private String image;
	private String subsidiaryKey;
	private boolean activeTaim;
	private double shippingCost;
	private String txtShare;
	//private String []horary;
	//private String reservations;
	private String name;
	//information	{…}
	private String category;
	private double minimalPrice;
	//private String []favorite;
	//private boolean isFavorite;
	
//	public long getIdFavorite() {
//		return idFavorite;
//	}
//	public void setIdFavorite(long idFavorite) {
//		this.idFavorite = idFavorite;
//	}
	
	
	public long getIdCompany() {
		return idCompany;
	}
	public CategoryProduct[] getCategoryProductList() {
		return categoryProductList;
	}
	public void setCategoryProductList(CategoryProduct[] categoryProductList) {
		this.categoryProductList = categoryProductList;
	}
	public void setIdCompany(long idCompany) {
		this.idCompany = idCompany;
	}
	public boolean isActiveTakeAway() {
		return activeTakeAway;
	}
	public void setActiveTakeAway(boolean activeTakeAway) {
		this.activeTakeAway = activeTakeAway;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
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
	public Product[] getPromotionProductList() {
		return promotionProductList;
	}
	public void setPromotionProductList(Product[] promotionProductList) {
		this.promotionProductList = promotionProductList;
	}
	public long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}
	public boolean isActiveDelivery() {
		return activeDelivery;
	}
	public void setActiveDelivery(boolean activeDelivery) {
		this.activeDelivery = activeDelivery;
	}
	public boolean isActiveReservations() {
		return activeReservations;
	}
	public void setActiveReservations(boolean activeReservations) {
		this.activeReservations = activeReservations;
	}
	public Category[] getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(Category[] categoryList) {
		this.categoryList = categoryList;
	}
	public boolean isActiveDineIn() {
		return activeDineIn;
	}
	public void setActiveDineIn(boolean activeDineIn) {
		this.activeDineIn = activeDineIn;
	}
	public boolean isActivePromotions() {
		return activePromotions;
	}
	public void setActivePromotions(boolean activePromotions) {
		this.activePromotions = activePromotions;
	}
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
	public boolean isActiveTaim() {
		return activeTaim;
	}
	public void setActiveTaim(boolean activeTaim) {
		this.activeTaim = activeTaim;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	public String getTxtShare() {
		return txtShare;
	}
	public void setTxtShare(String txtShare) {
		this.txtShare = txtShare;
	}
//	public String[] getHorary() {
//		return horary;
//	}
//	public void setHorary(String[] horary) {
//		this.horary = horary;
//	}
//	public String getReservations() {
//		return reservations;
//	}
//	public void setReservations(String reservations) {
//		this.reservations = reservations;
//	}
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
	public double getMinimalPrice() {
		return minimalPrice;
	}
	public void setMinimalPrice(double minimalPrice) {
		this.minimalPrice = minimalPrice;
	}
//	public String[] getFavorite() {
//		return favorite;
//	}
//	public void setFavorite(String[] favorite) {
//		this.favorite = favorite;
//	}
//	public boolean isFavorite() {
//		return isFavorite;
//	}
//	public void setFavorite(boolean isFavorite) {
//		this.isFavorite = isFavorite;
//	}
	
}
