package com.devdnik.coder.client.POJO;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ResponseTags{

	@SerializedName("products")
	private List<ProductsItem> products;

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	@Override
 	public String toString(){
		return 
			"ResponseTags{" + 
			"products = '" + products + '\'' + 
			"}";
		}
}