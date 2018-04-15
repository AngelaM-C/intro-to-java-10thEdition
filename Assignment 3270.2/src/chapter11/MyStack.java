package chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class MyStack extends ArrayList {
	private ArrayList<String> list = new ArrayList<>();
	
	public void reverse() {
		for(int i= list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
	}
	
	//Test Program
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		MyStack s1= new MyStack();
		
		System.out.println("Enter 5 strings:");
		
		for(int i=0; i<5;i++)
			s1.list.add(input.next());
		
			s1.reverse();
	}
}
