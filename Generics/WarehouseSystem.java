import java.util.*;
abstract class WarehouseItem{
    private String name;
	public WarehouseItem(String name){
	    this.name=name;
	}
	public String getName(){
	    return name;
	}
}
class Electronics extends WarehouseItem{
    public Electronics(String name){
	    super(name);
	}
}
class Groceries extends WarehouseItem{
    public Groceries(String name){
	    super(name);
	}
}
class Furniture extends WarehouseItem{
    public Furniture(String name){
	    super(name);
	}
}
class Storage<T extends WarehouseItem>{
    private List<T> item;
	public Storage(){
	    item=new ArrayList<>();
	}
	public void addItem(T i){
	    item.add(i);
	}
	public T getItem(int idx){
	    return item.get(idx);
	}
	public List<T> getItems(){
        return new ArrayList<>(item); 
    }
	public void display(){
	    for(T i : item)
	    System.out.println(i.getName());
	}
	public void displayWildcard(List<? extends WarehouseItem> item){
        for(WarehouseItem i : item){
            System.out.println(i.getName());
        }
    }
}
public class WarehouseSystem{
    public static void main(String[] args){
	    Storage<Electronics> storage1=new Storage<>();
		storage1.addItem(new Electronics("Bulb"));
	    Storage<Groceries> storage2=new Storage<>();
		storage2.addItem(new Groceries("Rice"));
		Storage<Furniture> storage3=new Storage<>();
		storage3.addItem(new Furniture("Sofa"));
		System.out.println("Electronic --> ");	
		storage1.display();
		System.out.println("Groceries --> ");
		storage2.display();
		System.out.println("Furniture --> ");
		storage3.display();
		System.out.println("wildcard items are --> ");
		storage1.displayWildcard(storage1.getItems());
		storage2.displayWildcard(storage2.getItems());
		storage3.displayWildcard(storage3.getItems());
	}
}
