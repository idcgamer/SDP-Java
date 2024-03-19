package K2161350.SDP.restservice;

import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SDPTest {
	@Test
	public void CodeForFindingScore() {
		String code = "abc";
		ArrayList<Integer> expected = null;
		ArrayList<Integer> actual = SDP.CodeForFindingScore(code);

		assertEquals(expected, actual);
	}

	@Test
	public void getLanguage() {
		String expected = "abc";
		String actual = SDP.getLanguage();

		assertEquals(expected, actual);
	}

	@Test
	public void setLanguage() {
		String language = "abc";
		SDP.setLanguage(language);
	}
}
