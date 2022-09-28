package objectOrienting.oop;

public class Products {

	int id;
	String name;
	double price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvailable;

	public Products(int id, String name, double price, String category, float rating, float discountPercentage,
			boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}

	void productInfo() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
		System.out.println("Rating: " + rating);
		System.out.println("DiscountPercentage: " + discountPercentage);
		System.out.println("IsAvailable: " + isAvailable);
		System.out.println();
	}
	
	double productDiscountedPrice () {
		return (price * discountPercentage / 100);
		
	}

	double productFinalPrice () {
		return (price + productDiscountedPrice() );
		
	}
	
	
}
