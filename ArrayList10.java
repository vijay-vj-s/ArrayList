import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList10{
		public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Five Strings");
			String string1=sc.nextLine();
			String string2=sc.nextLine();
			String string3=sc.nextLine();
			String string4=sc.nextLine();
			String string5=sc.nextLine();
			
			ArrayList<String>arrayList=new ArrayList<String>();
			
			arrayList.add(string1);
			arrayList.add(string2);
			arrayList.add(string3);
			arrayList.add(string4);
			arrayList.add(string5);
			
			System.out.println("Enter the String :");
			
			String newString=sc.nextLine();
			arrayList.add(2,newString);
			System.out.println("After Replace :"+arrayList);
			
	     
		
		
		}



}