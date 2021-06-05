public class OudeGebruiker extends Gebruiker{

    public OudeGebruiker(String naam, Integer leeftijd) {
        super(naam, leeftijd);
    }

    @Override
    public boolean vraagBaard() {
        System.out.println("wilt u uw baard laten doen?");
        if(scanner.nextLine().equals("ja")){
            return true;
        }
        else{return false;}
    }
}
