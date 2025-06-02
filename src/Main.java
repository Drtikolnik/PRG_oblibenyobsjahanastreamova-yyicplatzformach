import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");





        ArrayList<YoutubeVideo> youtube = new ArrayList<>();
        ArrayList<SpotifyPodcast> spotify = new ArrayList<>();

        for (boolean behZapisu = true; behZapisu == true; ) {

            System.out.println("ZADEJ CO CHCEŠ");
            System.out.println("1 - PŘIDAT OBSAH");
            System.out.println("2 - VYPSAT VŠECHNY YOUTUBE VIDEA");
            System.out.println("3 - VYPSAT DÉLKU NEJKRATŠÍHO OBSAHU");
            System.out.println("4 - KONEC PROGRAMU");

            int vyber = sc.nextInt();
            sc.nextLine();
            switch (vyber) {

                case 1:





                case 2:
                    //VŠECHNY YOUTUBE VIDEA
                    for (YoutubeVideo video : youtube) {
                        video.toString();
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
                        System.out.println("Nejkratší obsah je: " + nejkratsis.toString());
                    }else{
                        System.out.println("Nejkratší obsah je: " + nejkratsiy.toString());
                    }

                    break;

                case 4:
                    behZapisu = false;
                    break;


            }




        }


























    }








}




