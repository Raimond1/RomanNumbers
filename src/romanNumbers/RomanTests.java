package romanNumbers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class RomanTests {

	@Test
	public void singleRomanNumberTest(){
		RomanNumbers rn= new RomanNumbers();
		assertThat(rn.romanChToNum('V'), is(5));
		assertThat(rn.romanChToNum('C'), is(100));
		assertThat(rn.romanChToNum('D'), is(500));
	}
	
	@Test
	public void romanNumbersTest(){
		RomanNumbers rn= new RomanNumbers();
		assertThat(rn.romanNumsToArabic("VI"), is(6));
		assertThat(rn.romanNumsToArabic("IC"), is(99));
		assertThat(rn.romanNumsToArabic("DCLXVI"), is(666));
		assertThat(rn.romanNumsToArabic("LXIX"), is(69));
	}
}
