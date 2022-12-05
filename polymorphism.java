abstract class shape
{
    void numberofsides()
    {

    }
}
class rectangle extends shape
{
    void numberofsides()
    {
        System.out.println("Rectangle:4 sides");
    }
}
class triangle extends shape
{
    void numberofsides()
    {
        System.out.println("Triangle:3 sides");
    }
}
class  hexagon extends shape
{
    void numberofsides()
    {
        System.out.println("Hexagon:6 sides");
    }
}
public class polymorphism
{
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        r.numberofsides();
        triangle t=new triangle();
        t.numberofsides();
        hexagon h=new hexagon();
        h.numberofsides();
    }
}

