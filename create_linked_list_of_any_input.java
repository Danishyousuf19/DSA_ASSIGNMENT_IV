import java.util.Scanner;

class linkedList<T>{
	Scanner sc=new Scanner(System.in);
	node<T> head;
	void  create() {	
		char ch;
		do{
			System.out.println("Enter DATA");
			T num = (T) sc.next();
			node<T>  newnode =new node<>(num);
			if(head==null) {
				head=newnode;
				//head.next=null;
				
			}
			else {
			node<T>  temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;	}
			System.out.println("Do you want add another Node ?'y' / 'n'");
			
			ch=sc.next().charAt(0);
		}
		
		while(ch!='n');
	}
	
	void display() {
		
		if(head==null) {
		System.out.println("empty");
			return ;
		}
		node <T> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("null");
	}

	static class node<T>  {
		T data;
		node<T>  next;
		node(T num){
			data=num;
			next=null;
		}
	}
}
public class create_linked_list_of_any_input {

	public static void main(String[] args) {
		linkedList Linked_list=new linkedList();
Linked_list.create();
Linked_list.display();
	}

}
