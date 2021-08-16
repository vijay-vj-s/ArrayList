import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList19{
	public static void main(String[]args){
	
		ArrayList<Long>arraylist=new ArrayList<>();
		try{
			for(int i=0;i<args.length;i++){
				arraylist.add(Long.parseLong(args[i]));	
			}
		arraylist.clear();
		int size=arraylist.size();
		System.out.println("Size of the list is :"+size);
		System.out.println("After removing all elements : "+arraylist);
		}
		catch(NumberFormatException e){
		
				System.out.println("Enter only Long Values");
		}
	}

  



}