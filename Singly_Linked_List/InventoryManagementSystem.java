class Item{
    String itemName;
	int itemId;
	int quantity;
	double price;
	Item next;
	public Item(String itemName,int itemId,int quantity,double price){
	    this.itemName=itemName;
		this.itemId=itemId;
		this.quantity=quantity;
		this.price=price;
		this.next=null;
	}
}
public class InventoryManagementSystem{
    Item head;
	public InventoryManagementSystem(){
	    head=null;
    }
	public void addItemAtBeginning(String itemName,int itemId,int quantity,double price){
	    Item newItem=new Item(itemName,itemId,quantity,price);
		newItem.next=head;
		head=newItem;
	}
	public void addItemAtEnd(String itemName,int itemId,int quantity,double price){
	    Item newItem=new Item(itemName,itemId,quantity,price);
		if(head==null){
		    head=newItem;
			return;
		}
		Item current=head;
		while(current.next!=null){
		    current=current.next;
		}
		current.next=newItem;
	}
	public void addItemAtPosition(int position,String itemName,int itemId,int quantity,double price){
		if(position<=0){
			System.out.println("Invalid position");
			return;
		}
		if(position==1){
			addItemAtBeginning(itemName,itemId,quantity,price);
			return;
		}
		Item newItem=new Item(itemName,itemId,quantity,price);
		Item current=head;
		int count=1;
		while(current!=null&&count<position-1){
			current=current.next;
			count++;
		}
		if(current==null){
			System.out.println("Position out of bounds");
			return;
		}
		newItem.next=current.next;
		current.next=newItem;
	}
	public void removeItem(int itemId){
		if(head==null)return;
		if(head.itemId==itemId){
			head=head.next;
			return;
		}
		Item current=head;
		while(current.next!=null&&current.next.itemId!=itemId){
			current=current.next;
		}
		if(current.next==null)return;
		current.next=current.next.next;
	}
	public void updateQuantity(int itemId,int newQuantity){
		Item item=searchItemById(itemId);
	    if(item!=null)item.quantity=newQuantity;
	}
	public Item searchItemById(int itemId){
		Item current=head;
		while(current!=null){
			if(current.itemId==itemId)return current;
			current=current.next;
		}
	    return null;
	}
	public Item searchItemByName(String itemName){
		Item current=head;
		while(current!=null){
			if(current.itemName.equals(itemName))return current;
			current=current.next;
		}
		return null;
	}
	public double calculateTotalInventoryValue(){
		double totalValue=0;
		Item current=head;
		while(current!=null){
			totalValue+=current.price*current.quantity;
			current=current.next;
		}
		return totalValue;
	}
	public void displayInventory(){
		Item current=head;
		while(current!=null){
			System.out.println("Item Name --> "+current.itemName+", ID --> "+current.itemId+", Quantity --> "+current.quantity+", Price --> $"+current.price);
			current=current.next;
		}
	}
	public void sortInventoryByName(boolean ascending){
		bubbleSortByName(ascending);
	}
	private void bubbleSortByName(boolean ascending){
		if(head==null||head.next==null)return;
		boolean swapped;
	    Item current;
	    Item last=null;
	    do{
		swapped=false;
		current=head;
		while(current.next!=last){
			if(ascending?current.itemName.compareTo(current.next.itemName)>0:current.itemName.compareTo(current.next.itemName)<0){
				String tempName=current.itemName;
				int tempId=current.itemId;
				int tempQuantity=current.quantity;
				double tempPrice=current.price;
				current.itemName=current.next.itemName;
				current.itemId=current.next.itemId;
				current.quantity=current.next.quantity;
				current.price=current.next.price;
				current.next.itemName=tempName;
				current.next.itemId=tempId;
				current.next.quantity=tempQuantity;
				current.next.price=tempPrice;
				swapped=true;
			}
			current=current.next;
		}
		last=current;
	    }while(swapped);
    }
	public void sortInventoryByPrice(boolean ascending){
		bubbleSortByPrice(ascending);
	}
	private void bubbleSortByPrice(boolean ascending){
		if(head==null||head.next==null)return;
		boolean swapped;
		Item current;
		Item last=null;
		do{
			swapped=false;
			current=head;
			while(current.next!=last){
				if(ascending?current.price>current.next.price:current.price<current.next.price){
					String tempName=current.itemName;
					int tempId=current.itemId;
					int tempQuantity=current.quantity;
					double tempPrice=current.price;
					current.itemName=current.next.itemName;
					current.itemId=current.next.itemId;
					current.quantity=current.next.quantity;
					current.price=current.next.price;
					current.next.itemName=tempName;
					current.next.itemId=tempId;
					current.next.quantity=tempQuantity;
					current.next.price=tempPrice;
					swapped=true;
				}
				current=current.next;
			}
			last=current;
		}while(swapped);
	}
    public static void main(String[] args){
        InventoryManagementSystem inventory=new InventoryManagementSystem();
		inventory.addItemAtEnd("Laptop",1,5,1200.0);
		inventory.addItemAtEnd("Mouse",2,10,25.0);
		inventory.addItemAtBeginning("Keyboard",4,3,75.0);
		inventory.addItemAtPosition(2,"Monitor",3,2,300.0);
		System.out.println("Inventory --> ");
		inventory.displayInventory();
		inventory.removeItem(2);
		System.out.println("\nInventory after removing item 2 --> ");
		inventory.displayInventory();
		inventory.updateQuantity(1,7);
		System.out.println("\nInventory after updating quantity of item 1 --> ");
		inventory.displayInventory();
		Item item=inventory.searchItemById(3);
		if(item!=null){
		    System.out.println("\nFound item by ID --> ");
			System.out.println("Item Name --> "+item.itemName+", ID --> "+item.itemId+", Quantity --> "+item.quantity+", Price --> $"+item.price);
		}
		item=inventory.searchItemByName("Laptop");
		if(item!=null){
		    System.out.println("\nFound item by Name --> ");
		    System.out.println("Item Name --> "+item.itemName+", ID --> "+item.itemId+", Quantity --> "+item.quantity+", Price --> $"+item.price);
	    }
        double totalValue=inventory.calculateTotalInventoryValue();
		System.out.println("\nTotal Inventory Value --> $"+totalValue);
		inventory.sortInventoryByName(true);
		System.out.println("\nInventory sorted by name ascending -->");
		inventory.displayInventory();
		inventory.sortInventoryByName(false);
		System.out.println("\nInventory sorted by name descending --> ");
		inventory.displayInventory();
		inventory.sortInventoryByPrice(true);
		System.out.println("\nInventory sorted by price ascending --> ");
		inventory.displayInventory();
		inventory.sortInventoryByPrice(false);
		System.out.println("\nInventory sorted by price descending --> ");
		inventory.displayInventory();
	}
}