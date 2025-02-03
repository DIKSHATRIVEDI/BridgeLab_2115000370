import java.util.Scanner;
public class Product{
    static double discount=0.0;
    final int productID;
	String productName;
	double price;
	int quantity;
	static int productCount=0;
    	public Product(String productName,double price,int quantity){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		productID=++productCount;
	}
	public static void updateDiscount(double newDiscount){
	    discount=newDiscount;
	}
	public double calculateTotalPrice(){
	    if(this instanceof Product)return (price-price*(discount/100))*quantity;
		else return 0.0;
	}
	public void display(){
	    if(this instanceof Product){
		    System.out.println("Product ID --> "+productID);
			System.out.println("Product Name --> "+productName);
			System.out.println("Price --> $"+price);
			System.out.println("Quantity --> "+quantity);
			System.out.println("Total Price --> $"+calculateTotalPrice());
		}
		else System.out.println("Not a valid object");
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product Name ");
		String productName=sc.nextLine();
		System.out.print("Enter Price ");
		double price=sc.nextDouble();
		System.out.print("Enter Quantity ");
		int quantity=sc.nextInt();
		Product product=new Product(productName,price,quantity);
		product.display();
		System.out.println("Current Discount --> "+discount+"%");
		System.out.print("Enter new Discount Percentage --> ");
		double newDiscount=sc.nextDouble();
		Product.updateDiscount(newDiscount);
		product.display();
	}
}