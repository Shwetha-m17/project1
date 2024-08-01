class Trumpet{
String type;
String brand;
double price;
String material="Gold";

public Trumpet(String typeLocal,double priceLocal )

{ 
type=typeLocal;
price=priceLocal;
System.out.println("Created watch");
}
public static void main(String[] args){
Trumpet trumpet= new Trumpet("pocket trumpet",8000);
trumplet.brand="GetZen";
System.out.println("Type="+trumpet.type);
System.out.println("Brand="+trumpet.brand);
System.out.println("Price="+trumpet.price);
System.out.println("material="+trumpet.material);
Trumpet trumpet1= new Trumpet("piccolo trumpet",600);
trumpet1.brand="Bach";
trumpet1.material="Silver";
System.out.println("Type="+trumpet1.type);
System.out.println("Brand="+trumpet1.brand);
System.out.println("Price="+trumpet1.price);
System.out.println("material="+trumpet1.material);

}
}