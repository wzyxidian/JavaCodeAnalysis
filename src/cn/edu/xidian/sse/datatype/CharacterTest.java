package cn.edu.xidian.sse.datatype;

public class CharacterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character c = new Character('c');
		System.out.println("******Character的常量******\r\n");
		System.out.println("Character.MIN_RADIX的值是：" + Character.MIN_RADIX);
		System.out.println("Character.MAX_RADIX的值是：" + Character.MAX_RADIX);
		System.out.println("Character.MIN_VALUE的值是：" + Character.MIN_VALUE);
		System.out.println("Character.MAX_VALUE的值是：" + Character.MAX_VALUE);
		System.out.println("Character.TYPE的值是：" + Character.TYPE);
		System.out.println("Character.UNASSIGNED的值是：" + Character.UNASSIGNED);
		System.out.println("Character.UPPERCASE_LETTER的值是：" + Character.UPPERCASE_LETTER);
		System.out.println("Character.LOWERCASE_LETTER的值是：" + Character.LOWERCASE_LETTER);
		System.out.println("Character.TITLECASE_LETTER的值是：" + Character.TITLECASE_LETTER);
		System.out.println("Character.MODIFIER_LETTER的值是：" + Character.MODIFIER_LETTER);
		System.out.println("Character.OTHER_LETTER的值是：" + Character.OTHER_LETTER);
		System.out.println("Character.NON_SPACING_MARK的值是：" + Character.NON_SPACING_MARK);
		System.out.println("Character.ENCLOSING_MARK的值是：" + Character.ENCLOSING_MARK);
		System.out.println("Character.COMBINING_SPACING_MARK的值是：" + Character.COMBINING_SPACING_MARK);
		System.out.println("Character.DECIMAL_DIGIT_NUMBER的值是：" + Character.DECIMAL_DIGIT_NUMBER);
		System.out.println("Character.LETTER_NUMBER的值是：" + Character.LETTER_NUMBER);
		System.out.println("Character.OTHER_NUMBER的值是：" + Character.OTHER_NUMBER);
		System.out.println("Character.SPACE_SEPARATOR的值是：" + Character.SPACE_SEPARATOR);
		System.out.println("Character.LINE_SEPARATOR的值是：" + Character.LINE_SEPARATOR);
		System.out.println("Character.PARAGRAPH_SEPARATOR的值是：" + Character.PARAGRAPH_SEPARATOR);
		System.out.println("Character.CONTROL的值是：" + Character.CONTROL);
		System.out.println("Character.FORMAT的值是：" + Character.FORMAT);
		System.out.println("Character.PRIVATE_USE的值是：" + Character.PRIVATE_USE);
		System.out.println("Character.SURROGATE的值是：" + Character.SURROGATE);
		System.out.println("Character.DASH_PUNCTUATION的值是：" + Character.DASH_PUNCTUATION);
		System.out.println("Character.START_PUNCTUATION的值是：" + Character.START_PUNCTUATION);
		System.out.println("Character.END_PUNCTUATION的值是：" + Character.END_PUNCTUATION);
		System.out.println("Character.CONNECTOR_PUNCTUATION的值是：" + Character.CONNECTOR_PUNCTUATION);
		System.out.println("Character.OTHER_PUNCTUATION的值是：" + Character.OTHER_PUNCTUATION);
		System.out.println("Character.MATH_SYMBOL的值是：" + Character.MATH_SYMBOL);
		System.out.println("Character.CURRENCY_SYMBOL的值是：" + Character.CURRENCY_SYMBOL);
		System.out.println("Character.MODIFIER_SYMBOL的值是：" + Character.MODIFIER_SYMBOL);
		System.out.println("Character.OTHER_SYMBOL的值是：" + Character.OTHER_SYMBOL);
		System.out.println("Character.INITIAL_QUOTE_PUNCTUATION的值是：" + Character.INITIAL_QUOTE_PUNCTUATION);
		System.out.println("Character.FINAL_QUOTE_PUNCTUATION的值是：" + Character.FINAL_QUOTE_PUNCTUATION);
		System.out.println("Character.DIRECTIONALITY_UNDEFINED的值是：" + Character.DIRECTIONALITY_UNDEFINED);
		System.out.println("Character.DIRECTIONALITY_LEFT_TO_RIGHT的值是：" + Character.DIRECTIONALITY_LEFT_TO_RIGHT);
		System.out.println("Character.DIRECTIONALITY_RIGHT_TO_LEFT的值是：" + Character.DIRECTIONALITY_RIGHT_TO_LEFT);
		System.out.println("Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC的值是：" + Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC);
		System.out.println("Character.DIRECTIONALITY_EUROPEAN_NUMBER的值是：" + Character.DIRECTIONALITY_EUROPEAN_NUMBER);
		System.out.println("Character.DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR的值是：" + Character.DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR);
		System.out.println("Character.DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR的值是：" + Character.DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR);
		System.out.println("Character.DIRECTIONALITY_ARABIC_NUMBER : 的值是：" + Character.DIRECTIONALITY_ARABIC_NUMBER);
		System.out.println("Character.DIRECTIONALITY_COMMON_NUMBER_SEPARATOR的值是：" + Character.DIRECTIONALITY_COMMON_NUMBER_SEPARATOR);
		System.out.println("Character.DIRECTIONALITY_NONSPACING_MARK的值是：" + Character.DIRECTIONALITY_NONSPACING_MARK);
		System.out.println("Character.DIRECTIONALITY_BOUNDARY_NEUTRAL的值是：" + Character.DIRECTIONALITY_BOUNDARY_NEUTRAL);
		System.out.println("Character.DIRECTIONALITY_PARAGRAPH_SEPARATOR的值是：" + Character.DIRECTIONALITY_PARAGRAPH_SEPARATOR);
		System.out.println("Character.DIRECTIONALITY_SEGMENT_SEPARATOR的值是：" + Character.DIRECTIONALITY_SEGMENT_SEPARATOR);
		System.out.println("Character.DIRECTIONALITY_WHITESPACE的值是：" + Character.DIRECTIONALITY_WHITESPACE);
		System.out.println("Character.DIRECTIONALITY_OTHER_NEUTRALS的值是：" + Character.DIRECTIONALITY_OTHER_NEUTRALS);
		System.out.println("Character.DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING的值是：" + Character.DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING);
		System.out.println("Character.DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE的值是：" + Character.DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE);
		System.out.println("Character.DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING的值是：" + Character.DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING);
		System.out.println("Character.DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE的值是：" + Character.DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE);
		System.out.println("Character.DIRECTIONALITY_POP_DIRECTIONAL_FORMAT的值是：" + Character.DIRECTIONALITY_POP_DIRECTIONAL_FORMAT);
		System.out.println("Character.SIZE的值是：" + Character.SIZE);
		
		System.out.println("\r\n******Character的方法******");
		System.out.println("******这里与Integer类似的方法将不再介绍******\r\n");
		//将char类型的数据进行封装成Character
		
		System.out.println("Character的构造函数Character(char 'c') ：" + c);
		System.out.println("Character.toString(char a)：" + Character.toString('c'));
	}

}
