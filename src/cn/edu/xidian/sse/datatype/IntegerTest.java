package cn.edu.xidian.sse.datatype;

import java.util.Vector;

public class IntegerTest {

	/**
	 * @author zhiyong wang
	 * @exception to test the method of Integer 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		//1.测试toString(int i,int radix);将i转换为基数是radix的字符串，详细介绍看麦库记事
		 // returns a string representation of the specified integer with radix 10
		 System.out.println("-------测试toString(int i,int radix)方法-------");
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
	    System.out.println("-------测试toHexString方法-------");
		String str = Integer.toHexString(30);
		System.out.println("将十进制的30转换为十六进制的："+str);
		
		//3.测试toOctalString方法
		System.out.println("-------测试toOctalString方法-------");
		str = Integer.toOctalString(30);
		System.out.println("将十进制的30转换为八进制的："+ str);
		
		//4.测试toBinaryString方法
		System.out.println("-------测试toBinaryString方法-------");
		str = Integer.toBinaryString(30);
		System.out.println("将十进制的30转换为二进制的："+ str);
		
		//5.测试getChars(int i, int index, char[] buf)方法，toString(i)方法中含有getChars方法
		//这个方法是默认的方法，所以不能直接调用测试
		System.out.println("-------测试toString方法-------");
		str = Integer.toString(-65537);
		System.out.println("将十进制的-65537转换为字符串："+str);
		
		//6.测试parseInt(String s,int radix)方法//s表示的是以radix为基数的整数，（32，4）表示32是4进制的整数，转换成十进制为3*4+2
		System.out.println("-------测试parseInt(String s,int radix)方法-------");
		num = Integer.parseInt("32",4);
		System.out.println("将字符串32转换成十进制整数："+num);
		
		//7.测试parseInt(String s)方法//s表示的是以10为基数的整数,他的本质还是调用parseInt(String s,10)方法
		System.out.println("-------测试parseInt(String s,int radix)方法-------");
		num = Integer.parseInt("32");
		System.out.println("将字符串32转换成十进制整数："+num);
		
		//8.测试valueOf(String s, int radix)方法，他的本质还是调用parseInt(String s,int radix)方法，返回调用valueOf(int i)
		System.out.println("-------测试valueOf(String s, int radix)方法-------");
		num = Integer.valueOf("32",4);
		System.out.println("将字符串32转换成十进制整数："+num);
		
		//9.测试valueOf(String s)方法，他的本质还是调用parseInt(String s,int 10)方法,然会调用valueOf(int i)
		System.out.println("-------测试valueOf(String s)方法-------");
		num = Integer.valueOf("32");
		System.out.println("将字符串32转换成十进制整数："+num);
		
		//10.测试valueOf(int i)方法，自动装箱操作都是调用这个方法，构造函数默认调用这个方法
		System.out.println("-------测试valueOf(int i)-------");
		Integer.valueOf(32);
		System.out.println("调用valueOf(int i),将32转换成Integer对象"+Integer.valueOf(32));
		
		//11.测试Integer(String s)构造方法，他的本质还是调用parseInt(String s,int 10)方法
		System.out.println("-------测试Integer(String s)构造方法-------");
		num = new Integer("32");
		System.out.println("将字符串32转换成十进制整数："+num);
		
		//12.测试toString()方法，没有参数的方法，实际上调用的是toString(int i)方法
		System.out.println("-------测试toString无参数方法-------");
		Integer i = new Integer(5);
		str = i.toString();		
		System.out.println("将十进制的5转换为字符串："+str);
		
		//13.测试拆箱操作，将Integer对象转换成其他类型的数值
		System.out.println("-------以下是拆箱操作，将Integer对象转换成其他类型的数值-------");
		System.out.println("将十进制的5转换为byte类型："+ i.byteValue());
		System.out.println("将十进制的5转换为short类型："+i.shortValue());
		System.out.println("将十进制的5转换为long类型："+i.longValue());
		System.out.println("将十进制的5转换为int类型："+i.intValue());
		System.out.println("将十进制的5转换为float类型："+i.floatValue());
		System.out.println("将十进制的5转换为double类型："+i.doubleValue());
		System.out.println("将十进制的5转换为hashCode："+i.hashCode());
		
		//14.测试equals(Object obj)
		System.out.println("-------测试equals(Object obj)方法-------");
		Integer in = new Integer(5);
		if(i.equals(in)){
			System.out.println("测试成功");
		}
		
		//15.测试decode(String nm)方法
		System.out.println("-------测试decode(String nm)方法-------");
		Integer.decode("0x32");
		System.out.println("将十六进制的0x32转换成十进制整数："+Integer.decode("0x32"));
		
		//16.测试getInteger(String nm, Integer val)方法
		System.out.println("-------测试getInteger(String nm, Integer val)方法-------");
		num = Integer.getInteger("sun.arch.data.model", 50);
		System.out.println("得到系统属性的情况下：getInteger(String nm, Integer val)方法返回结果："+num);
		num = Integer.getInteger(null,50);
		System.out.println("未得到系统属性的情况下：getInteger(String nm, Integer val)方法返回结果："+num);
	
		//17.测试getInteger(String nm)方法,他调用的是getInteger(String nm, null)方法
		System.out.println("-------测试getInteger(String nm)方法-------");
		num = Integer.getInteger("sun.arch.data.model");
		System.out.println("得到系统属性的情况下：getInteger(String nm)方法返回结果："+num);	
		System.out.println("未得到系统属性的情况下：getInteger(String nm)方法返回结果："+Integer.getInteger(null));
		
		//18.测试getInteger(String nm)方法,他调用的是getInteger(String nm, null)方法
		System.out.println("-------测试getInteger(String nm, int val)方法-------");
		num = Integer.getInteger("sun.arch.data.model", 5);
		System.out.println("得到系统属性的情况下：getInteger(String nm, int val)方法返回结果："+num);	
		System.out.println("未得到系统属性的情况下：getInteger(String nm, int val)方法返回结果："+Integer.getInteger(null,5));
	
		//19.测试compare(int x, int y)方法
		System.out.println("-------测试compare(int x, int y)方法-------");
		System.out.println("相等情况下：compare(5, 5)方法返回结果："+Integer.compare(5, 5));
		System.out.println("小于情况下：compare(4, 5)方法返回结果："+Integer.compare(4, 5));
		System.out.println("大于情况下：compare(5, 6)方法返回结果："+Integer.compare(5, 6));
		
		//20.测试compareTo(Integer anotherInteger)方法,实际上是调用上面compare方法
		System.out.println("-------测试compareTo(Integer anotherInteger)方法-------");
		Integer a = 5;
		System.out.println("相等情况下：compareTo(5)方法返回结果："+a.compareTo(5));
		System.out.println("小于情况下：compareTo(6)方法返回结果："+a.compareTo(6));
		System.out.println("大于情况下：compareTo(4)方法返回结果："+a.compareTo(4));
		
		//21.测试highestOneBit(int i)方法
		System.out.println("-------测试highestOneBit(int i)方法-------");
		System.out.println("highestOneBit(int i): " + Integer.highestOneBit(6));
				
		//22.测试lowestOneBit(int i)方法
		System.out.println("-------测试lowestOneBit(int i)方法-------");
		System.out.println("lowestOneBit(5): " + Integer.lowestOneBit(5));
		
		//23.测试numberOfLeadingZeros（int i）方法
		System.out.println("-------测试numberOfLeadingZeros(int i)方法-------");
		System.out.println("numberOfLeadingZeros(2): " + Integer.numberOfLeadingZeros(2));
		
		//24.测试numberOfTrailingZeros（int i）方法
		System.out.println("-------测试numberOfTrailingZeros(int i)方法-------");
		System.out.println("numberOfTrailingZeros(2): " + Integer.numberOfTrailingZeros(2));
		
		//25.测试bitCount（int i）方法
		System.out.println("-------测试bitCount(int i)方法-------");
		System.out.println("bitCount(5): " + Integer.bitCount(5));
		
		//26.测试rotateLeft(int i, int distance)方法,rotateRight(int i, int distance)方法
		System.out.println("-------测试rotateLeft(int i, int distance)方法，rotateRight(int i, int distance)方法-------");
		System.out.println("rotateLeft(5,2): " + Integer.rotateLeft(5, 2));
		System.out.println("rotateRight(5,2): " + Integer.rotateRight(5, 2));
			
		//27.测试reverse(int i)方法
		System.out.println("-------测试reverse(int i)方法-------");
		System.out.println("reverse(5): " + Integer.reverse(5));
		
		//28.测试signum(int i)方法
		System.out.println("-------测试signum(int i)方法-------");
		System.out.println("signum(5): " + Integer.signum(5));
		System.out.println("signum(0): " + Integer.signum(0));
		System.out.println("signum(-5): " + Integer.signum(-5));
		
		//29.测试reverseBytes(int i)方法
		System.out.println("-------测试reverseBytes(int i)方法-------");
		System.out.println("reverseBytes(5): " + Integer.reverseBytes(5));
		
	
	}
	
}
