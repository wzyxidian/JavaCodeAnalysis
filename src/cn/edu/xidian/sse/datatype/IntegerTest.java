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
		
		//1.����toString(int i,int radix);��iת��Ϊ������radix���ַ�������ϸ���ܿ�������
		 // returns a string representation of the specified integer with radix 10
		 System.out.println("-------����toString(int i,int radix)����-------");
	     String retval = Integer.toString(-17, 1);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 16
	     retval = Integer.toString(30, 16);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 8
	     retval = Integer.toString(30, 8);
	     System.out.println("Value = " + retval);
	     
	     
		//2.����toHexString����
		//�������˷���return toUnsignedString(i, 4);����ط�Ϊʲô��4������������бȽ���ϸ�Ľ���
	    System.out.println("-------����toHexString����-------");
		String str = Integer.toHexString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊʮ�����Ƶģ�"+str);
		
		//3.����toOctalString����
		System.out.println("-------����toOctalString����-------");
		str = Integer.toOctalString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊ�˽��Ƶģ�"+ str);
		
		//4.����toBinaryString����
		System.out.println("-------����toBinaryString����-------");
		str = Integer.toBinaryString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊ�����Ƶģ�"+ str);
		
		//5.����getChars(int i, int index, char[] buf)������toString(i)�����к���getChars����
		//���������Ĭ�ϵķ��������Բ���ֱ�ӵ��ò���
		System.out.println("-------����toString����-------");
		str = Integer.toString(-65537);
		System.out.println("��ʮ���Ƶ�-65537ת��Ϊ�ַ�����"+str);
		
		//6.����parseInt(String s,int radix)����//s��ʾ������radixΪ��������������32��4����ʾ32��4���Ƶ�������ת����ʮ����Ϊ3*4+2
		System.out.println("-------����parseInt(String s,int radix)����-------");
		num = Integer.parseInt("32",4);
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//7.����parseInt(String s)����//s��ʾ������10Ϊ����������,���ı��ʻ��ǵ���parseInt(String s,10)����
		System.out.println("-------����parseInt(String s,int radix)����-------");
		num = Integer.parseInt("32");
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//8.����valueOf(String s, int radix)���������ı��ʻ��ǵ���parseInt(String s,int radix)���������ص���valueOf(int i)
		System.out.println("-------����valueOf(String s, int radix)����-------");
		num = Integer.valueOf("32",4);
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//9.����valueOf(String s)���������ı��ʻ��ǵ���parseInt(String s,int 10)����,Ȼ�����valueOf(int i)
		System.out.println("-------����valueOf(String s)����-------");
		num = Integer.valueOf("32");
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//10.����valueOf(int i)�������Զ�װ��������ǵ���������������캯��Ĭ�ϵ����������
		System.out.println("-------����valueOf(int i)-------");
		Integer.valueOf(32);
		System.out.println("����valueOf(int i),��32ת����Integer����"+Integer.valueOf(32));
		
		//11.����Integer(String s)���췽�������ı��ʻ��ǵ���parseInt(String s,int 10)����
		System.out.println("-------����Integer(String s)���췽��-------");
		num = new Integer("32");
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//12.����toString()������û�в����ķ�����ʵ���ϵ��õ���toString(int i)����
		System.out.println("-------����toString�޲�������-------");
		Integer i = new Integer(5);
		str = i.toString();		
		System.out.println("��ʮ���Ƶ�5ת��Ϊ�ַ�����"+str);
		
		//13.���Բ����������Integer����ת�����������͵���ֵ
		System.out.println("-------�����ǲ����������Integer����ת�����������͵���ֵ-------");
		System.out.println("��ʮ���Ƶ�5ת��Ϊbyte���ͣ�"+ i.byteValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊshort���ͣ�"+i.shortValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊlong���ͣ�"+i.longValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊint���ͣ�"+i.intValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊfloat���ͣ�"+i.floatValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊdouble���ͣ�"+i.doubleValue());
		System.out.println("��ʮ���Ƶ�5ת��ΪhashCode��"+i.hashCode());
		
		//14.����equals(Object obj)
		System.out.println("-------����equals(Object obj)����-------");
		Integer in = new Integer(5);
		if(i.equals(in)){
			System.out.println("���Գɹ�");
		}
		
		//15.����decode(String nm)����
		System.out.println("-------����decode(String nm)����-------");
		Integer.decode("0x32");
		System.out.println("��ʮ�����Ƶ�0x32ת����ʮ����������"+Integer.decode("0x32"));
		
		//16.����getInteger(String nm, Integer val)����
		System.out.println("-------����getInteger(String nm, Integer val)����-------");
		num = Integer.getInteger("sun.arch.data.model", 50);
		System.out.println("�õ�ϵͳ���Ե�����£�getInteger(String nm, Integer val)�������ؽ����"+num);
		num = Integer.getInteger(null,50);
		System.out.println("δ�õ�ϵͳ���Ե�����£�getInteger(String nm, Integer val)�������ؽ����"+num);
	
		//17.����getInteger(String nm)����,�����õ���getInteger(String nm, null)����
		System.out.println("-------����getInteger(String nm)����-------");
		num = Integer.getInteger("sun.arch.data.model");
		System.out.println("�õ�ϵͳ���Ե�����£�getInteger(String nm)�������ؽ����"+num);	
		System.out.println("δ�õ�ϵͳ���Ե�����£�getInteger(String nm)�������ؽ����"+Integer.getInteger(null));
		
		//18.����getInteger(String nm)����,�����õ���getInteger(String nm, null)����
		System.out.println("-------����getInteger(String nm, int val)����-------");
		num = Integer.getInteger("sun.arch.data.model", 5);
		System.out.println("�õ�ϵͳ���Ե�����£�getInteger(String nm, int val)�������ؽ����"+num);	
		System.out.println("δ�õ�ϵͳ���Ե�����£�getInteger(String nm, int val)�������ؽ����"+Integer.getInteger(null,5));
	
		//19.����compare(int x, int y)����
		System.out.println("-------����compare(int x, int y)����-------");
		System.out.println("�������£�compare(5, 5)�������ؽ����"+Integer.compare(5, 5));
		System.out.println("С������£�compare(4, 5)�������ؽ����"+Integer.compare(4, 5));
		System.out.println("��������£�compare(5, 6)�������ؽ����"+Integer.compare(5, 6));
		
		//20.����compareTo(Integer anotherInteger)����,ʵ�����ǵ�������compare����
		System.out.println("-------����compareTo(Integer anotherInteger)����-------");
		Integer a = 5;
		System.out.println("�������£�compareTo(5)�������ؽ����"+a.compareTo(5));
		System.out.println("С������£�compareTo(6)�������ؽ����"+a.compareTo(6));
		System.out.println("��������£�compareTo(4)�������ؽ����"+a.compareTo(4));
		
		//21.����highestOneBit(int i)����
		System.out.println("-------����highestOneBit(int i)����-------");
		System.out.println("highestOneBit(int i): " + Integer.highestOneBit(6));
				
		//22.����lowestOneBit(int i)����
		System.out.println("-------����lowestOneBit(int i)����-------");
		System.out.println("lowestOneBit(5): " + Integer.lowestOneBit(5));
		
		//23.����numberOfLeadingZeros��int i������
		System.out.println("-------����numberOfLeadingZeros(int i)����-------");
		System.out.println("numberOfLeadingZeros(2): " + Integer.numberOfLeadingZeros(2));
		
		//24.����numberOfTrailingZeros��int i������
		System.out.println("-------����numberOfTrailingZeros(int i)����-------");
		System.out.println("numberOfTrailingZeros(2): " + Integer.numberOfTrailingZeros(2));
		
		//25.����bitCount��int i������
		System.out.println("-------����bitCount(int i)����-------");
		System.out.println("bitCount(5): " + Integer.bitCount(5));
		
		//26.����rotateLeft(int i, int distance)����,rotateRight(int i, int distance)����
		System.out.println("-------����rotateLeft(int i, int distance)������rotateRight(int i, int distance)����-------");
		System.out.println("rotateLeft(5,2): " + Integer.rotateLeft(5, 2));
		System.out.println("rotateRight(5,2): " + Integer.rotateRight(5, 2));
			
		//27.����reverse(int i)����
		System.out.println("-------����reverse(int i)����-------");
		System.out.println("reverse(5): " + Integer.reverse(5));
		
		//28.����signum(int i)����
		System.out.println("-------����signum(int i)����-------");
		System.out.println("signum(5): " + Integer.signum(5));
		System.out.println("signum(0): " + Integer.signum(0));
		System.out.println("signum(-5): " + Integer.signum(-5));
		
		//29.����reverseBytes(int i)����
		System.out.println("-------����reverseBytes(int i)����-------");
		System.out.println("reverseBytes(5): " + Integer.reverseBytes(5));
		
	
	}
	
}
