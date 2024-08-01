class Mug{
String type;
String brand;
double price;
String color="red";

public Mug(String typeLocal,double priceLocal )

{ 
type=typeLocal;
price=priceLocal;
System.out.println("Created mug");
}
public static void main(String[] args){
Mug mug= new Mug("ceramics",60);
watch.brand="Fastrack";
System.out.println("Type="+mug.type);
System.out.println("Brand="+mug.brand);
System.out.println("Price="+mug.price);
System.out.println("color="+mug.color);
Mug mug1= new Mug("plastic",`100);
mug1.brand="Firebollt";
mug1.color="Silver";
System.out.println("Type="+mug1.type);
System.out.println("Brand="+mug1.brand);
System.out.println("Price="+mug1.price);
System.out.println("color="+mug1.color);

}
}