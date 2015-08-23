package cn.edu.xidian.sse.datatype;

public class IntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(17);
		int num = 0;
		
		//1.测试toString(int i,int radix);将i转换为基数是radix的字符串，详细介绍看麦库记事
		 // returns a string representation of the specified integer with radix 10
		 System.out.println("测试toString(int i,int radix)方法");
	     String retval = i.toString(-17, 1);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 16
	     retval = i.toString(30, 16);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 8
	     retval = i.toString(30, 8);
	     System.out.println("Value = " + retval);
	     
	     
		//2.测试toHexString方法
		//他调用了方法return toUnsignedString(i, 4);这个地方为什么是4，我在麦库上有比较详细的介绍
	    System.out.println("测试toHexString方法");
		String str = i.toHexString(30);
		System.out.println("将十进制的30转换为十六进制的："+str);
		
		//3.测试toOctalString方法
		System.out.println("测试toOctalString方法");
		str = i.toOctalString(30);
		System.out.println("将十进制的30转换为八进制的："+ str);
		
		//4.测试toBinaryString方法
		System.out.println("测试toBinaryString方法");
		str = i.toBinaryString(30);
		System.out.println("将十进制的30转换为二进制的："+ str);
		
		//5.测试getChars(int i, int index, char[] buf)方法，toString(i)方法中含有getChars方法
		//这个方法是默认的方法，所以不能直接调用测试
		str = i.toString(-65537);
		System.out.println("将十进制的-65537转换为字符串："+str);
		
		//6.测试parseInt(String s,int radix)方法
		num = i.parseInt("8",2);
		System.out.println("将字符串30转换成整数："+num);
	}

}
