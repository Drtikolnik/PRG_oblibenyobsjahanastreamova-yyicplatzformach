import java.util.Scanner;

public class YoutubeVideo {
    static Scanner sc = new Scanner(System.in);

    private String nazev;
    private int delka;
    private String jmenoAutora;
    public YoutubeVideo() {
        System.out.println("Jaký je název?");
        nazev = sc.nextLine();
        this.nazev = nazev;

        System.out.println("Jaká je délka? (v minutách)");
        delka = sc.nextInt();
        sc.nextLine();
        this.delka = delka;

        System.out.println("Jaké je jméno autora?");
        jmenoAutora = sc.nextLine();
        this.jmenoAutora = jmenoAutora;
    }

    public int getDelka() {
        return delka;
    }

    public String toString() {
        return "YouTube video  '" + nazev + "' od autora " + jmenoAutora;
    }
}
