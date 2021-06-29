package com.vaishnavi.classes;

public class Book {
       public int bookid;
       public String bookname;
       Auther auther;
       Publication pubn;
       
       public void addBook(int bookid,String bookname,Auther auther,Publication pubn)
       {
    	   this.bookid=bookid;
    	   this.bookname=bookname;
    	   this.auther=auther;
    	   this.pubn=pubn;
    	   
       }
       public String toString()
       {
    	   return String.format("%10d %20s %15s %15s",this.bookid,this.bookname,auther.autherName,pubn.publicationname);
       }
}
