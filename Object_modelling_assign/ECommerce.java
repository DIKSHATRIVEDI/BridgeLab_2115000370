import java.util.ArrayList;
import java.util.List;
class Product{
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
}
class Order{
    private String orderId;
	private Customer customer;
	private List<Product> products;
	public Order(String orderId,Customer customer){
	    this.orderId=orderId;
		this.customer=customer;
		this.products=new ArrayList<>();
	}
	public void addProduct(Product product){
        products.add(product);
    }
    public double calculateTotal(){
        double total=0.0;
        for(Product product:products)total+=product.getPrice();
        return total;
    }
	public void displayOrder(){
        System.out.println("Order ID --> "+orderId);
        System.out.println("Customer --> "+customer.getName());
        System.out.println("Products --> ");
		for(Product product:products)
        System.out.println(" - "+product.getName()+" (Price --> $"+product.getPrice()+")");
        System.out.println("Total --> $"+calculateTotal());
    }
}
class Customer{
    private String customerId;
    private String name;
	private List<Order> orders;
	public Customer(String customerId,String name){
        this.customerId=customerId;
		this.name=name;
		this.orders=new ArrayList<>();
	}
	public String getName(){
        return name;
    }
    public void placeOrder(Order order){
        orders.add(order);
    }
	public void displayCustomerOrders(){
        System.out.println("Customer ID --> "+customerId);
        System.out.println("Name --> "+name);
        System.out.println("Orders --> ");
        for(Order order:orders)order.displayOrder();
    }
}
public class ECommerce{
    public static void main(String[] args){
        Customer customer1=new Customer("C001","John Doe");
		Customer customer2=new Customer("C002","Jane Smith");
		Customer customer3=new Customer("C003","David Lee");
		Product product1=new Product("P001","Laptop",1200.0);
		Product product2=new Product("P002","Mouse",25.0);
		Product product3=new Product("P003","Keyboard",50.0);
		Product product4=new Product("P004","Headphones",80.0);
		Order order1=new Order("O001",customer1);
		Order order2=new Order("O002",customer2);
		Order order3=new Order("O003",customer3);
		order1.addProduct(product1);
		order1.addProduct(product2);
		order2.addProduct(product3);
		order3.addProduct(product4);
		customer1.placeOrder(order1);
		customer2.placeOrder(order2);
		customer3.placeOrder(order3);
		customer1.displayCustomerOrders();
		System.out.println();
		customer2.displayCustomerOrders();
		System.out.println();
		customer3.displayCustomerOrders();
    }
}