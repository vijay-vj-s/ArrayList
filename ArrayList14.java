import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList14{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
		
		ArrayList<Float>arrayList=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			arrayList.add(Float.parseFloat(args[0]));				
		}
		System.out.println("Enter the index you Want to delete");
		int index=sc.nextInt();
		arrayList.remove(index);
		int size=arrayList.size();
		System.out.println("size of the list is :"+size);
		System.out.println("After Removed one of the value"+arrayList);
		
		}






}