class Harmonica{
String material;
String brand;
double price;
String color="White";

publicHarmonica(String materialLocal,double materialLocal )

{ 
material=materialLocal;
price=priceLocal;
System.out.println("Created Harmonica");
}
public static void main(String[] args){
Harmonica harmonica= new Harmonica("metal",6000);
watch.brand="seydel";
System.out.println("material="+ harmonica.material);
System.out.println("Brand="+ harmonica.brand);
System.out.println("Price="+ harmonica.price);
System.out.println("Color="+ harmonica.color);
Harmonica harmonica1= new Harmonica("plastic",6000);
harmonica1.brand="Tombo";
harmonica1.color="Black";
System.out.println("material="+harmonica1.material);
System.out.println("Brand="+harmonica1.brand);
System.out.println("Price="+harmonica1.price);
System.out.println("Color="+harmonica1.color);

}
}