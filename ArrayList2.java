import java.util.ArrayList;
public class ArrayList2{
		public static void main(String[]args){

        ArrayList<Integer>arraylist=new ArrayList<Integer>();
	
		try{
		arraylist.add(args[0]);
		arraylist.add(args[1]);
		arraylist.add(args[2]);
		arraylist.add(args[3]);
		arraylist.add(args[4]);
		System.out.println(arraylist);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Enter the Five arguments");
		}
		
		int size=arraylist.size();
		System.out.println("Size of the Array is :"+size);
		}



}