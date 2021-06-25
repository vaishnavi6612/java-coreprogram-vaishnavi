package com.vaishnavi.product;


public abstract class Electronics extends Category{
	
	protected String prodName;
	protected float price;
	
	public Electronics()
	{
		prodName = "#unknownProdName";
		price = 0.0f;
		
	}

	public Electronics(String prodName,float price)
	{
		super();
		this.prodName=prodName;
		this.price=price;
	}
	
	public abstract float purchaseProduct(int qtys);
	public abstract float applyDiscount(float amount);
	

}
