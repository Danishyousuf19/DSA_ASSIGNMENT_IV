class Ll{
	private node head;
	private node tail;
	private int  size;
	public Ll(){
		this.size=0;
	}
	public void addFirst(int d) {
		node nue =new node (d);
		nue.next=head;
		head=nue;
		if(tail==null) {
			tail=head;
		}
		size++;
	}
	public void getsize() {
		System.out.println("\nSize = "+size);
	}
	public void print() {
		node fake=head;
		while(fake!=null) {
			System.out.print(fake.data+"-->");
			fake=fake.next;
		}System.out.print("null");
	}
public void addLast(int d) {
	if(tail==null) {
		addFirst(d);
	}
	
	else {
		node nue =new node (d);
		tail.next=nue;
		tail=nue;size++;
	}
	
}
public void add(int d,int idx) {
	if(idx==0)
		{addFirst(d);
	return;}
	if(idx==size) 
		{addLast(d);
	return;}
	node temp=head;
	for(int i=1;i<idx;i++) {
		temp=temp.next;
	}
	node nue=new node(d,temp.next);
	temp.next=nue;
	size++;
	
}
public int deleteFirst() {
	
int d=head.data;
	head=head.next;
	if(head==null) {
		tail=null;
			
	}
		 size--;
		 return d;
	
}
public node get(int idx) {
	if(head==null) {
		
		return null;
	}
	node temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	return temp;
}
public int delete_last() {
	if(size<=1) {
		
		return deleteFirst();
	}
	node secondLast=get(size-2);
	int d=tail.data;
	tail=secondLast;
	tail.next=null;
	size--;
	return d;
}

private class node {
	private int data;
	private node next;
	public node (int d){
		data=d;
	}
   public  node(int d,node n){
	data=d;
	next=n;
    }
   
 }
}


public class Linked_list_by_kunal_k {

	
	
	public static void main(String[] args) {
Ll list=new Ll();
list.addFirst(1);
list.addFirst(4);
list.addFirst(5);
list.addFirst(22);
list.addLast(44);
list.add(12, 3);
list.deleteFirst();
list.delete_last();
list.print();
list.getsize();


	}

}
