package com.vaishnavi.examples;

public class Labour {

	
		private String labourname;
	    private int age;
	    private String town;
	    private long contactno;
		
	 
	    public Labour(String labourname,int age,String town,int contactno)
	    {
	    	this.labourname= labourname;
	    	this.age=age;
	    	this.town=town;
	    	this.contactno=contactno;
	    }
	    public void showLabour()
	    {
	    	System.out.println(this.labourname+"\t"+this.age+"\t"+this.town+"\t"+this.contactno);
	    }

}
