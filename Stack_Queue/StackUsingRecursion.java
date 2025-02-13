import java.util.ListIterator;
import java.util.Stack;
class StackUsingRecursion{
    static void sortedInsert(Stack<Integer> st,int elem){
	    if(st.isEmpty()||elem>st.peek()){
	        st.push(elem);
		    return;
	    }
		int temp=st.pop();
	    sortedInsert(st,elem);
	    st.push(temp);
	}
	static void sortStack(Stack<Integer> st){
	    if(!st.isEmpty()){
	        int elem=st.pop();
		    sortStack(st);
		    sortedInsert(st,elem);
	    }
    }
	static void printStack(Stack<Integer> st){
	    ListIterator<Integer> lt=st.listIterator();
	    while(lt.hasNext())
	        lt.next();
		    while(lt.hasPrevious())System.out.print(lt.previous()+" ");
	}
    public static void main(String[] args){
	    Stack<Integer> st=new Stack<>();
		st.push(12);
		st.push(15);
		st.push(28);
		st.push(34);
		st.push(30);
		System.out.println("Stack elements before sorting --> ");
		printStack(st);
		sortStack(st);
		System.out.println("\n\nStack elements after sorting --> ");
		printStack(st);
	}
}