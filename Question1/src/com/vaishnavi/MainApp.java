package com.vaishnavi;

import com.vaishnavi.classes.Artist;

public class MainApp {
       public static void main(String []args) {
    	   
    	   Artist a1 =new Artist();
    	   a1.createNewArtist();
    	   
    	   Artist a2 =new Artist();
    	   a2.createNewArtist();
    	   
    	   Artist a3 =new Artist();
    	   a3.createNewArtist();
    	   
    	   Artist a4 =new Artist();
    	   a4.createNewArtist();
    	   
    	   Artist a5 =new Artist();
    	   a5.createNewArtist();
    	   
    	   Object []records=save(a1,a2,a3,a4,a5);
    	   
    	   showArrayObject(records);
    	   findDuplicates(records);
       }
       public static void findDuplicates(Object []data)
       {
    	   
    	   for(int i=0;i<data.length;i++)
    	   {
    		  Artist first= (Artist)data[i];
    		  int cnt=0;
    		  for(int j=0;j<data.length;j++)
    		  {
    			  Artist second= (Artist)data[j];
    			  
    			  if(first.artistid==second.artistid && first.artistname.equals(second.artistname))
    				  cnt++;
    		  }
    		  if(cnt>1)
    		     System.out.println(first.artistname +"Repeated");
    	   }
       }
       public static Object[] save(Artist obj1,Artist obj2,Artist obj3,Artist obj4,Artist obj5)
       {
    	   Object []data = {obj1,obj2,obj3,obj4,obj5};
    	   
    	   return data;
       }
       public static void showArrayObject(Object []data)
       {
    	   System.out.println("\n Artist Details from function show...");
    	   for(Object R:data)
    	   {
    		   Artist a = (Artist)R;
    		   a.showArtist();
    	   }
       }
}
