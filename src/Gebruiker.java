import java.util.Scanner;

public abstract class Gebruiker {
    public  Scanner scanner=new Scanner(System.in);
    private String naam;
    private Integer leeftijd;
    public Gebruiker(String naam, Integer leeftijd){
        this.naam=naam;
        this.leeftijd=leeftijd;
    }
    public abstract boolean vraagBaard();
    public boolean vraagHaarWassen(){
        System.out.println("wilt u uw haar laten wassen?");
        if(scanner.nextLine().equals("ja")){
            return true;
        }
        else{return false;}
    }
    public boolean vraagKortingscode(){
        System.out.println("heeft u een kortingscode?");
        if(scanner.nextLine().equals("ja")){
            return true;
        }
        else{return false;}
    }

    public Integer vraagTijd(){
        System.out.println("voor welk uur wilt u uw afspraak maken?");
        return scanner.nextInt();
    }

    public Integer getLeeftijd(){return leeftijd;}
    public String getNaam(){return naam;}
    
}
