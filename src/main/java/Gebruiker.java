import java.util.Scanner;

public abstract class Gebruiker {
    private Scanner scanner=new Scanner(System.in);
    private String naam;
    private Integer leeftijd;
    public Gebruiker(){
        vraagNaam();
        vraagLeeftijd();
    }
    public abstract double getExtraKortingInEuro();
    public void vraagNaam(){
        System.out.println("wat is uw naam?");
        this.naam= scanner.nextLine();
    }
    public void vraagLeeftijd(){
        System.out.println("hoe oud bent u?");
        this.leeftijd=scanner.nextInt();
    }
    public Integer getLeeftijd(){return leeftijd;}
    public String getNaam(){return naam;}
    
}
