
package zadanie.pkg2;

public class Zadanie2
{
    public static void main(String[] args)
    {
        
    }
}

interface Figura
{
    public double pole();
    public double Obwod();
}

class Kwadrat implements Figura
{
    public Kwadrat()
    {
        bok = 4;
    }
    public Kwadrat(int bok)
    {
        this.bok = bok;
    }
    private int bok;
    
    @Override
    public double pole(){ return bok*bok; }
    @Override
    public double Obwod(){ return 4*bok; }
    
}

class Kolo implements Figura
{
    public Kolo()
    {
        promien = 2;
        pi = 3.14;
    }
    public Kolo(double promien, double pi)
    {
        this.promien = promien;
        this.pi = pi;
    }
    
    private double promien;
    private double pi;

    @Override
    public double pole(){ return pi*(promien*promien); }
    @Override
    public double Obwod(){ return 2 * pi * promien; }
}

class Prostokat implements Figura
{
    public Prostokat()
    {
        bok_a = 3;
        bok_b = 6;
    }
    public Prostokat(int bok_a, int bok_b)
    {
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }
    
    private int bok_a, bok_b;
    
    @Override
    public double pole(){ return (bok_a * bok_b); }
    @Override
    public double Obwod(){ return (2*bok_a + 2*bok_b); } 
}