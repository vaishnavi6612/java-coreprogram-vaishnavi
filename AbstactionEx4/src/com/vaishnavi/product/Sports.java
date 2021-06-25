package com.vaishnavi.product;

public abstract class Sports extends Category{
     protected String sprotItem;
     protected int warranty;
     
     public abstract void createItem(String sportItem,int warranty);
     public abstract void showItem();
     
}
