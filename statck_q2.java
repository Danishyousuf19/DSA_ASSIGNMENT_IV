//////////////////////LIFO////////////////////
public class statck_q2 {
static class node{
	int data;
	node next;
	node(int d){
		data=d;
		next =null;
	}
}
static class stack{
	static node head;
	static boolean isempty() {
		return head==null;
	}
	//to add first
	static void push(int data) {
		node nue=new node (data);
		if(isempty()) {
			head=nue;return;
		}
		nue.next=head;
		head=nue;
	}
	//to remove and return top element
	static int pop() {
		int data =head.data;
		if(isempty()) {
			return -1;
		}
		head=head.next;
		
		return data;
	}
	//to return top element
	static int peek() {
		if(isempty()) {
			return -1;
		}
	return head.data;
	}
	//push at bottom
	static void pushAtBottom(int data,stack a) {
		if(a.isempty()) {
			a.push(data);
			return;
		}
		int top=a.pop();
		pushAtBottom(data,a);
		a.push(top);
	}
	static void reverse(stack a) {
		if(a.isempty()) {
			return;
		}
		int top=a.pop();
		reverse(a);
		a.pushAtBottom(top, a);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
stack a=new stack();
a.push(23);
a.push(2);
a.push(34);
a.pushAtBottom(333, a);//34 2 23 333
//while(!a.isempty()) {
//	System.out.print(a.peek()+" ");
//	a.pop();
//	
//}


a.reverse(a);

while(!a.isempty()) {
	System.out.print(a.peek()+" ");
	a.pop();
	
}

	}

}
