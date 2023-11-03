package Testcases;

public class Task {
      int a=10;int b=20;
      
      public void sub() {
    	  System.out.println(b-a);
      }
      public void multi() {
    	  System.out.println(a*b);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task tk=new Task();	
		tk.sub();
		tk.multi();

}
}
