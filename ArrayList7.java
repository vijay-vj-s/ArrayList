import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList7{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Five Strings :");
		String string1=sc.nextLine();
		String string2=sc.nextLine();
		String string3=sc.nextLine();
		String string4=sc.nextLine();
		String string5=sc.nextLine();
		ArrayList <String>arraylist=new ArrayList<>();
		
		arraylist.add(string1);
		arraylist.add(string2);
		arraylist.add(string3);
		arraylist.add(string4);
		arraylist.add(string5);
		
		
	
	Iterator it=arraylist.iterator();
	System.out.println("Elements are :");
	while(it.hasNext()){
		System.out.println(it.next());
		
		
	}
		
		
		
		
		
	}
	
	
	
	
	
}