class ProcessNode {
    String processId;
    int burstTime;
    int priority;
    int remainingTime;
    ProcessNode next;
    public ProcessNode(String processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}
class RoundRobinScheduler {
    ProcessNode head;
    int timeQuantum;
    public RoundRobinScheduler(int timeQuantum) {
        this.head = null;
        this.timeQuantum = timeQuantum;
    }
    public void addProcess(String processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } 
		else {
            ProcessNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }
    public void removeProcess(String processId) {
        if (head == null) {
            System.out.println("No processes in the queue");
            return;
        }
        ProcessNode current = head;
        ProcessNode prev = null;
        do {
            if (current.processId.equals(processId)) {
                if (current == head)head = current.next;                   
                if (prev != null)prev.next = current.next;                                   
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }
    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }
        ProcessNode current = head;
        ProcessNode prev = null; 
        int totalTime = 0;
        int[] waitingTimes = new int[100]; 
        int[] turnaroundTimes = new int[100]; 
        int count = 0;
        System.out.println("Round Robin Scheduling --> ");
        while (true) {
            System.out.println("Executing --> " + current.processId);
            if (current.remainingTime <= timeQuantum) {
                totalTime += current.remainingTime;
                current.remainingTime = 0; 
                waitingTimes[count] = totalTime - current.burstTime;
                turnaroundTimes[count] = totalTime;
                count++;
                if (current.remainingTime == 0){
                    if (current == head && current.next == head)head = null;                         
                    else if (current == head)head = current.next; 
                    if (prev != null)prev.next = current.next; 
                    ProcessNode temp = current;
                    current = current.next;
                    temp.next = null; 
                }
            } 
			else {
                current.remainingTime -= timeQuantum;
                totalTime += timeQuantum;
            }
            prev = current; 
            current = current.next;
            boolean allCompleted = true;
            ProcessNode check = head;
            if (head != null) { 
                do {
                    if (check.remainingTime > 0) {
                        allCompleted = false;
                        break;
                    }
                    check = check.next;
                } while (check != head);
            }
            if (allCompleted)break;            
        }
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        for (int i = 0; i < count; i++) {
            totalWaitingTime += waitingTimes[i];
            totalTurnaroundTime += turnaroundTimes[i];
        }
        double avgWaitingTime = (double) totalWaitingTime / count;
        double avgTurnaroundTime = (double) totalTurnaroundTime / count;
        System.out.println("Average Waiting Time --> " + avgWaitingTime);
        System.out.println("Average Turnaround Time --> " + avgTurnaroundTime);
    }
	public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(2); 
        scheduler.addProcess("P1", 5, 1);
        scheduler.addProcess("P2", 3, 2);
        scheduler.addProcess("P3", 8, 1);
        scheduler.simulateScheduling();
    }
}

