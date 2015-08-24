package cn.edu.xidian.sse.datatype;

public class IntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		//1.测试toString(int i,int radix);将i转换为基数是radix的字符串，详细介绍看麦库记事
		 // returns a string representation of the specified integer with radix 10
		 System.out.println("测试toString(int i,int radix)方法");
	     String retval = Integer.toString(-17, 1);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 16
	     retval = Integer.toString(30, 16);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 8
	     retval = Integer.toString(30, 8);
	     System.out.println("Value = " + retval);
	     
	     
		//2.测试toHexString方法
		//他调用了方法return toUnsignedString(i, 4);这个地方为什么是4，我在麦库上有比较详细的介绍
	    System.out.println("测试toHexString方法");
		String str = Integer.toHexString(30);
		System.out.println("将十进制的30转换为十六进制的："+str);
		
		//3.测试toOctalString方法
		System.out.println("测试toOctalString方法");
		str = Integer.toOctalString(30);
		System.out.println("将十进制的30转换为八进制的："+ str);
		
		//4.测试toBinaryString方法
		System.out.println("测试toBinaryString方法");
		str = Integer.toBinaryString(30);
		System.out.println("将十进制的30转换为二进制的："+ str);
		
		//5.测试getChars(int i, int index, char[] buf)方法，toString(i)方法中含有getChars方法
		//这个方法是默认的方法，所以不能直接调用测试
		str = Integer.toString(-65537);
		System.out.println("将十进制的-65537转换为字符串："+str);
		
		//6.测试parseInt(String s,int radix)方法//s表示的是以radix为基数的整数，（32，4）表示32是4进制的整数，转换成十进制为3*4+2
		num = Integer.parseInt("32",4);
		System.out.println("将字符串32转换成十进制整数："+num);
		
	}

}
