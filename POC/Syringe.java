class Syringe{
double volume;
String name;
double price;
String color="white";

public Syringe(double volumeLocal,double priceLocal )

{ 
volume=volumeLocal;
price=priceLocal;
System.out.println("Created watch");
}
public static void main(String[] args){
Syringe syringe= new Syringe(2.5,6000);
Syringe.name="Novopen";
System.out.println("volume="+syringe.volume);
System.out.println("name="+syringe.name);
System.out.println("Price="+syringe.price);
System.out.println("color="+watch.color);
Syringe syringe1= new Syringe(1.5,50);
syringe1.name="Microjet";
syringe1.color="yellow";
System.out.println("volume="+syringe1.volume);
System.out.println("name="+syringe1.name);
System.out.println("Price="+syringe1.price);
System.out.println("color="+syringe1.color);

}
}