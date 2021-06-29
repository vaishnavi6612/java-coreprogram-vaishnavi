package com.vaishnavi.examples;

public class Lorry {

	private String lorry_name;
    private int vehicle_number;
    private int weight_of_goods_in_tons;
	
 
    public Lorry(String lorry_name,int vehicle_number,int weight_of_goods_in_tons)
    {
    	this.lorry_name= lorry_name;
    	this.vehicle_number=vehicle_number;
    	this.weight_of_goods_in_tons=weight_of_goods_in_tons;
    	
    }
    public void showLorry()
    {
    	System.out.println(this.lorry_name+"\t"+this.vehicle_number+"\t"+this.weight_of_goods_in_tons);
    }
		
}


