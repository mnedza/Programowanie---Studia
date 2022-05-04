package zadaniepliki1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class ZadaniePliki1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Random rand = new Random();
        File plik = new File ("Liczby.txt");
        int liczba;
        int srednia = 0;
        int suma = 0;
        PrintWriter pw1 = new PrintWriter(plik);
        for (int i=0; i<1000; i++)
        {
            liczba = rand.nextInt(100000)+1;
            pw1.println(liczba);
            suma += liczba;
        }
        
        srednia = suma/1000;
        System.out.println("Średnia wynosi: " + srednia);
        pw1.close();       
       
        File plik2 = new File ("Mniejsze.txt");
        File plik3 = new File ("Wieksze.txt");
        PrintWriter pw2 = new PrintWriter(plik2);
        PrintWriter pw3 = new PrintWriter(plik3);
        Scanner sc = new Scanner(plik);
        do
        {
            String Linia;
            Linia = sc.nextLine();
            liczba = (int)Integer.valueOf(Linia);
            
            if (liczba<srednia)
                pw2.println(liczba);
            else
                pw3.println(liczba);
            System.out.println(liczba);
        } 
        while ( sc.hasNextLine() );
        
        pw2.close();
        pw3.close();
    }
}
