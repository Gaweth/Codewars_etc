package gloomhaven.service;

import gloomhaven.model.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService {

    private List<Card> cardDesk = new ArrayList<>();

    private Random randomId = new Random();

    public Card create(Card card) {

        int id = randomId.nextInt(100000);
        card.setId(id);
        cardDesk.add(card);
        return card;
    }

    public Card read(Integer id) {
        for (Card card : cardDesk) {

                // jeżeli identyfikatory są zgodne, to ...
                // ... zwracamy wyszukany/odczytany samochód
                return card;

        }
        // jeżeli nie znaleziono szukanego samochodu zwracamy null
        return null;
    }
}