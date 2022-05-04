package zadanienr1;

import java.util.Scanner;

public class Zadanienr1 {

    public static void main(String[] args) 
    {
        System.out.println("Program obliczający: sumę dochodów, dochód średni, minimalny i maksymalny w ciągu roku.\n");
        
        Scanner sc = new Scanner(System.in);
        
        double min = 999999999;
        double max = 0;        
        double suma = 0;
        double srednia = 0;
        double tymczas;

        for(int i=1; i<=12; i++)
        {
            System.out.println("Miesiąć nr. " + i);
            tymczas = sc.nextDouble();
            
            if(tymczas < min) {min = tymczas;}
            
            
            if(tymczas > max) {max = tymczas;}
            
            suma = suma + tymczas;
            
            srednia = suma/12;
        }
                System.out.println("\nSuma dochodów przez cały rok wynosi: " + suma + " zł.");
                System.out.println("Średni dochód przez cały rok wynosi: " + srednia + " zł.");
                System.out.println("Najwiekszy dochód wynosi " + max + " zł.");
                System.out.println("Najmniejszy dochód wynosi " + min + " zł.");

    }
    
}
