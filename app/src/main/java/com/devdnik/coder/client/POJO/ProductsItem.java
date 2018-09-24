package com.devdnik.coder.client.POJO;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ProductsItem{

	@SerializedName("image")
	private Image image;

	@SerializedName("body_html")
	private String bodyHtml;

	@SerializedName("images")
	private List<ImagesItem> images;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("handle")
	private String handle;

	@SerializedName("variants")
	private List<VariantsItem> variants;

	@SerializedName("title")
	private String title;

	@SerializedName("tags")
	private String tags;

	@SerializedName("published_scope")
	private String publishedScope;

	@SerializedName("product_type")
	private String productType;

	@SerializedName("template_suffix")
	private Object templateSuffix;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("vendor")
	private String vendor;

	@SerializedName("admin_graphql_api_id")
	private String adminGraphqlApiId;

	@SerializedName("options")
	private List<OptionsItem> options;

	@SerializedName("id")
	private long id;

	@SerializedName("published_at")
	private String publishedAt;

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setBodyHtml(String bodyHtml){
		this.bodyHtml = bodyHtml;
	}

	public String getBodyHtml(){
		return bodyHtml;
	}

	public void setImages(List<ImagesItem> images){
		this.images = images;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setHandle(String handle){
		this.handle = handle;
	}

	public String getHandle(){
		return handle;
	}

	public void setVariants(List<VariantsItem> variants){
		this.variants = variants;
	}

	public List<VariantsItem> getVariants(){
		return variants;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTags(String tags){
		this.tags = tags;
	}

	public String getTags(){
		return tags;
	}

	public void setPublishedScope(String publishedScope){
		this.publishedScope = publishedScope;
	}

	public String getPublishedScope(){
		return publishedScope;
	}

	public void setProductType(String productType){
		this.productType = productType;
	}

	public String getProductType(){
		return productType;
	}

	public void setTemplateSuffix(Object templateSuffix){
		this.templateSuffix = templateSuffix;
	}

	public Object getTemplateSuffix(){
		return templateSuffix;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setVendor(String vendor){
		this.vendor = vendor;
	}

	public String getVendor(){
		return vendor;
	}

	public void setAdminGraphqlApiId(String adminGraphqlApiId){
		this.adminGraphqlApiId = adminGraphqlApiId;
	}

	public String getAdminGraphqlApiId(){
		return adminGraphqlApiId;
	}

	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	public List<OptionsItem> getOptions(){
		return options;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setPublishedAt(String publishedAt){
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	@Override
 	public String toString(){
		return 
			"ProductsItem{" + 
			"image = '" + image + '\'' + 
			",body_html = '" + bodyHtml + '\'' + 
			",images = '" + images + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",handle = '" + handle + '\'' + 
			",variants = '" + variants + '\'' + 
			",title = '" + title + '\'' + 
			",tags = '" + tags + '\'' + 
			",published_scope = '" + publishedScope + '\'' + 
			",product_type = '" + productType + '\'' + 
			",template_suffix = '" + templateSuffix + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",vendor = '" + vendor + '\'' + 
			",admin_graphql_api_id = '" + adminGraphqlApiId + '\'' + 
			",options = '" + options + '\'' + 
			",id = '" + id + '\'' + 
			",published_at = '" + publishedAt + '\'' + 
			"}";
		}
}