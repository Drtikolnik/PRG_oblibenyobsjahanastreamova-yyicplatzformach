public class SpotifyPodcast implements IObsah{

    private String nazev;
    private int delka;
    private String moderator;
    public SpotifyPodcast(String nazev, int delka, String moderator) {
        this.nazev = nazev;
        this.delka = delka;
        this.moderator = moderator;
    }

    public int getDelka() {
        return delka;
    }

    public String toString() {
        return "Spotify podcast  '" + nazev + "' od autora " + moderator;
    }


}
