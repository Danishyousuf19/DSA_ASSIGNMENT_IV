import java.util.Stack;

////////////////////FIFO//////////////////////
public class queue_q3 {

	static class queue_ARRAY{
		static int size;
		static int arr[];
		queue_ARRAY(int n){
			size =n;
			arr=new int[n];
		}
		static int rear=-1;
		//is empty
		static boolean isempty() {
			return rear==-1;
		}
		//add
		static void add(int data) {
			if(rear==size-1) {
				System.out.println("full queue");
				return;
			}
			rear++;
			arr[rear]=data;
		}
		static int remove() {
			if(isempty()) {
				System.out.println("empty queue");return -1;
			}
			int front =arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}rear--;
			return front;
		}
		static int peek() {
			return arr[0];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
queue a=new queue();
a.add(21);
a.add(22);
a.add(23);
a.add(24);

a.remove();
a.add(25);
//a.remove();
//a.add(26);
while(!a.isempty()) {
	System.out.println(a.peek());
	a.remove();
	}
	}

	//////////////////////////CIRCULAR QUEUE///////////////////////////////
	static class queue_LOOP{
		static int size ;
		static int arr[];
		static int rear=-1;
		static int front =-1;
		queue_LOOP(int d){
			size =d;
			arr=new int [size];
		}
		//is empty
		static boolean isempty()
		{
			return rear==-1&front ==-1;
		}
		//is full
		static boolean isfull()
		{
			return (rear+1)%size==front;
		}
		static void add(int d) {
			if(isfull()) {
				System.err.println("full circular queue ");return;
			}
			 if(front==-1) {
				 front=0;
			 }
				rear=(rear+1)%size;
				arr[rear]=d;
			
		}
		static int remove() {
			if(isempty()) {
				System.out.println("empty circular queue");
				return -1;
			}
			

			int res =arr[front];
					if(rear==front) {
						rear =front =-1;
					}
					else {
						front =(front+1)%size;
					}
			return res;
		}
		static int peek() {
			if(isempty()) {
				System.out.println("empty Circular queue");
				return -1;
			}
			return arr[front];
					
		}
	}
	//////////////////////LINKED LIST//////////////////////
static class node{
	int data;
	node next;
	node(int d){
		next=null;
		data=d;
	}
}
	static class queue_linked_list{
		static node head=null;
		static node tail=null;
		
		static boolean isempty() {
			return head ==null&tail==null;
					
		}
		static void add(int s) {
			node nue =new node (s);
			
		if(tail==null) {
			tail=head=nue;
			return;
		}
		tail.next=nue;
		tail=nue;
		}
		static int remove() {
			if(isempty())
			{
				System.out.println("empty queue");
				return -1;
			}
			int res=head.data;
			if(head==tail) {
				tail=null;
			}
			head=head.next; 
			return res;
			
		}
		static int peek() {
			return head.data;
		}
	}
	static class queue{
	static Stack <Integer>a=new Stack<>();
		static Stack <Integer>b=new Stack<>();
		static boolean isempty()
				{
			return a.isEmpty();
				}
		static void add(int d) {
			while(!a.isEmpty()) {
				b.push(a.pop());
			}
			a.push(d);
			while(!b.isEmpty()) {
				a.push(b.pop());
			}
			
		}
		static int remove() {
				if(a.isEmpty()) {
					System.out.println("empty queue");
					return -1;
				}
				return a.pop();
			}
		static int peek() {
			if(a.isEmpty()) {
				System.out.println("empty queue");return -1;
			}
			
			return a.peek();
		}
	}
}

