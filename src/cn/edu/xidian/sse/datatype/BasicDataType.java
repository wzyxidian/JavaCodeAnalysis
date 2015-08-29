package cn.edu.xidian.sse.datatype;

public class BasicDataType {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer = new Integer(4);
		integer = new Integer("4");
		int i = 1;
		boolean negative = (i < 0);
		System.out.println(negative);
//		point<String> p = new point<String>();
//		p.setVar("it");
//		System.out.println(p.getVar().toString());	
//		fun(p);
		Boolean flag =  new Boolean("s");
		
	}
//	public static void fun(point<?> str){
//		System.out.println(str.getVar());
//	}

}

class point<T>{
	private T var;
	public T getVar(){
		return var;
	}
	public void setVar(T var){
		this.var = var;
	}
}