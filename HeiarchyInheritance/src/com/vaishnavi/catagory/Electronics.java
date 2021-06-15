package com.vaishnavi.catagory;

import com.vaishnavi.product.Product;

public class Electronics extends Product {
	
	protected String deviceType;

	  public Electronics(String deviceType) {
		super("Electornics");
		this.deviceType = deviceType;
	}
	
	
}
