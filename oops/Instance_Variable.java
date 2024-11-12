package oops;

public class Instance_Variable {
	String name ;
	int age ;
      public static void main(String[] args) {
    	  Instance_Variable in = new Instance_Variable();
    	  in.name="liton";
    	  in.age=22;
    	  System.out.println(in.age +"   " + in.name);
    	  Instance_Variable in1 = new Instance_Variable();
    	  in1.name="Sambit";
    	  in1.age=22;
    	  System.out.println(in1.age +"   " + in1.name);
		
	}

}
