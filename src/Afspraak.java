public class Afspraak {
    private Gebruiker gebruiker;
    private boolean baard;
    private boolean haarWassen;
    private boolean kortingscode;
    private double prijs;
    private Integer startUur;
    public Afspraak(Gebruiker gebruiker, boolean baard, boolean haarWassen, boolean kortingscode, Integer startUur){
        this.gebruiker=gebruiker;
        this.baard=baard;
        this.haarWassen=haarWassen;
        this.kortingscode=kortingscode;
        this.prijs=berekenPrijs();
        this.startUur=startUur;
    }

    private double berekenPrijs(){
        double prijs=0;

        if(gebruiker.getLeeftijd()<10){prijs=10;}
        else if(gebruiker.getLeeftijd()<18){prijs=15;}
        else{prijs=17.50;}

        if(baard){prijs+=2.50;}
        if(haarWassen){prijs+=2.50;}
        if (kortingscode){prijs*=0.9;}

        return prijs;
    }

    public Integer getStartUur() {
        return startUur;
    }

    public Gebruiker getGebruiker(){
        return gebruiker;
    }

    public double getPrijs() {
        return prijs;
    }
}
