
class ll{
	
	node head;
	node tail;
	int size=0;
	void display() {
		if(size==0) {
			System.out.println("empty linked_list");return;
		}
		node current =head;
		while(current!=null) {
			System.out.println("Regestration no : "+current.rn+" & Marks obtained : "+current.mark);
			current=current.next;
		}System.out.println("Regestration no : null & Marks obtained : null");
		
	}

	void add_first_s(int r,int m) {
		node n=new node (r,m);
		if(head==null) {
			head=n;

			return;
		}
		n.next=head;
		head=n;
	}
	void add_last_s(int r,int m) {
		node n=new node (r,m);
		node current =head;
	if(current ==null) {
		add_first_s(r,m);return;
	}
		while(current.next!=null) {
			current =current.next;
			
		}
		current.next=n;
		n.next=null;
	}
void add(int r,int m,int i) {
	if(i==0)
	{
		add_first_s(r,m);
		return;
	}
	if(i==size) {
		add_last_s(r,m);
		return;
	}
//	
	node current=head;
	for (int j=1;j<i;j++) {
		current =current.next;j++;
	}
	node n=new node (r,m,current.next);
	current .next=n;
}
void removeFirst()
{
	if(head==null) 
		return;
	head=head.next;
	size--;
	
}
void removeLast() {
	if(head==null) {
		return;
	}
	size--;
	if(head.next==null) {
		head=null;
	return;
	}
	node sec_last=head;
	node last=head.next;
	while(last.next!=null) {
		last=last.next;
		sec_last=sec_last.next;
	}
	sec_last.next=null;
	

}
void reverse() {
	if(head==null||head.next==null) {
		return;
	}
	node previous=head;
	node current=head.next;
	while(current!=null) {
		node next=current.next;
		current.next=previous;
		//update;
		previous=current;
		current=next;
	}
	head.next=null;
	head=previous;
	
}
node rev(node head) {
	if(head==null|head.next==null) {
		return head;
	}
	node nue=rev(head.next);
	head.next.next=head;
	head.next=null;
	return nue;
}
	class node{
		int rn;
		int mark;
		node next;
		node (int r,int m,node n){
			rn=r;
			mark=m;
			next=n;size++;
		}
		node (int r,int m){
			rn=r;
			mark=m;
			size++;
		}
	}
	void getsize() {
		System.out.println("size :"+size);
	}
	void get(int i) {
		if(head==null) {
			return;
		}
		node current =head;
		for(int j=0;j<i;j++) {
			current =current.next;
			
		}
		System.out.println("Regestration no : "+current.rn+" & Marks obtained : "+current.mark);
	}
}

public class linked_list_q1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ll a=new ll();
a.add_first_s(1, 100);
a.add_first_s(2, 97);
a.add_first_s(6, 88);
a.add_last_s(7, 48);
a.add(3, 40, 2);
a.removeFirst();
a.removeLast();
a.display();
a.getsize();
//a.get(2);
a.head=a.rev(a.head);
a.display();
a.getsize();
	}

}
