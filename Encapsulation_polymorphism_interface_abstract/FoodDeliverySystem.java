import java.util.ArrayList;
import java.util.List;
interface Discountable{
	void applyDiscount(double discountPercentage);
	String getDiscountDetails();
	double getDiscount();
}
abstract class FoodItem{
	private String itemName;
	private double price;
	private int quantity;
	public FoodItem(String itemName,double price,int quantity){
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	public String getItemName(){
		return itemName;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public abstract double calculateTotalPrice();
	public String getItemDetails(){
		return "Item --> "+itemName+", Price --> $"+price+", Quantity --> "+quantity;
	}
}
class VegItem extends FoodItem implements Discountable{
	private double discount;
	private String discountDetails;
	public VegItem(String itemName,double price,int quantity){
		super(itemName,price,quantity);
		this.discount=0;
		this.discountDetails="";
	}
	@Override
	public double calculateTotalPrice(){
		return getPrice()*getQuantity();
	}
	@Override
	public void applyDiscount(double discountPercentage){
		this.discount=discountPercentage/100.0;
		this.discountDetails="Discount --> "+discountPercentage+"%";
	}
	@Override
	public String getDiscountDetails(){
		return discountDetails;
	}
	@Override
	public double getDiscount(){
		return discount;
	}
}
class NonVegItem extends FoodItem implements Discountable{
	private double extraCharge;
	private double discount;
	private String discountDetails;
	public NonVegItem(String itemName,double price,int quantity,double extraCharge){
		super(itemName,price,quantity);
		this.extraCharge=extraCharge;
		this.discount=0;
		this.discountDetails="";
	}
	@Override
	public double calculateTotalPrice(){
		return (getPrice()*getQuantity())+(extraCharge*getQuantity());
	}
	public double getExtraCharge(){
		return extraCharge;
	}
	@Override
	public void applyDiscount(double discountPercentage){
		this.discount=discountPercentage/100.0;
		this.discountDetails="Discount --> "+discountPercentage+"%";
	}
	@Override
	public String getDiscountDetails(){
		return discountDetails;
	}
	@Override
	public double getDiscount(){
		return discount;
	}
}
public class FoodDeliverySystem{
	public static void main(String[] args){
		List<FoodItem> order=new ArrayList<>();
		order.add(new VegItem("Dum Aloo",10.0,2));
		order.add(new NonVegItem("Butter Chicken",15.0,1,5.0));
		order.add(new VegItem("Veg Burger",5.0,1));
		double totalOrderPrice=0;
		for(FoodItem item:order){
			System.out.println(item.getItemDetails());
			double itemPrice=item.calculateTotalPrice();
			System.out.println("Total Price --> $"+itemPrice);
			if(item instanceof Discountable){
				Discountable discountableItem=(Discountable)item;
				discountableItem.applyDiscount(10);
				itemPrice=item.calculateTotalPrice()*(1-discountableItem.getDiscount());
				System.out.println("Price after discount --> $"+itemPrice);
				System.out.println(discountableItem.getDiscountDetails());
			}
			totalOrderPrice+=itemPrice;
			System.out.println();
		}
		System.out.println("Total Order Price --> $"+totalOrderPrice);
	}
}