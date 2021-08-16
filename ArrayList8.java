import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayList8{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			try{
			ArrayList<String>arrayList=new ArrayList<>();
			arrayList.add(args[0]);
			arrayList.add(args[1]);
			arrayList.add(args[2]);
			arrayList.add(args[3]);
			arrayList.add(args[4]);
			
			System.out.println("Enter the index you want to print the String :");
			int index=sc.nextInt();
			String string=arrayList.get(index);
			System.out.println("String is :"+string);
			
			
			}
			catch(InputMismatchException e){
				
				System.out.println("Enter the index value :");
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				
				System.out.println("Enter  the Arguments");
			}
			

			
			
		}
	
	
	
	
	
}