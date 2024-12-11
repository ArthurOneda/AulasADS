package UtilTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Enums.FillSide;
import Utils.Validacoes;

public class utilsTest {
	@Test
	void testFillDireita() {
		String retornoChamada = Validacoes.Fill("abc", '*', FillSide.RIGHT, 5);
		assertEquals(retornoChamada, "abc**");
	}
	@Test
	void testFillEsquerda() {
		String retornoChamada = Validacoes.Fill("abc", '*', FillSide.LEFT, 5);
		assertEquals(retornoChamada, "**abc");
	}
}
