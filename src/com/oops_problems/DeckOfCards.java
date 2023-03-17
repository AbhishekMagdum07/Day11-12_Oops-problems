package com.oops_problems;

public class DeckOfCards {
    public static void deckOfCards() {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        for (int i = 0; i < deck.length; i++) { // initializing the cards
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) { // shuffle the cards
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(rank + " of " + suit);
        }
    }
    public static void main(String[] args) {
        deckOfCards();
    }
}
