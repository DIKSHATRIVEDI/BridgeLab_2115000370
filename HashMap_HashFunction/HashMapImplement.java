class Node{
	int key;
	int val;
	Node next;
	public Node(int key,int val){
		this.key=key;
		this.val=val;
		this.next=null;
	}
}
class HashMapImplement{
	private Node[] map;
	public HashMapImplement(){
		map=new Node[1000];
		for(int i=0;i<1000;i++){
			map[i]=new Node(-1,-1);
		}
	}
	public void put(int key,int value){
		int hash=hash(key);
		Node cur=map[hash];
		while(cur.next!=null){
			if(cur.next.key==key){
				cur.next.val=value;
				return;
			}
			cur=cur.next;
		}
		cur.next=new Node(key,value);
	}
	public int get(int key){
		int hash=hash(key);
		Node cur=map[hash].next;
		while(cur!=null){
			if(cur.key==key)
				return cur.val;
			cur=cur.next;
		}
		return -1;
	}
	public void remove(int key){
		int hash=hash(key);
		Node cur=map[hash];
		while(cur.next!=null){
			if(cur.next.key==key){
				cur.next=cur.next.next;
				return;
			}
			cur=cur.next;
		}
	}
	private int hash(int key){
		return key%1000;
	}
    public static void main(String[] args){
	    HashMapImplement hashMap=new HashMapImplement();
	    hashMap.put(1,1);
	    hashMap.put(2,2);
	    System.out.println(hashMap.get(1));
	    System.out.println(hashMap.get(3));
		hashMap.put(2,1);
		System.out.println(hashMap.get(2));
		hashMap.remove(2);
		System.out.println(hashMap.get(2));
	}
}