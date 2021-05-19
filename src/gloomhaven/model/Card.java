package gloomhaven.model;

public class Card {
    private int id;
    private String cardText;

    public Card(){

    }

    public Card(int id, String cardText) {
        this.id = id;
        this.cardText = cardText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardText='" + cardText + '\'' +
                '}';
    }
}
