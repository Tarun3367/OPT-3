import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kapper kapper=Kapper.getInstance();
        Scanner scanner=new Scanner(System.in);
        System.out.println("wat is uw naam?");
        String naam= scanner.nextLine();
        System.out.println("hoe oud bent u?");
        int leeftijd=scanner.nextInt();

        Gebruiker gebruiker;
        if(leeftijd<=10){gebruiker=new JongeGebruiker(naam, leeftijd);}
        else{gebruiker=new OudeGebruiker(naam, leeftijd);}

        if(kapper.checkOfAfspraakGemaaktKanWorden(new Afspraak(gebruiker, gebruiker.vraagBaard(), gebruiker.vraagHaarWassen(), gebruiker.vraagKortingscode(), gebruiker.vraagTijd()))){
            System.out.printf("Uw afspraak is gemaakt! \nde prijs is %.2f\n", kapper.getAfspraak(gebruiker).getPrijs());
        }
    }
}
