interface shape
{
double pi=3.14;
double area();
default int getsides()
{
System.out.println("i dont have any sides");
return 0;
}
}
class rectangle implements shape
{
double l,w;
rectangle (double l,double w){
this.l=l;
this.w=w;
}
public double area()
{
return l*w;
}
public int getsides(){
return 2;
}
}
class circle implements shape
{
double r;
circle (double r)
{
this.r=r;
}
public double area()
{
return pi*r*r;
}
}
public class interface1{
public static void main(String[]args)
{
rectangle r = new rectangle (10,20);
System.out.println(r.area());
System.out.println(r.getsides());
circle c = new circle (5);
System.out.println(c.area());
c.getsides();
shape s = c;
System.out.println(s.area());
s.getsides();
}
}

