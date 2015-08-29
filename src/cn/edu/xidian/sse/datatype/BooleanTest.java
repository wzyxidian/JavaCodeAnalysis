package cn.edu.xidian.sse.datatype;

public class BooleanTest {

	/**
	 * @author zhiyong wang
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean flag = Boolean.valueOf("true");
		Boolean flag1 = Boolean.valueOf(false);
		
		System.out.println("******����Boolean����ĳ���******");
		
		//1.����Boolean.TRUE,���ǵ���Boolean�Ĺ��캯��Boolean(boolean value),�½���һ����������TRUE��Boolean���͵�		
		System.out.println("Boolean.TRUE��ֵ�ǣ�" + Boolean.TRUE);
		
		//2.����Boolean.FALSE,���ǵ���Boolean�Ĺ��캯��Boolean(boolean value),�½���һ����������FALSE��Boolean���͵�		
		System.out.println("Boolean.FALSE��ֵ�ǣ�" + Boolean.FALSE);
		
		//3.����Boolean.TYPE,TYPE��������Class<Boolean>
		System.out.println("Boolean.TYPE��ֵ�ǣ�" + Boolean.TYPE);
	
		System.out.println("\r\n******�����������캯��******");
		//4.����Boolean(boolean value)		
		System.out.println("new Boolean(true)��ֵ��" + new Boolean(true));
		
		//5.����Boolean(String s)������ط�ֻ�����ַ����ǡ�true�����������Сд����ʱ�򷵻�true������ʱ�򶼷���false,���ڲ�������˽�к���toBoolean(String s)
		System.out.println("new Boolean(\"true\")��ֵ��" + new Boolean("true"));
		System.out.println("new Boolean(\"\")��ֵ��" + new Boolean(""));
		
		System.out.println("\r\n******����Boolean�ķ���******");
		//6.����parseBoolean(String s)������ط�ֻ�����ַ����ǡ�true�����������Сд����ʱ�򷵻�true������ʱ�򶼷���false,���ڲ�������˽�к���toBoolean(String s)
		System.out.println("parseBoolean(\"TRUE\")ֵ��" +Boolean.parseBoolean("TRUE"));
		System.out.println("parseBoolean(\"\")��ֵ��" + Boolean.parseBoolean(""));
		
		//7.����booleanValue()����		
		System.out.println("booleanValue()���в��������ֵ��" + flag.booleanValue());
		
		//8.����valueOf(boolean b)����
		System.out.println("valueOf(boolean b)����װ�������ֵ��" + Boolean.valueOf(true));
		 
		//9.����toString(boolean b)����
		System.out.println("toString(true)ת�����ֵ�ǣ�" + Boolean.toString(true));
		
		//10.���� toString()����
		System.out.println("flag.toString()��ֵ�ǣ�" + flag.toString());
		
		//11.����hashCode()����
		System.out.println("flag.hashCode()��ֵ�ǣ�" + flag.hashCode());
		System.out.println("flag1.hashCode()��ֵ�ǣ�" + flag1.hashCode());
		
		//12.����equals(Object obj)
		System.out.println("equals(Object obj)�ķ���ֵ�ǣ�" + flag.equals(flag1));
		
		//13.����getBoolean(String name)
		System.out.println("getBoolean(String name)" +  Boolean.getBoolean("sun.arch.data.model"));
    
		//14.����compare(boolean x,boolean y)
		System.out.println("compare(true, true)��ֵ�ǣ�" + Boolean.compare(true, true));
		System.out.println("compare(true, false)��ֵ�ǣ�" + Boolean.compare(true, false));
		System.out.println("compare(false, true)��ֵ�ǣ�" + Boolean.compare(false, true));
		
		//15.����compareTo(Boolean b)����
		System.out.println("flag.compareTo(flag1)��ֵ�ǣ�" + flag.compareTo(flag1));
	}

}
