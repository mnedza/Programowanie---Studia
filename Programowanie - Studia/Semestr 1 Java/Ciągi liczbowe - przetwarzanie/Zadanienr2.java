package zadanienr2;

import java.util.Scanner;

public class Zadanienr2 {

    public static void main(String[] args)
    {
        System.out.println("Program obliczający średnią ocenę zawodników.\nSędziowie dają oceny od 0 do 10.\n");
        
        Scanner sc = new Scanner(System.in);
        
        double min = 11;
        double max = -1;        
        double suma = 0;
        double srednia = 0;
        int n = 0; // liczba sędziów
        double ocena_sedziego;
        int kontynuacja =1 ;
        
        do
        {
            for(int i=1; i<=100; i++)
            {
            System.out.println("Ocena zawodnika nr. " + i);
                for(int j = 1; j<=10; j++)
                {
                    n++; // dodajemy sędziego (tak będziemy dodawać aż do 10 wraz z krokiem pętli j)
                    System.out.println("Sędzia nr. " + j);
                    ocena_sedziego = sc.nextInt();
                    if(ocena_sedziego < 0 || ocena_sedziego > 10)
                    {   
                        System.out.println("Niepoprawny zakres oceny. Nie biorę tego sędziego pod uwagę licząc średnią zawodnika");
                        n--;    // Tutaj odejmujemy sędziego bo jego ocena nie spełnia wymogów
                        continue;
                    }
                
                    if(ocena_sedziego < min) {min = ocena_sedziego;}
            
                    if(ocena_sedziego > max) {max = ocena_sedziego;}
                
                    suma = suma + ocena_sedziego;
                    srednia = (suma - min - max) / (n - 2); 
                }
                System.out.println("Zawodnik nr." + i + " dostał średnią ocenę " + srednia);
                System.out.println("\nCzy powtórzyć obliczenia dla nowego zawodnika?\n1) Proszę wpisać 1 aby kontynuować\n2) Proszę wpisać inną cyfrę lub liczbę aby zakończyć.");
                n = 0; // ustawiam sędziów na zero 
                min = 11;
                max = -1;        
                suma = 0;
                srednia = 0;
                kontynuacja = sc.nextInt();
                if(kontynuacja!=1) {break;}
            }
        }
        while(kontynuacja==1);
            
            System.out.println("Program wyłączył się.");
      
        
    }
    
}
