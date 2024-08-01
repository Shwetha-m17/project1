class Pendulum{
String bobSize;
double length;
double price;
String color="Grey";

public Pendulum(String bobSizeLocal,double priceLocal )

{ 
bobSize=bobSizeLocal;
price=priceLocal;
System.out.println("Created watch");
}
public static void main(String[] args){
Pendulum pendulum= new Pendulum("Small",6000);
pendulum.length=90;
System.out.println("bobSize="+pendulum.bobSize);
System.out.println("Brand="+pendulum.length);
System.out.println("Price="+pendulum.price);
System.out.println("color="+pendulum.color);
Pendulum pendulum1= new Pendulum("medium",6000);
pendulum1.length=70;
pendulum1.color="Silver";
System.out.println("bobSize="+pendulum1.bobSize);
System.out.println("length="+pendulum1.length);
System.out.println("Price="+pendulum1.price);
System.out.println("color="+pendulum1.color);

}
}