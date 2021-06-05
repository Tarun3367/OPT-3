public class JongeGebruiker extends Gebruiker{
    public JongeGebruiker(String naam, Integer leeftijd) {
        super(naam, leeftijd);
    }

    @Override
    public boolean vraagBaard() {
        return false;
    }
}
