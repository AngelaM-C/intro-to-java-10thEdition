package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class RevisedMyStack implements Cloneable {
	private ArrayList<String> list = new ArrayList<>();

	public void reverse() {
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

	@Override
	protected Object clone()  {
        RevisedMyStack myStack=null;
        
        try {
            myStack = (RevisedMyStack) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        myStack.list = new ArrayList<>(list);
        return myStack;
    }
	
	// Test Program
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		RevisedMyStack s1 = new RevisedMyStack();

		System.out.println("Enter 5 strings:");

		for (int i = 0; i < 5; i++)
			s1.list.add(input.next());

		s1.reverse();
		
	}
}
