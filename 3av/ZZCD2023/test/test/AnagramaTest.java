package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio2.Anagrama;

class AnagramaTest {
	Anagrama anagrama = new Anagrama();
	
	@Test
	public void testValidaAnagrama() {
		
		assertTrue(anagrama.comprobarAnagrama("roma", "amor"));
		
		assertTrue(anagrama.comprobarAnagrama("copia", "opiac"));
		
		assertTrue(anagrama.comprobarAnagrama("arroz", "zorra"));

		assertTrue(anagrama.comprobarAnagrama("casa", "saca"));

		assertTrue(anagrama.comprobarAnagrama("snake", "ekans"));

		assertTrue(anagrama.comprobarAnagrama("pato", "topa"));

		assertTrue(anagrama.comprobarAnagrama("caso", "saco"));
        
		assertFalse(anagrama.comprobarAnagrama("roma", "amorr"));
        
		assertFalse(anagrama.comprobarAnagrama("roma", "romA"));
        
		assertFalse(anagrama.comprobarAnagrama("albóndiga", "almóndiga"));

		assertFalse(anagrama.comprobarAnagrama("Python", "pythoN"));
	}
	
	@ParameterizedTest
	@CsvSource({
		"roma, amor",
		"copia, opiac",
		"arroz, zorra",
		"casa, saca",
		"snake, ekans",
		"caso, saco"
	})
	public void anagramaParameterizedTestTrue(String str1, String str2) {
		Anagrama ana = new Anagrama();

		assertEquals(true, ana.comprobarAnagrama(str1, str2));
	}
	@ParameterizedTest
	@CsvSource({
		"roma, amorr",
		"roma, romA",
		"albóndiga, almóndiga",
		"Python, pythoN"
	})
	public void anagramaParameterizedTestFalse(String str1, String str2) {
		Anagrama ana = new Anagrama();

		assertFalse(ana.comprobarAnagrama(str1, str2));
	}
}
