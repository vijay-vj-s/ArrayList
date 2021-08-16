import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ArrayList12{
		public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		ArrayList<String>arrayList1=new ArrayList<>();
		arrayList1.add(args[0]);
		arrayList1.add(args[1]);
		arrayList1.add(args[2]);
		
		
		List<String>arrayList2=new ArrayList<>();;
		System.out.println("Enter the Another 5 strings");
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		String s4=sc.nextLine();
		String s5=sc.nextLine();
		arrayList2.add(s1);
		arrayList2.add(s2);
		arrayList2.add(s3);
		arrayList2.add(s4);
		arrayList2.add(s5);
		System.out.println("First Array List is :"+arrayList1);
	    System.out.println("Second ArrayList is :"+arrayList2);
		
		ArrayList<String>arrayList3=new ArrayList<>();
		 
		arrayList3.addAll(arrayList1);
		arrayList3.addAll(arrayList2);
		int size=arrayList3.size();
		System.out.println("Size of the Third array list is :"+size);
		System.out.println("arraylist3 is :"+arrayList3);
		}







}