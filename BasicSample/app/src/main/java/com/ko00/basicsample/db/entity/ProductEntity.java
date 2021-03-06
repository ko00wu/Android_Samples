package com.ko00.basicsample.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;

import com.ko00.basicsample.model.Product;

@Entity(tableName = "products")
public class ProductEntity implements Product {
		@PrimaryKey
		private int id;
		private String name;
		private String description;
		private int price;

		@Override
		public int getId() {
				return id;
		}

		public void setId(int id) {
				this.id = id;
		}

		@Override
		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		@Override
		public String getDescription() {
				return description;
		}

		public void setDescription(String description) {
				this.description = description;
		}

		@Override
		public int getPrice() {
				return price;
		}

		public void setPrice(int price) {
				this.price = price;
		}

		public ProductEntity() {
		}
}
