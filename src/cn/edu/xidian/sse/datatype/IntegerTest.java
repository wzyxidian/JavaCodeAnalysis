package cn.edu.xidian.sse.datatype;

public class IntegerTest {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		//1.����toString(int i,int radix);��iת��Ϊ������radix���ַ�������ϸ���ܿ�������
		 // returns a string representation of the specified integer with radix 10
		 System.out.println("����toString(int i,int radix)����");
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
	    System.out.println("����toHexString����");
		String str = Integer.toHexString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊʮ�����Ƶģ�"+str);
		
		//3.����toOctalString����
		System.out.println("����toOctalString����");
		str = Integer.toOctalString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊ�˽��Ƶģ�"+ str);
		
		//4.����toBinaryString����
		System.out.println("����toBinaryString����");
		str = Integer.toBinaryString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊ�����Ƶģ�"+ str);
		
		//5.����getChars(int i, int index, char[] buf)������toString(i)�����к���getChars����
		//���������Ĭ�ϵķ��������Բ���ֱ�ӵ��ò���
		System.out.println("����toString����");
		str = Integer.toString(-65537);
		System.out.println("��ʮ���Ƶ�-65537ת��Ϊ�ַ�����"+str);
		
		//6.����parseInt(String s,int radix)����//s��ʾ������radixΪ��������������32��4����ʾ32��4���Ƶ�������ת����ʮ����Ϊ3*4+2
		System.out.println("����parseInt(String s,int radix)����");
		num = Integer.parseInt("32",4);
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//7.����parseInt(String s)����//s��ʾ������10Ϊ����������,���ı��ʻ��ǵ���parseInt(String s,10)����
		System.out.println("����parseInt(String s,int radix)����");
		num = Integer.parseInt("32");
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//8.����valueOf(String s, int radix)���������ı��ʻ��ǵ���parseInt(String s,int radix)����
		System.out.println("����valueOf(String s, int radix)����");
		num = Integer.valueOf("32",4);
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//9.����valueOf(String s)���������ı��ʻ��ǵ���parseInt(String s,int 10)����
		System.out.println("����valueOf(String s)����");
		num = Integer.valueOf("32");
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//9.����Integer(String s)���췽�������ı��ʻ��ǵ���parseInt(String s,int 10)����
		System.out.println("����Integer(String s)���췽��");
		num = new Integer("32");
		System.out.println("���ַ���32ת����ʮ����������"+num);
		
		//10.����toString()������û�в����ķ�����ʵ���ϵ��õ���toString(int i)����
		System.out.println("����toString�޲�������");
		Integer i = new Integer(5);
		str = i.toString();		
		System.out.println("��ʮ���Ƶ�5ת��Ϊ�ַ�����"+str);
		System.out.println("��ʮ���Ƶ�5ת��Ϊbyte���ͣ�"+ i.byteValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊshort���ͣ�"+i.shortValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊlong���ͣ�"+i.longValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊint���ͣ�"+i.intValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊfloat���ͣ�"+i.floatValue());
		System.out.println("��ʮ���Ƶ�5ת��Ϊdouble���ͣ�"+i.doubleValue());
		System.out.println("��ʮ���Ƶ�5ת��ΪhashCode��"+i.hashCode());
		
		//11.����equals(Object obj)
		System.out.println("����equals(Object obj)����");
		Integer in = new Integer(5);
		if(i.equals(in)){
			System.out.println("���Գɹ�");
		}
		
	}
	
}
