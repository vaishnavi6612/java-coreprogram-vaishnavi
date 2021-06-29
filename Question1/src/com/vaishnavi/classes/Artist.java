package com.vaishnavi.classes;

import java.util.Scanner;

public class Artist {
      public int artistid;
      public String artistname;
      Scanner scan = new Scanner(System.in);
      
      public void createNewArtist()
      {
    	  System.out.println("\n Enter Artist ID:");
    	  artistid = scan.nextInt();
    	  
    	  System.out.println("\n Enter name of Artist:");
    	  artistname=scan.next();
    	  
      }
      public void showArtist()
      {
    	  System.out.println(artistid + "\t" +artistname);
      }
}     
