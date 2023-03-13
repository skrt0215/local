public class Deck {

    private String gamerTag;
    private Card[] deck = new Card[30];
    private int position;

    public Deck(String newTag)
    {
        gamerTag = newTag;
        position = 0;
    }

    public void setGamerTag(String gamerTag)
    {
        this.gamerTag = gamerTag;
    }

    public String getGamerTag()
    {
        return gamerTag;
    }


    public void addCard(Card c)
    {
        deck[position] = c;
        position++;
    }

}