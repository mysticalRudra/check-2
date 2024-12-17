package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Store")
public class Store {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getBrandname() {
			return Brandname;
		}
		public void setBrandname(String brandname) {
			Brandname = brandname;
		}
		public String getPrice() {
			return Price;
		}
		public void setPrice(String price) {
			Price = price;
		}
		public String getPriceType() {
			return PriceType;
		}
		public void setPriceType(String priceType) {
			PriceType = priceType;
		}
		public String getQuantity() {
			return Quantity;
		}
		public void setQuantity(String quantity) {
			Quantity = quantity;
		}
		private String Brandname;
	    private String Price;
	    private String PriceType;
	    private String Quantity;

	   
}
