package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio2.Anagrama;

class AnagramaTest {
	
	
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
