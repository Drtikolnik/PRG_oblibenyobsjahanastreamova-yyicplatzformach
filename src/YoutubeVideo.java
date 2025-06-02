public class YoutubeVideo {

    private String nazev;
    private int delka;
    private String jmenoAutora;
    public YoutubeVideo(String nazev, int delka, String jmenoAutora) {
        this.nazev = nazev;
        this.delka = delka;
        this.jmenoAutora = jmenoAutora;
    }

    public int getDelka() {
        return delka;
    }

    public String toString() {
        return "YouTube video  '" + nazev + "' od autora " + jmenoAutora;
    }
}
