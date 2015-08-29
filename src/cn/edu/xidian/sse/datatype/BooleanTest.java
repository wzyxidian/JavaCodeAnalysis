package cn.edu.xidian.sse.datatype;

public class BooleanTest {

	/**
	 * @author zhiyong wang
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean flag = Boolean.valueOf("true");
		Boolean flag1 = Boolean.valueOf(false);
		
		System.out.println("******测试Boolean里面的常量******");
		
		//1.测试Boolean.TRUE,他是调用Boolean的构造函数Boolean(boolean value),新建了一个对象，所以TRUE是Boolean类型的		
		System.out.println("Boolean.TRUE的值是：" + Boolean.TRUE);
		
		//2.测试Boolean.FALSE,他是调用Boolean的构造函数Boolean(boolean value),新建了一个对象，所以FALSE是Boolean类型的		
		System.out.println("Boolean.FALSE的值是：" + Boolean.FALSE);
		
		//3.测试Boolean.TYPE,TYPE的类型是Class<Boolean>
		System.out.println("Boolean.TYPE的值是：" + Boolean.TYPE);
	
		System.out.println("\r\n******测试两个构造函数******");
		//4.测试Boolean(boolean value)		
		System.out.println("new Boolean(true)的值：" + new Boolean(true));
		
		//5.测试Boolean(String s)，这个地方只有是字符串是“true”（不管其大小写）的时候返回true，其他时候都返回false,其内部调用了私有函数toBoolean(String s)
		System.out.println("new Boolean(\"true\")的值：" + new Boolean("true"));
		System.out.println("new Boolean(\"\")的值：" + new Boolean(""));
		
		System.out.println("\r\n******测试Boolean的方法******");
		//6.测试parseBoolean(String s)，这个地方只有是字符串是“true”（不管其大小写）的时候返回true，其他时候都返回false,其内部调用了私有函数toBoolean(String s)
		System.out.println("parseBoolean(\"TRUE\")值：" +Boolean.parseBoolean("TRUE"));
		System.out.println("parseBoolean(\"\")的值：" + Boolean.parseBoolean(""));
		
		//7.测试booleanValue()方法		
		System.out.println("booleanValue()进行拆箱操作的值：" + flag.booleanValue());
		
		//8.测试valueOf(boolean b)方法
		System.out.println("valueOf(boolean b)进行装箱操作的值：" + Boolean.valueOf(true));
		 
		//9.测试toString(boolean b)方法
		System.out.println("toString(true)转换后的值是：" + Boolean.toString(true));
		
		//10.测试 toString()方法
		System.out.println("flag.toString()的值是：" + flag.toString());
		
		//11.测试hashCode()方法
		System.out.println("flag.hashCode()的值是：" + flag.hashCode());
		System.out.println("flag1.hashCode()的值是：" + flag1.hashCode());
		
		//12.测试equals(Object obj)
		System.out.println("equals(Object obj)的返回值是：" + flag.equals(flag1));
		
		//13.测试getBoolean(String name)
		System.out.println("getBoolean(String name)" +  Boolean.getBoolean("sun.arch.data.model"));
    
		//14.测试compare(boolean x,boolean y)
		System.out.println("compare(true, true)的值是：" + Boolean.compare(true, true));
		System.out.println("compare(true, false)的值是：" + Boolean.compare(true, false));
		System.out.println("compare(false, true)的值是：" + Boolean.compare(false, true));
		
		//15.测试compareTo(Boolean b)方法
		System.out.println("flag.compareTo(flag1)的值是：" + flag.compareTo(flag1));
	}

}
