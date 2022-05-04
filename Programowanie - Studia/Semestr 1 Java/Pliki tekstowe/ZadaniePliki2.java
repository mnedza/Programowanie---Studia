package zadaniepliki2;

import java.io.*;
import java.util.Scanner;

public class ZadaniePliki2
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File plik = new File ("plik.txt");
        File domy = new File ("domy.txt");
        PrintWriter pw1 = new PrintWriter(domy);
        Scanner sc = new Scanner(plik);
        String linia;
        int i = 0;
        double cena;
        String [] slowa = new String [4];
        do
        {
            linia = sc.nextLine();
            slowa = linia.split("-");
            if (slowa[3].equals("Wies"))
            {
                if(slowa[2].equals("1"))
                {
                    pw1.print(slowa[0]+"-");
                    cena = Double.parseDouble(slowa[1])*0.9;
                    pw1.print(cena+"-");
                    pw1.print(slowa[2]+"-");
                    pw1.println(slowa[3]);
                }
                else{}
            }
            else{}
        }
        while (sc.hasNextLine());
        pw1.close(); 
    }
}