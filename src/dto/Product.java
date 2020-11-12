package dto;

import java.io.Serializable;

public class Product implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String productId;
		private String pname;
		private Integer unitPrice;
		private String description;
		private String manufacturer;
		private String category;
		private long unitInStock;
		private String condition;
		
		public Product() {
			super();
		}
		
		public Product(String productId, String pname, Integer unitPrice) {
			this.productId = productId;
			this.pname = pname;
			this.unitPrice = unitPrice;
		}
		
		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public Integer getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(Integer unitPrice) {
			this.unitPrice = unitPrice;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public long getUnitInStock() {
			return unitInStock;
		}

		public void setUnitInStock(long unitInStock) {
			this.unitInStock = unitInStock;
		}

		public String getCondition() {
			return condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public String getProductId() {
			return productId;
		}
		
		public void setProductId(String productId) {
			this.productId = productId;
		}
}