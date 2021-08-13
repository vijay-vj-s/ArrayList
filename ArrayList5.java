import java.util.ArrayList;
  public class ArrayList5{
	  public static void main(String[]args){
	  ArrayList<Object> arraylist=new ArrayList<>();
	  Mobile m1=new Mobile("RealMe",10000);
	  Mobile m2=new Mobile("Samsung",25000);
	  arraylist.add(1);
	  arraylist.add(2);
	  arraylist.add("A");
	  arraylist.add("B");
	  //arraylist.add(m1);
	 // arraylist.add(m2);
	 ArrayList5 newArrayList=new ArrayList5();
	 
		System.out.println(arraylist);
		int size=arraylist.size();
		System.out.println("Size of the Array list is :"+size);
		
	                
	  }  
	  
  }