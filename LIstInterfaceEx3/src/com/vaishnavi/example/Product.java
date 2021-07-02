package com.vaishnavi.example;

public class Product {

	private int proCode;
	private String prodName;
	private float price;
	
	public Product()
	{
		this.proCode=-1;
		this.prodName="#UnknownProdName";
		this.price=0.0f;
	}

	public Product(int proCode, String prodName, float price) {
		super();
		this.proCode = proCode;
		this.prodName = prodName;
		this.price = price;
	}

	
	@Override
	public String toString() {
		
		return String.format("%10d %20s %10.2f",this.proCode,this.prodName,this.price);
	}
	

}
