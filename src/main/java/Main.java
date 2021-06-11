import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kapper kapper=Kapper.getInstance();
        Scanner scanner=new Scanner(System.in);
        System.out.println("bent u een medewerker van de kapperszaak?");
        Gebruiker gebruiker;
        if(scanner.nextLine().equals("ja")){ gebruiker=new Medewerker();}
        else{gebruiker=new Klant();}

        while (true) {
            if (kapper.checkOfAfspraakGemaaktKanWorden(new Afspraak(gebruiker))) {
                System.out.printf("Uw afspraak is gemaakt! \nde prijs is %.2f\n", kapper.getAfspraak(gebruiker).getPrijs());
            }else{
                System.out.println("het is niet mogelijk om een afspraak te maken op het gekozen moment.");
            }
            System.out.println("Wilt u een andere afspraak maken?");
            if(!scanner.nextLine().equals("ja")){break;}
        }
    }
}
