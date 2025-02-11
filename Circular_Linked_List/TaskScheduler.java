class TaskNode{
	String taskId;
	String taskName;
	int priority;
	String dueDate;
	TaskNode next;
	public TaskNode(String taskId,String taskName,int priority,String dueDate){
		this.taskId=taskId;
		this.taskName=taskName;
		this.priority=priority;
		this.dueDate=dueDate;
		this.next=null;
	}
}
class TaskScheduler{
	TaskNode head;
	public TaskScheduler(){
		head=null;
	}
	public void addTaskAtBeginning(String taskId,String taskName,int priority,String dueDate){
		TaskNode newNode=new TaskNode(taskId,taskName,priority,dueDate);
		if(head==null){
			head=newNode;
			newNode.next=head;
		}
		else{
			newNode.next=head;
			TaskNode last=head;
			while(last.next!=head){
				last=last.next;
			}
			last.next=newNode;
			head=newNode;
		}
	}
	public void addTaskAtEnd(String taskId,String taskName,int priority,String dueDate){
		TaskNode newNode=new TaskNode(taskId,taskName,priority,dueDate);
		if(head==null){
			head=newNode;
			newNode.next=head;
		}
		else{
			TaskNode last=head;
			while(last.next!=head){
				last=last.next;
			}
			last.next=newNode;
			newNode.next=head;
		}
	}
    public void addTaskAtPosition(String taskId,String taskName,int priority,String dueDate,int position){
		if(position<1){
			System.out.println("Invalid position");
			return;
		}
		TaskNode newNode=new TaskNode(taskId,taskName,priority,dueDate);
		if(position==1)addTaskAtBeginning(taskId,taskName,priority,dueDate);
		else{
			TaskNode current=head;
			int count=1;
			while(current.next!=head&&count<position-1){
				current=current.next;
				count++;
			}
			if(count<position-1)System.out.println("Invalid position");
			else{
				newNode.next=current.next;
				current.next=newNode;
			}
		}
	}
	public void removeTask(String taskId){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		TaskNode current=head;
		TaskNode prev=null;
		do{
			if(current.taskId.equals(taskId)){
				if(current==head)head=current.next;
				if(prev!=null)prev.next=current.next;
				break;
			}
			prev=current;
			current=current.next;
		}while(current!=head);
	}
	public void viewCurrentTask(){
		if(head==null){
			System.out.println("No tasks available");
			return;
		}
		System.out.println("Current Task --> ");
		System.out.println("Task ID --> "+head.taskId);
		System.out.println("Task Name --> "+head.taskName);
		System.out.println("Priority --> "+head.priority);
		System.out.println("Due Date --> "+head.dueDate);
		head=head.next;
	}
    public void displayAllTasks(){
		if(head==null){
			System.out.println("No tasks available");
			return;
		}
		TaskNode current=head;
		System.out.println("All Tasks --> ");
		do{
			System.out.println("Task ID --> "+current.taskId+", Task Name --> "+current.taskName+", Priority --> "+current.priority+", Due Date --> "+current.dueDate);
			current=current.next;
		}while(current!=head);
	}
	public void searchByPriority(int priority){
		if(head==null){
			System.out.println("No tasks available");
			return;
		}
		TaskNode current=head;
		System.out.println("Tasks with Priority "+priority+" --> ");
		do{
			if(current.priority==priority)System.out.println("Task ID --> "+current.taskId+", Task Name --> "+current.taskName);
			current=current.next;
		}while(current!=head);
	}
    public static void main(String[] args){
		TaskScheduler scheduler=new TaskScheduler();
		scheduler.addTaskAtEnd("T-1","Meeting",1,"10-02-2025");
		scheduler.addTaskAtBeginning("T-2","Project Review",2,"11-02-2025");
		scheduler.addTaskAtPosition("T-3","Report Submission",3,"12-02-2025",2);
		scheduler.displayAllTasks();
		System.out.println();
		scheduler.viewCurrentTask();
		System.out.println();
		scheduler.searchByPriority(2);
		System.out.println();
		scheduler.removeTask("T002");
		scheduler.displayAllTasks();
		System.out.println();
	}
}
