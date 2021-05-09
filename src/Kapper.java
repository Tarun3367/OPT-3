public class Kapper {
    public boolean checkOfAfspraakGemaaktKanWorden(boolean nietGesloten, boolean voldoendePlek, boolean geenPauze){
        return nietGesloten&&voldoendePlek&&geenPauze;
    }
    public double berekenPrijs(Integer leeftijd, boolean baard, boolean haarWassen, boolean kortingcode){
        double prijs=0;

        if(leeftijd<10){prijs=10;}
        else if(leeftijd<18){prijs=15;}
        else{prijs=17.50;}

        if(baard){prijs+=2.50;}
        if(haarWassen){prijs+=2.50;}
        if (kortingcode){prijs*=0.9;}

        return prijs;
    }

}
