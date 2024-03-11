package K2161350.SDP.restservice;

import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CodeTemplateTest {
	@Test
	public void CodeTemplate() {
		ArrayList<Integer> results = null;
		String code = "abc";
		CodeTemplate expected = new CodeTemplate("abc");
		CodeTemplate actual = new CodeTemplate(results, code);

		assertEquals(expected, actual);
	}

	@Test
	public void CodeTemplateTODO() {
		int score = 123;
		CodeTemplate expected = new CodeTemplate("abc");
		CodeTemplate actual = new CodeTemplate(score);

		assertEquals(expected, actual);
	}

	@Test
	public void CodeTemplateTODOTODO() {
		String code = "abc";
		CodeTemplate expected = new CodeTemplate("abc");
		CodeTemplate actual = new CodeTemplate(code);

		assertEquals(expected, actual);
	}

	@Test
	public void getCatchScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getCatchScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getCode() {
		CodeTemplate c = new CodeTemplate("abc");
		String expected = "abc";
		String actual = c.getCode();

		assertEquals(expected, actual);
	}

	@Test
	public void getDoScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getDoScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getForScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getForScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getIfScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getIfScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getSelectScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getSelectScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getSwitchScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getSwitchScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getThenScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getThenScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getTryScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getTryScore();

		assertEquals(expected, actual);
	}

	@Test
	public void getWhileScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int expected = 123;
		int actual = c.getWhileScore();

		assertEquals(expected, actual);
	}

	@Test
	public void setCatchScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int catchScore = 123;
		c.setCatchScore(catchScore);
	}

	@Test
	public void setCode() {
		CodeTemplate c = new CodeTemplate("abc");
		String code = "abc";
		c.setCode(code);
	}

	@Test
	public void setDoScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int doScore = 123;
		c.setDoScore(doScore);
	}

	@Test
	public void setForScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int forScore = 123;
		c.setForScore(forScore);
	}

	@Test
	public void setIfScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int ifScore = 123;
		c.setIfScore(ifScore);
	}

	@Test
	public void setScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int score = 123;
		c.setScore(score);
	}

	@Test
	public void setSelectScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int selectScore = 123;
		c.setSelectScore(selectScore);
	}

	@Test
	public void setSwitchScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int switchScore = 123;
		c.setSwitchScore(switchScore);
	}

	@Test
	public void setThenScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int thenScore = 123;
		c.setThenScore(thenScore);
	}

	@Test
	public void setTryScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int tryScore = 123;
		c.setTryScore(tryScore);
	}

	@Test
	public void setWhileScore() {
		CodeTemplate c = new CodeTemplate("abc");
		int whileScore = 123;
		c.setWhileScore(whileScore);
	}
}
