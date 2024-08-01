class Mask{
String type;
String brand;
double price;
String color="white";

public Mask(String typeLocal,double priceLocal )

{ 
type=typeLocal;
price=priceLocal;
System.out.println("Created mask");
}
public static void main(String[] args){
Mask mask= new Mask("Analog",6000);
mask.brand="N95";
System.out.println("Type="+mask.type);
System.out.println("Brand="+mask.brand);
System.out.println("Price="+mask.price);
System.out.println("color="+watch.color);
Mask mask1= new Mask("Analog",6000);
mask1.brand="Fastrack";
mask1.color="blue";
System.out.println("Type="+mask1.type);
System.out.println("Brand="+mask1.brand);
System.out.println("Price="+mask1.price);
System.out.println("color="+mask1.color);

}
}