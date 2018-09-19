import java.security.Key;
import java.sql.SQLOutput;
import java.util.*;

public class Presentkort {

    private String Cardnr;
    private int Saldo;

    public Presentkort(String Kortnr) {

        Cardnr = Kortnr;
        Saldo = 0;

    }
    //Metod för att sätta saldo till en viss summa
    public void setSaldo(int s) {
        Saldo = s;
        System.out.println("Lägger till " + s + " till presentkortet");
    }
    //Metod för att öka saldo med en viss summa
    public void okaSaldo(int o) {
        Saldo += o;
        System.out.println("Kortet fylldes på med " + o + ". Det nya saldot är " + getSaldo() + ".");
    }
    //Metod som hanterar inkop, kollar ifall det är möjligt eller inte och returnerar boolean
    public boolean inkop(int inkopssumma) {

        if(Saldo >= inkopssumma){
            Saldo -= inkopssumma;

            return true;
        }
        else{
            return false;
        }
    }
    //Metod för att returnera nuvarande saldo
    public int getSaldo() {
        return Saldo;
    }

    //Metod för att returnera kortnummret på presentkortet
    public String getKortnummer() {
        return Cardnr;
    }

    //Metod som ändrar mall för utskriften
    public String toString(){
        return "Saldo: " + getSaldo() + " " + ", Kortnummer: " + getKortnummer();
    }

    //Metod som genomför inköpet beroende på boolean från inkop
    public void genomforInkop(Presentkort presentkort, int inkopssumma){

        if(presentkort.inkop(inkopssumma)){
            System.out.println("Inköpet för 350 kronor lyckades. Det återstående saldot på presentkortet är: " + getSaldo() + " kronor.");
        }
        else{
            System.out.println("Inköpet för 350 kronor misslyckades. Det återstående saldot på presentkortet är " + getSaldo() + " kronor, vilket är lägre än " + inkopssumma + " kronor.");
        }


    }

    //Metof som startar testprogrammet och kör igenom allting
    public void run(Presentkort presentkort){

        presentkort.setSaldo(5000);
        System.out.println(presentkort.toString());

        genomforInkop(presentkort,350);
        genomforInkop(presentkort,350);
        presentkort.okaSaldo(350);

        genomforInkop(presentkort,350);
    }

}


