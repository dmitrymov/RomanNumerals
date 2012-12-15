import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTest {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("", number.toRoman(0));
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("V", number.toRoman(5));
		assertEquals("VIII", number.toRoman(8));
		assertEquals("XII", number.toRoman(12));
		/*
		assertEquals("XXIV", number.toRoman(24));
		assertEquals("XLIX", number.toRoman(49));
		assertEquals("LXXVII", number.toRoman(77));
		assertEquals("XCIX", number.toRoman(99));
		assertEquals("CCLIV", number.toRoman(254));
		assertEquals("DCCLXVIII", number.toRoman(768));
		assertEquals("MI", number.toRoman(1001));
		assertEquals("MDLXVII", number.toRoman(1567));
		assertEquals("MMCCCXXXIII", number.toRoman(2333));
		assertEquals("MMMCMXCIX", number.toRoman(3999));
		*/
	}

}
