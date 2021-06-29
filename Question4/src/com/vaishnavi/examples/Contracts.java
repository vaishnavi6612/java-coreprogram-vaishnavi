package com.vaishnavi.examples;

public class Contracts {

	protected int contact_id;
	protected String contact_person_name;
    protected String labour_obj;
    protected String lorry_obj;
   
	
 
    public Contracts(int contact_id,String contact_person_name,String labour_obj,String lorry_obj)
    {
    	this.contact_id= contact_id;
    	this.contact_person_name=contact_person_name;
    	this.labour_obj=labour_obj;
    	this.lorry_obj=lorry_obj;
    }
    public void showContracts()
    {
    	System.out.println(this.contact_id+"\t"+this.contact_person_name+"\t"+this.labour_obj+"\t"+this.lorry_obj);
    }
}
