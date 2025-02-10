import java.util.ArrayList;
import java.util.List;
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
abstract class Product{
    private String productId;
    private String name;
	private double price;
	public Product(String productId,String name,double price){
        this.productId=productId;
        this.name=name;
		this.price=price;
	}
    public String getProductId(){
        return productId;
	}
	public String getName(){
        return name;
    }
	public double getPrice(){
	    return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public abstract double calculateDiscount();
	public String getProductDetails(){
		return "ID --> "+productId+", Name --> "+name+", Price --> $"+price;
	}
}
class Electronics extends Product implements Taxable{
	private String brand;
	private double taxRate;
	public Electronics(String productId,String name,double price,String brand,double taxRate){
		super(productId,name,price);
		this.brand=brand;
		this.taxRate=taxRate;
	}
	@Override
	public double calculateDiscount(){
		return getPrice()*0.1;
	}
	@Override
	public double calculateTax(){
		return getPrice()*taxRate;
	}
	@Override
	public String getTaxDetails(){
		return "Tax Rate --> "+(taxRate*100)+"%";
	}
}
class Clothing extends Product implements Taxable{
	private String size;
	private double taxRate;
	public Clothing(String productId,String name,double price,String size,double taxRate){
		super(productId,name,price);
		this.size=size;
		this.taxRate=taxRate;
	}
	@Override
	public double calculateDiscount(){
		return 0;
	}
	@Override
	public double calculateTax(){
		return getPrice()*taxRate;
	}
	@Override
	public String getTaxDetails(){
		return "Tax Rate --> "+(taxRate*100)+"%";
	}
}
class Groceries extends Product{
	public Groceries(String productId,String name,double price){
		super(productId,name,price);
	}
	@Override
	public double calculateDiscount(){
		return getPrice()*0.05;
	}
}
public class ECommercePlatform{
    public static void main(String[] args){
		List<Product> products=new ArrayList<>();
		products.add(new Electronics("Elec-1","Laptop",1000,"Dell",0.08));
		products.add(new Clothing("Cloth-1","T-Shirt",20,"L",0.05));
		products.add(new Groceries("Groc-1","Milk",5));
		products.add(new Electronics("Elec-2","Smartphone",800,"Samsung",0.08));
		for(Product product:products){
			double finalPrice=product.getPrice()+(product instanceof Taxable?((Taxable)product).calculateTax():0)-product.calculateDiscount();
			System.out.println(product.getProductDetails());
			if(product instanceof Taxable){
				Taxable taxableProduct=(Taxable)product;
				System.out.println(taxableProduct.getTaxDetails());
			}
			System.out.println("Discount --> $"+product.calculateDiscount());
			System.out.println("Final Price --> $"+finalPrice);
			System.out.println();
		}
	}
}