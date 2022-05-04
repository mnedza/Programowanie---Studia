package zadanienr3;

import java.util.Random;
import java.util.Scanner;

public class Zadanienr3 {

    public static void main(String[] args) 
    {
        
        System.out.println("Program obliczający najlepszy, najgorszy i średni czas sprintera");
        
        Random maszynaLosujaca = new Random();
        int tajemnica;
        tajemnica = maszynaLosujaca.nextInt(10)+11;
        
        Scanner sc = new Scanner(System.in);
        
        double najlepszy = 999999999;
        double najgorszy = 0;        
        double suma = 0;
        double srednia = 0;
        double czas;
        
                System.out.println("Podaj czasy sprintera: ");
                
        for(int i=1; i<=tajemnica; i++)
        {     
                czas = sc.nextDouble();
                System.out.println("Czas nr. " + i + " to " + czas + " min.");
             
                if(czas < najlepszy) {najlepszy = czas;}
            
                if(czas > najgorszy) {najgorszy = czas;}
            
                suma = suma + czas;
                srednia = suma/tajemnica;
        }

                System.out.println("Średni czas sprintera to: " + srednia + " min.");
                System.out.println("Najgorszy czas sprintera wynosi " + najgorszy + " min.");
                System.out.println("Najlepszy czas sptrintera wynosi " + najlepszy + " min.");
 
    }
    
}
