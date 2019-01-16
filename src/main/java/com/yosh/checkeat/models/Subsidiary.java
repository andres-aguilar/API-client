package com.yosh.checkeat.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subsidiary {

	private Long idSubsidiary;
	private String image;
	private String subsidiaryKey;
	private boolean activeTaim;
	private double shippingCost;
	private long idCompany;
	private boolean activeTakeAway;
	private String deliveryTime;
	private String latitude;
	private long idCategory;
	private boolean activeDelivery;
	private boolean activeReservations;
	private ShowMenu showMenu;
	private String name;
	private boolean activeDineIn;
	private boolean activePromotions;
	private String category;
	private double minimalPrice;
	private String longitude;
	
	public Long getIdSubsidiary() {
		return idSubsidiary;
	}
	public void setIdSubsidiary(Long idSubsidiary) {
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
	public long getIdCompany() {
		return idCompany;
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
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
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
	public ShowMenu getShowMenu() {
		return showMenu;
	}
	public void setShowMenu(ShowMenu showMenu) {
		this.showMenu = showMenu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
