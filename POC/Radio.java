class Radio{
String type;
String function;
double price;
String color="Gold";

public Radio(String typeLocal,double priceLocal )

{ 
type=typeLocal;
price=priceLocal;
System.out.println("Created Radio");
}
public static void main(String[] args){
Radio radio= new Radio("Analog",6000);
radio.function="pause";
System.out.println("Type="+radio.type);
System.out.println("Brand="+radio.function);
System.out.println("Price="+radio.price);
System.out.println("StrapeColor="+radio.color);
Radio radio1= new Radio("digital",6000);
watch1.function="play";
watch.color="Silver";
System.out.println("Type="+radio1.type);
System.out.println("Brand="+radio1.function);
System.out.println("Price="+radio1.price);
System.out.println("StrapeColor="+radio1.strapeColor);
}
}