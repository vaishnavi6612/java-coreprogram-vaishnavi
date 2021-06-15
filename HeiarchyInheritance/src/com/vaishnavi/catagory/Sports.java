package com.vaishnavi.catagory;

import com.vaishnavi.product.Product;


public class Sports extends Product{
        protected String sportType;
   
        
        public Sports(String sportType)
        {
              super("Sport");
              this.sportType=sportType;
        	
        }
}
