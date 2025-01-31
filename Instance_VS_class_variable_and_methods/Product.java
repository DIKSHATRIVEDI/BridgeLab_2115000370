import java.util.Scanner;
public class Product{
    String productName;
	double price;
	static int totalProducts;
	public Product(String productName,double price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
	}
	public void displayProductDetails(){
		System.out.println("Product Name is "+productName);
		System.out.println("Price is $"+price);
	}
	public static void displayTotalProducts(){
		System.out.println("Total Products Created is "+totalProducts);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter product name ");
		String productName=sc.nextLine();
		System.out.print("Enter product price ");
		double price=sc.nextDouble();
		Product product1=new Product(productName,price);
		product1.displayProductDetails();
		Product.displayTotalProducts();
    }
}