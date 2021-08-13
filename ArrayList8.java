import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayList8{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			try{
			ArrayList<String>arraylist=new ArrayList<>();
			arraylist.add(args[0]);
			arraylist.add(args[1]);
			arraylist.add(args[2]);
			arraylist.add(args[3]);
			arraylist.add(args[4]);
			
			System.out.println("Enter the index you want to print the String :");
			int index=sc.nextInt();
			String string=arraylist.get(index);
			System.out.println(string);
			
			
			}
			catch(InputMismatchException e){
				
				System.out.println("Enter the index value :");
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				
				System.out.println("Enter  the Arguments");
			}
			

			
			
		}
	
	
	
	
	
}