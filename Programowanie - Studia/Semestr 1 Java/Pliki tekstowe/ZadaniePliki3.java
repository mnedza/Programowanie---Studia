package zadaniepliki3;

import java.io.*;
import java.util.Scanner;

public class ZadaniePliki3
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File plik = new File("plik.txt");
        Scanner sc = new Scanner(plik);
        String linia;
        int l, slowa = 0,kropka=0;
        do
        {
            linia = sc.nextLine();
            l = linia.split(" ").length;
            String[] tab = new String[l];
            tab = linia.split(" ");
            slowa += l;
            for (int i = 0; i < l; i++) 
            {
                if ( tab[i].contains(".") )
                {
                    kropka++;
                }
            }
        }
        while( sc.hasNextLine() );
        
        System.out.println("Ilość słów to: "+slowa);
        System.out.println("Srednia dlugość zdania wynosi: "+(slowa/kropka) + " słów");
    }
}