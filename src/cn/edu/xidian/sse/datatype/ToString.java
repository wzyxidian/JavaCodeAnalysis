package cn.edu.xidian.sse.datatype;

public class ToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Integer i = new Integer(10);
		   
		     // returns a string representation of the specified integer with radix 10
		     String retval = i.toString(-17, 1);
		     System.out.println("Value = " + retval);
		     
		     // returns a string representation of the specified integer with radix 16
		     retval = i.toString(30, 16);
		     System.out.println("Value = " + retval);
		     
		     // returns a string representation of the specified integer with radix 8
		     retval = i.toString(30, 8);
		     System.out.println("Value = " + retval);
		     
	}

}
