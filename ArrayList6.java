import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList6{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Five Strings");
			String string1=sc.nextLine();
			String string2=sc.nextLine();
			String string3=sc.nextLine();
			String string4=sc.nextLine();
			String string5=sc.nextLine();
			
			ArrayList<String>arraylist=new ArrayList<String>();
			
			arraylist.add(string1);
			arraylist.add(string2);
			arraylist.add(string3);
			arraylist.add(string4);
			arraylist.add(string5);
			System.out.println("Enter the String you want to know the index of String  : ");
		    String search=sc.nextLine();
			
			int index=arraylist.indexOf(search);
			
			int size=arraylist.size();
			
			System.out.println(arraylist);
			System.out.println("Size of the Arraylist is :"+size);
			
			System.out.println("Index of you entered String is :" +index);
			
			
			
			
			
			
		}
	
	
	
	
	
	
}