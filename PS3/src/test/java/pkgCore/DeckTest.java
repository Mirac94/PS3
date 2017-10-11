package pkgCore;

import static org.junit.Assert.*;
import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;


import org.junit.Test;

public class DeckTest {

	@Test(expected = DeckException.class)
	public void TestEmptyDeck() throws DeckException {
			Deck Deck1 = new Deck();
			for (int i = 0; i < 52; i++) {
				Card c = Deck1.Draw();
			}
		}
	
	@Test
	public void TestDrawSuit() {
			Deck iDeck = new Deck();
			Card c = iDeck.Draw(eSuit.CLUBS);
			assertTrue(c.geteSuit() == eSuit.CLUBS);
	}
	
	@Test
	public void TestDrawRank() {
		Deck iDeck = new Deck();
		Card c = iDeck.Draw(eRank.KING);
		assertTrue(c.geteRank() == eRank.KING);
	}
	
	public void TestDeckRankCount() {
		Deck iDeck = new Deck();
		assertEquals(iDeck.RankCount(pkgEnum.eRank.ACE), 4);
	}
	
	public void TestDeckSuitCount() {
		Deck iDeck = new Deck();
		assertEquals(iDeck.SuitCount(pkgEnum.eSuit.DIAMONDS), 13);
	}

}
