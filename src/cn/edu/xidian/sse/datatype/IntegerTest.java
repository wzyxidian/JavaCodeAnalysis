package cn.edu.xidian.sse.datatype;

public class IntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(17);
		int num = 0;
		
		//1.����toString(int i,int radix);��iת��Ϊ������radix���ַ�������ϸ���ܿ�������
		 // returns a string representation of the specified integer with radix 10
		 System.out.println("����toString(int i,int radix)����");
	     String retval = i.toString(-17, 1);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 16
	     retval = i.toString(30, 16);
	     System.out.println("Value = " + retval);
	     
	     // returns a string representation of the specified integer with radix 8
	     retval = i.toString(30, 8);
	     System.out.println("Value = " + retval);
	     
	     
		//2.����toHexString����
		//�������˷���return toUnsignedString(i, 4);����ط�Ϊʲô��4������������бȽ���ϸ�Ľ���
	    System.out.println("����toHexString����");
		String str = i.toHexString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊʮ�����Ƶģ�"+str);
		
		//3.����toOctalString����
		System.out.println("����toOctalString����");
		str = i.toOctalString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊ�˽��Ƶģ�"+ str);
		
		//4.����toBinaryString����
		System.out.println("����toBinaryString����");
		str = i.toBinaryString(30);
		System.out.println("��ʮ���Ƶ�30ת��Ϊ�����Ƶģ�"+ str);
		
		//5.����getChars(int i, int index, char[] buf)������toString(i)�����к���getChars����
		//���������Ĭ�ϵķ��������Բ���ֱ�ӵ��ò���
		str = i.toString(-65537);
		System.out.println("��ʮ���Ƶ�-65537ת��Ϊ�ַ�����"+str);
		
		//6.����parseInt(String s,int radix)����
		num = i.parseInt("8",2);
		System.out.println("���ַ���30ת����������"+num);
	}

}
