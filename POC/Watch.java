class Watch{
String type;
String brand;
double price;
String strapeColor="Gold";

public Watch(String typeLocal,double priceLocal )

{ 
type=typeLocal;
price=priceLocal;
System.out.println("Created watch");
}
public static void main(String[] args){
Watch watch= new Watch("Analog",6000);
watch.brand="Fastrack";
System.out.println("Type="+watch.type);
System.out.println("Brand="+watch.brand);
System.out.println("Price="+watch.price);
System.out.println("StrapeColor="+watch.strapeColor);
Watch watch1= new Watch("Digital",5000);
watch1.brand="Firebollt";
watch.strapeColor="Silver";
System.out.println("Type="+watch1.type);
System.out.println("Brand="+watch1.brand);
System.out.println("Price="+watch1.price);
System.out.println("StrapeColor="+watch1.strapeColor);

}
}