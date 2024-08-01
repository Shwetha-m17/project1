class Anklets{
String type;
String brand;
double price;
String strapeColor="Gold";

public Anklets(String typeLocal,double priceLocal )

{ 
type=typeLocal;
price=priceLocal;
System.out.println("Created ANklet");
}
public static void main(String[] args){
Anklets anklets= new Anklets("String",3000);
watch.brand="dubai";
System.out.println("Type="+anklets.type);
System.out.println("Brand="+anklets.brand);
System.out.println("Price="+anklets.price);
System.out.println("StrapeColor="+anklets.strapeColor);
Anklets anklets1= new Anklets("beaded",6000);
anklets1.brand="yd brands ";
anklets1.strapeColor="Silver";
System.out.println("Type="+anklets1.type);
System.out.println("Brand="+anklets1.brand);
System.out.println("Price="+anklets1.price);
System.out.println("StrapeColor="+anklets1.strapeColor);

}
}