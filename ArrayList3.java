import java.util.ArrayList;
public class ArrayList3{
		public static void main(String[]args){

        ArrayList<Integer>arraylist=new ArrayList<Integer>();
	
		try{
		arraylist.add(Integer.parseInt(args[0]));
		arraylist.add(Integer.parseInt(args[1]));
		arraylist.add(Integer.parseInt(args[2]));
		arraylist.add(Integer.parseInt(args[3]));
		arraylist.add(Integer.parseInt(args[4]));
		System.out.println(arraylist);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println(" Enter the Five arguments :");
		}
		catch(NumberFormatException e){
			
			System.out.println(" Enter only Integers :");
		}
		int size=arraylist.size();
		System.out.println("Size of the Array is :"+size);
		}



}