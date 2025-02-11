class TextEditorFunctionality{
	private class Node{
		String text;
		Node prev,next;
		Node(String text){
			this.text=text;
		}
	}
	private Node head,tail,current;
	private int size=0;
	private final int MAX_SIZE=10;
	public TextEditorFunctionality(){
		head=tail=current=null;
	}
	public void addState(String newText){
		Node newNode=new Node(newText);
		if(current!=null){
			current.next=newNode;
			newNode.prev=current;
		}
		current=newNode;
		if(head==null)head=newNode;
		tail=newNode;
		size++;
		if(size>MAX_SIZE){
			head=head.next;
			head.prev=null;
			size--;
		}
	}
	public void undo(){
		if(current!=null&&current.prev!=null)current=current.prev;
	}
	public void redo(){
		if(current!=null&&current.next!=null)current=current.next;
	}
	public void displayCurrentState(){
		if(current!=null)System.out.println("Text --> "+current.text);
		else System.out.println("No text available");
	}
	public static void main(String[] args){
		TextEditorFunctionality editor=new TextEditorFunctionality();
		editor.addState("Dance");
		editor.addState("Sing and Guide");
		editor.addState("sound with sign and exibition");
		editor.displayCurrentState();
		editor.undo();
		editor.displayCurrentState();
		editor.undo();
		editor.displayCurrentState();
		editor.redo();
		editor.displayCurrentState();
	}
}