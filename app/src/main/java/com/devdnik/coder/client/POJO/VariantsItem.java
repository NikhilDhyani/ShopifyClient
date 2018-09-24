package com.devdnik.coder.client.POJO;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class VariantsItem{

	@SerializedName("inventory_management")
	private Object inventoryManagement;

	@SerializedName("old_inventory_quantity")
	private int oldInventoryQuantity;

	@SerializedName("requires_shipping")
	private boolean requiresShipping;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("title")
	private String title;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("inventory_item_id")
	private long inventoryItemId;

	@SerializedName("price")
	private String price;

	@SerializedName("product_id")
	private long productId;

	@SerializedName("option3")
	private Object option3;

	@SerializedName("option1")
	private String option1;

	@SerializedName("id")
	private long id;

	@SerializedName("option2")
	private Object option2;

	@SerializedName("sku")
	private String sku;

	@SerializedName("grams")
	private int grams;

	@SerializedName("barcode")
	private Object barcode;

	@SerializedName("inventory_quantity")
	private int inventoryQuantity;

	@SerializedName("compare_at_price")
	private Object compareAtPrice;

	@SerializedName("fulfillment_service")
	private String fulfillmentService;

	@SerializedName("taxable")
	private boolean taxable;

	@SerializedName("weight")
	private double weight;

	@SerializedName("inventory_policy")
	private String inventoryPolicy;

	@SerializedName("weight_unit")
	private String weightUnit;

	@SerializedName("admin_graphql_api_id")
	private String adminGraphqlApiId;

	@SerializedName("position")
	private int position;

	@SerializedName("image_id")
	private Object imageId;

	public void setInventoryManagement(Object inventoryManagement){
		this.inventoryManagement = inventoryManagement;
	}

	public Object getInventoryManagement(){
		return inventoryManagement;
	}

	public void setOldInventoryQuantity(int oldInventoryQuantity){
		this.oldInventoryQuantity = oldInventoryQuantity;
	}

	public int getOldInventoryQuantity(){
		return oldInventoryQuantity;
	}

	public void setRequiresShipping(boolean requiresShipping){
		this.requiresShipping = requiresShipping;
	}

	public boolean isRequiresShipping(){
		return requiresShipping;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setInventoryItemId(long inventoryItemId){
		this.inventoryItemId = inventoryItemId;
	}

	public long getInventoryItemId(){
		return inventoryItemId;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setProductId(long productId){
		this.productId = productId;
	}

	public long getProductId(){
		return productId;
	}

	public void setOption3(Object option3){
		this.option3 = option3;
	}

	public Object getOption3(){
		return option3;
	}

	public void setOption1(String option1){
		this.option1 = option1;
	}

	public String getOption1(){
		return option1;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setOption2(Object option2){
		this.option2 = option2;
	}

	public Object getOption2(){
		return option2;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setGrams(int grams){
		this.grams = grams;
	}

	public int getGrams(){
		return grams;
	}

	public void setBarcode(Object barcode){
		this.barcode = barcode;
	}

	public Object getBarcode(){
		return barcode;
	}

	public void setInventoryQuantity(int inventoryQuantity){
		this.inventoryQuantity = inventoryQuantity;
	}

	public int getInventoryQuantity(){
		return inventoryQuantity;
	}

	public void setCompareAtPrice(Object compareAtPrice){
		this.compareAtPrice = compareAtPrice;
	}

	public Object getCompareAtPrice(){
		return compareAtPrice;
	}

	public void setFulfillmentService(String fulfillmentService){
		this.fulfillmentService = fulfillmentService;
	}

	public String getFulfillmentService(){
		return fulfillmentService;
	}

	public void setTaxable(boolean taxable){
		this.taxable = taxable;
	}

	public boolean isTaxable(){
		return taxable;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public double getWeight(){
		return weight;
	}

	public void setInventoryPolicy(String inventoryPolicy){
		this.inventoryPolicy = inventoryPolicy;
	}

	public String getInventoryPolicy(){
		return inventoryPolicy;
	}

	public void setWeightUnit(String weightUnit){
		this.weightUnit = weightUnit;
	}

	public String getWeightUnit(){
		return weightUnit;
	}

	public void setAdminGraphqlApiId(String adminGraphqlApiId){
		this.adminGraphqlApiId = adminGraphqlApiId;
	}

	public String getAdminGraphqlApiId(){
		return adminGraphqlApiId;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getPosition(){
		return position;
	}

	public void setImageId(Object imageId){
		this.imageId = imageId;
	}

	public Object getImageId(){
		return imageId;
	}

	@Override
 	public String toString(){
		return 
			"VariantsItem{" + 
			"inventory_management = '" + inventoryManagement + '\'' + 
			",old_inventory_quantity = '" + oldInventoryQuantity + '\'' + 
			",requires_shipping = '" + requiresShipping + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",title = '" + title + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",inventory_item_id = '" + inventoryItemId + '\'' + 
			",price = '" + price + '\'' + 
			",product_id = '" + productId + '\'' + 
			",option3 = '" + option3 + '\'' + 
			",option1 = '" + option1 + '\'' + 
			",id = '" + id + '\'' + 
			",option2 = '" + option2 + '\'' + 
			",sku = '" + sku + '\'' + 
			",grams = '" + grams + '\'' + 
			",barcode = '" + barcode + '\'' + 
			",inventory_quantity = '" + inventoryQuantity + '\'' + 
			",compare_at_price = '" + compareAtPrice + '\'' + 
			",fulfillment_service = '" + fulfillmentService + '\'' + 
			",taxable = '" + taxable + '\'' + 
			",weight = '" + weight + '\'' + 
			",inventory_policy = '" + inventoryPolicy + '\'' + 
			",weight_unit = '" + weightUnit + '\'' + 
			",admin_graphql_api_id = '" + adminGraphqlApiId + '\'' + 
			",position = '" + position + '\'' + 
			",image_id = '" + imageId + '\'' + 
			"}";
		}
}