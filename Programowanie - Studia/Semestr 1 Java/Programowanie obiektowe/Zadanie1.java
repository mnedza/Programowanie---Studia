package zadanie1;

public class Zadanie1
{
    public static void main(String[] args)
    {
        
    }
}

class Samochod
{
    public Samochod()
    {
        vMax = 140;
        paliwoWZbiorniku = 50;
        zuzycieNa100km = 10;
    }
    
    public Samochod(int vMax, double paliwoWZbiorniku, double zuzycieNa100km)
    {
        this.vMax = vMax;
        this.paliwoWZbiorniku = paliwoWZbiorniku;
        this.zuzycieNa100km = zuzycieNa100km;
    }
    
    public double zasieg()
    {
        return paliwoWZbiorniku/(zuzycieNa100km/100);
    }
    
    public double czasDojazdu(double dystans)
    {
        return (3/4 * vMax) / dystans;
    }
    
    public void zatankuj(double ilePaliwaZatankowano)
    {
        paliwoWZbiorniku = paliwoWZbiorniku + ilePaliwaZatankowano;
        System.out.println(paliwoWZbiorniku);
    }
    
    public void trasa(double liczbaKilometrow)
    {
        paliwoWZbiorniku = paliwoWZbiorniku - (liczbaKilometrow/(zuzycieNa100km/100));
        System.out.println(paliwoWZbiorniku); 
    }
    
    private int vMax;
    private double paliwoWZbiorniku;
    private double zuzycieNa100km; 
}
