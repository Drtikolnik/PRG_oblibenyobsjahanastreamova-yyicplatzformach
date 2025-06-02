import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");





        ArrayList<YoutubeVideo> youtube = new ArrayList<>();
        ArrayList<SpotifyPodcast> spotify = new ArrayList<>();

        for (boolean behZapisu = true; behZapisu == true; ) {

            System.out.println("CO CHCEŠ ZADAT?");
            System.out.println("1 - PŘIDAT OBSAH");
            System.out.println("2 - VYPSAT VŠECHNY YOUTUBE VIDEA");
            System.out.println("3 - VYPSAT DÉLKU NEJKRATŠÍHO OBSAHU");
            System.out.println("4 - KONEC PROGRAMU");

            int vyber = sc.nextInt();
            sc.nextLine();
            switch (vyber) {

                case 1:
                    System.out.println("CO CHCEŠ ZADAT?");
                    System.out.println("1 - YOUTUBE VIDEO");
                    System.out.println("2 - SPOTIFY PODCAST");

                    int vyberObsah = sc.nextInt();
                    sc.nextLine();
                    switch (vyberObsah) {
                        case 1:
                            youtube.add(new YoutubeVideo());
                            break;



                        case 2:
                            spotify.add(new SpotifyPodcast());
                            break;
                    }





                case 2:
                    //VŠECHNY YOUTUBE VIDEA
                    System.out.println("Výpis všech youtube videí:");
                    for (YoutubeVideo video : youtube) {
                        System.out.println(video.toString());
                    }
                    break;

                case 3:
                    //NEJKRATRŠÍ OBSAH
                    YoutubeVideo nejkratsiy = null;
                    for (YoutubeVideo y : youtube) {
                        if (nejkratsiy == null || y.getDelka() < nejkratsiy.getDelka()) {
                            nejkratsiy = y;
                        }
                    }

                    SpotifyPodcast nejkratsis = null;
                    for (SpotifyPodcast s : spotify) {
                        if (nejkratsis == null || s.getDelka() < nejkratsis.getDelka()) {
                            nejkratsis = s;
                        }
                    }

                    if (nejkratsiy == null) {
                        System.out.println("Žádný obsah není nahrán");
                    }else if (nejkratsis.getDelka() < nejkratsiy.getDelka()) {
                        System.out.println("Nejkratší obsah je: " + nejkratsis.toString() + " s délkou " + nejkratsis.getDelka());
                    }else{
                        System.out.println("Nejkratší obsah je: " + nejkratsiy.toString() + " s délkou " + nejkratsiy.getDelka());
                    }

                    break;

                case 4:
                    behZapisu = false;
                    break;


            }




        }


























    }








}




