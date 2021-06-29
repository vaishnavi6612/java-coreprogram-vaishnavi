package com.vaishnavi.classes;

public class Publication {
	 public int publicationId;
     public String publicationname;
     
     public void createNewpublication(int publicationId,String publicationname)
     {
  	   this.publicationId=publicationId;
  	   this.publicationname=publicationname;
     }
     public String toString()
     {
  	   return String.format("%10d %20s",this.publicationId,this.publicationname);
     }
}