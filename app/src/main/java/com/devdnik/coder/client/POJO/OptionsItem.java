package com.devdnik.coder.client.POJO;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OptionsItem{

	@SerializedName("product_id")
	private long productId;

	@SerializedName("values")
	private List<String> values;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private long id;

	@SerializedName("position")
	private int position;

	public void setProductId(long productId){
		this.productId = productId;
	}

	public long getProductId(){
		return productId;
	}

	public void setValues(List<String> values){
		this.values = values;
	}

	public List<String> getValues(){
		return values;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	@Override
 	public String toString(){
		return 
			"OptionsItem{" + 
			"product_id = '" + productId + '\'' + 
			",values = '" + values + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",position = '" + position + '\'' + 
			"}";
		}
}