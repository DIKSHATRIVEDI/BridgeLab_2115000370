import java.util.*;
interface Category{
	String getCategoryName();
	String getPriceRange();
}
class BookCategory implements Category{
	public String getCategoryName(){
		return "Books";
	}
	public String getPriceRange(){
		return "$5 - $100";
	}
}
class ClothingCategory implements Category{
	public String getCategoryName(){
		return "Clothing";
	}
	public String getPriceRange(){
		return "$10 - $500";
	}
}
class GadgetCategory implements Category{
	public String getCategoryName(){
		return "Gadgets";
	}
	public String getPriceRange(){
		return "$50 - $2000";
	}
}
class Product<T extends Category>{
	private String name;
	private double price;
	private T category;
	public Product(String name,double price,T category){
		this.name=name;
		this.price=price;
		this.category=category;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public T getCategory(){
		return category;
	}
	public void setPrice(double price){
		this.price=price;
	}
}
class DiscountManager{
	public static <T extends Product<?>> void applyDiscount(T product,double percentage){
		if(percentage<0||percentage>100){
			throw new IllegalArgumentException("Percentage must be between 0 and 100");
		}
		product.setPrice(product.getPrice()*(1-percentage/100));
		System.out.println("Applied "+percentage+"% discount to "+product.getName());
	}
}
class ProductCatalog{
	private List<Product<? extends Category>> products=new ArrayList<>();
	public void addProduct(Product<? extends Category> product){products.add(product);}
	public void displayProducts(){
		System.out.println("\nProduct Catalog ");
		for(Product<?> product:products){
			System.out.println(product.getName()+" ($"+product.getPrice()+")");
		}
	}
}
public class OnlineMarketplace{
    public static void main(String[] args){
		Product<BookCategory> book=new Product<>("Pride and Prejudice",45.0,new BookCategory());
		Product<ClothingCategory> shirt=new Product<>("T-Shirt",25.0,new ClothingCategory());
		Product<GadgetCategory> phone=new Product<>("Smart Watch",699.99,new GadgetCategory());
		ProductCatalog catalog=new ProductCatalog();
		catalog.addProduct(book);
		catalog.addProduct(shirt);
		catalog.addProduct(phone);
		System.out.println("Before Discount --> ");
		catalog.displayProducts();
		DiscountManager.applyDiscount(book,10);
		DiscountManager.applyDiscount(shirt,15);
		DiscountManager.applyDiscount(phone,20);
		System.out.println("\nAfter Discount --> ");
		catalog.displayProducts();
	}
}