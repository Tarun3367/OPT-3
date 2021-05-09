public class Kapper {
    public boolean checkOfAfspraakGemaaktKanWorden(boolean nietGesloten, boolean voldoendePlek, boolean geenPauze){
        return nietGesloten&&voldoendePlek&&geenPauze;
    }
    public double berekenPrijs(Integer leeftijd){
        if(leeftijd<10){return 10;}
        if(leeftijd<18){return 15;}
        return 17.50;
    }

}
