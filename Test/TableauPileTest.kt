import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TableauPileTest {

    @Test
    fun addCards() {

        //arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        val cards = mutableListOf(Card(11, diamonds))

        //act

        tableauPile.addCards(cards)


        //assert
        assertEquals(2, tableauPile.cards.size)

    }

    @Test
    fun removeCard() {

        //arrange
        val tableauPile = TableauPile(mutableListOf(Card(4, clubs), Card(3, diamonds), Card(2, spades)))



        //act

        tableauPile.removeCard(1)

        //assert

        assertEquals(mutableListOf(Card(4, clubs, true)), tableauPile.cards)
    }
}