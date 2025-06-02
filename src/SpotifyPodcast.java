import java.util.Scanner;

public class SpotifyPodcast implements IObsah{
    static Scanner sc = new Scanner(System.in);

    private String nazev;
    private int delka;
    private String moderator;
    public SpotifyPodcast() {
        System.out.println("Jaký je název?");
        nazev = sc.nextLine();
        this.nazev = nazev;

        System.out.println("Jaká je délka? (v minutách)");
        delka = sc.nextInt();
        sc.nextLine();
        this.delka = delka;

        System.out.println("Jaké je jméno moderátora?");
        moderator = sc.nextLine();
        this.moderator = moderator;
    }

    public int getDelka() {
        return delka;
    }

    public String toString() {
        return "Spotify podcast  '" + nazev + "' od autora " + moderator;
    }


}
