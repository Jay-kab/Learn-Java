package objectOrienting.oop;

public class ProductsMain {

	public static void main(String[] args) {
		
		Products product1 = new Products (1234567, "Chair", 2325.59, "Furniture", 7.9f, 15.0f, true);

			product1.productInfo();
			
		Products product2 = new Products (2345613, "Bag", 450, "Accessory", 3.4f, 15.0f, true);
		
			product2.productInfo();
			
		Products product3 = new Products (2222222, "Lego", 58.99, "Toys", 4.0f, 5.0f, true);
		
			product3.productInfo();
			
			
		
		
	}

}
