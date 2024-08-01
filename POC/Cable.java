class Cable{
String type;
String brand="Finolex";
double price;
String color;

public Cable(String typeLocal,double priceLocal )

{ type=typeLocal;
price=priceLocal;
System.out.println("Created Cable");
}
public static void main(String[] args){
Cable cable= new Cable("Coaxial",600);
cable.color="Red";
System.out.println("Type"+cable.type);
System.out.println("Brand"+cable.brand);
System.out.println("Price"+cable.price);
System.out.println("Color"+cable.color);
Cable cable1= new cable("Analog",6000);
cable1.brand="Havells";
cable1.color="yellow";
System.out.println("Type"+cable1.type);
System.out.println("Brand"+cable1.brand);
System.out.println("Price"+cable1.price);
System.out.println("Color"+cable1.color);

}
}