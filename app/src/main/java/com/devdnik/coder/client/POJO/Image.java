package com.devdnik.coder.client.POJO;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Image{

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("src")
	private String src;

	@SerializedName("product_id")
	private long productId;

	@SerializedName("admin_graphql_api_id")
	private String adminGraphqlApiId;

	@SerializedName("alt")
	private Object alt;

	@SerializedName("width")
	private int width;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("variant_ids")
	private List<Object> variantIds;

	@SerializedName("id")
	private long id;

	@SerializedName("position")
	private int position;

	@SerializedName("height")
	private int height;

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setSrc(String src){
		this.src = src;
	}

	public String getSrc(){
		return src;
	}

	public void setProductId(long productId){
		this.productId = productId;
	}

	public long getProductId(){
		return productId;
	}

	public void setAdminGraphqlApiId(String adminGraphqlApiId){
		this.adminGraphqlApiId = adminGraphqlApiId;
	}

	public String getAdminGraphqlApiId(){
		return adminGraphqlApiId;
	}

	public void setAlt(Object alt){
		this.alt = alt;
	}

	public Object getAlt(){
		return alt;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setVariantIds(List<Object> variantIds){
		this.variantIds = variantIds;
	}

	public List<Object> getVariantIds(){
		return variantIds;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getPosition(){
		return position;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Image{" + 
			"updated_at = '" + updatedAt + '\'' + 
			",src = '" + src + '\'' + 
			",product_id = '" + productId + '\'' + 
			",admin_graphql_api_id = '" + adminGraphqlApiId + '\'' + 
			",alt = '" + alt + '\'' + 
			",width = '" + width + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",variant_ids = '" + variantIds + '\'' + 
			",id = '" + id + '\'' + 
			",position = '" + position + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}