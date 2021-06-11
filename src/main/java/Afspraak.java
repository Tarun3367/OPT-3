import java.util.Scanner;

public class Afspraak {
    public Scanner scanner=new Scanner(System.in);
    private Gebruiker gebruiker;
    private boolean baard;
    private boolean haarWassen;
    private boolean kortingscode;
    private double prijs;
    private Integer startUur;
    public Afspraak(Gebruiker gebruiker){
        this.gebruiker=gebruiker;
        this.baard=vraagBaard();
        this.haarWassen=vraagHaarWassen();
        this.kortingscode=vraagKortingscode();
        this.prijs=getPrijs();
        this.startUur=vraagTijd();
    }

    public Integer getStartUur() {
        return startUur;
    }

    public Gebruiker getGebruiker(){
        return gebruiker;
    }

    public double getPrijs() {
        prijs=0;

        if(gebruiker.getLeeftijd()<10){prijs=10;}
        else if(gebruiker.getLeeftijd()<18){prijs=15;}
        else{prijs=17.50;}

        if(baard){prijs+=2.50;}
        if(haarWassen){prijs+=2.50;}
        if (kortingscode){prijs*=0.9;}
        prijs-=gebruiker.getExtraKortingInEuro();

        return prijs;
    }

    public boolean vraagBaard() {
        System.out.println("wilt u uw baard laten doen?");
        if(scanner.nextLine().equals("ja")){
            return true;
        }
        return false;
    }

    public boolean vraagHaarWassen(){
        System.out.println("wilt u uw haar laten wassen?");
        if(scanner.nextLine().equals("ja")){
            return true;
        }
        return false;
    }
    public boolean vraagKortingscode(){
        System.out.println("heeft u een kortingscode?");
        if(scanner.nextLine().equals("ja")){
            return true;
        }
        return false;
    }

    public Integer vraagTijd(){
        System.out.println("voor welk uur wilt u uw afspraak maken?");
        return scanner.nextInt();
    }
}
