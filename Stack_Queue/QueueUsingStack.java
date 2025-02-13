import java.util.*;
class QueueUsingStack{
    static class Queue{
	    static Stack<Integer> s1=new Stack<Integer>();
        static Stack<Integer> s2=new Stack<Integer>();
		static void enQueue(int elem){
		    while(!s1.isEmpty()){
		        s2.push(s1.pop());
	        }
		    s1.push(elem);
		    while(!s2.isEmpty()){
		        s1.push(s2.pop());
		    }
	    }
		static int deQueue(){
	        if(s1.isEmpty())return -1;
		    int elem=s1.peek();
		    s1.pop();
		    return elem;
	    }
    }
    public static void main(String[] args){
	    Queue q=new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}