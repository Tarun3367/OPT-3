import java.util.ArrayList;
import java.util.Scanner;

public class Kapper {
    private static Kapper kapper;
    private ArrayList<Afspraak> afspraken=new ArrayList<>();
    private Integer startPauzeUur=15;
    boolean gesloten=false;

    private Kapper(){}
    public boolean checkOfAfspraakGemaaktKanWorden(Afspraak afspraak){
        boolean check=checkNietGesloten()&&checkPlek(afspraak.getStartUur())&&checkGeenPauze(afspraak.getStartUur());
        if(check){afspraken.add(afspraak);}
        return check;
    }

    public Afspraak getAfspraak(Gebruiker gebruiker){
        Afspraak afspraak=null;
        for(Afspraak temp: afspraken){
            if(gebruiker.getNaam().equals(temp.getGebruiker().getNaam())){
                afspraak=temp;
            }
        }
        return afspraak;
    }

    private boolean checkPlek(Integer startUur){
        for(Afspraak temp: afspraken){
            if(temp.getStartUur()==startUur){
                return false;
            }
        }
        return true;
    }

    private boolean checkGeenPauze(Integer startUur){
        return !(startUur==startPauzeUur);
    }

    private boolean checkNietGesloten(){return !gesloten;}

    public static Kapper getInstance() {
        if(kapper==null){kapper=new Kapper();}
        return kapper;
    }
}
