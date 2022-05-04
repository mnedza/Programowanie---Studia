package zadanie.pkg4;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {


    public static void main(String[] args) 
    {
        
        int liczba, wynik;
        
        Random Losowanie = new Random();
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Aplikacja: Zgadnij liczbę!\n");
        int kontynuacja = 1;
        do
        {
            System.out.println("Zgadnij jaką liczbę wymyśliłem od 1 do 100 i spróbuj ją trafić\nZobaczymy ile potrzebujesz podejść aby zgadnąć tę liczbę.\n\n");
            liczba = sc.nextInt();
            wynik = Losowanie.nextInt(100) + 1;
            for(int i=1; i<=100; i++)
            {
            
                if(liczba==wynik)
                {
                    System.out.println("Gratulacje trafiłeś za " + i + " razem, ta liczba to " + wynik + "\n");
                    break;
                }
                else if(liczba < wynik)
                {
                    System.out.println("Próba nr. " + i + "\n");
                    System.out.println("Niestety twoja liczba jest za mała. Spróbuj jescze raz.\nPodaj liczbê:\n");
                    liczba = sc.nextInt();
                }
                else if(liczba > wynik)
                {
                    System.out.println("Próba nr. " + i + "\n");
                    System.out.println("Niestety twoja liczba jest za duża. Spróbuj jescze raz.\nPodaj liczbê:\n");
                    liczba = sc.nextInt();
                }
            }
            System.out.println("Czy chcesz powtórzyć działanie programu?\nWybierz:\n1)Tak\n2)Nie");
            kontynuacja = sc.nextInt();
        }while(kontynuacja==1);
    }
    
}
