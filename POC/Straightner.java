class Straightner{
String type;
String brand;
double price;
String color="black";

public Watch(String typeLocal,double priceLocal )

{ 
type=typeLocal;
price=priceLocal;
System.out.println("Created Straightner");
}
public static void main(String[] args){
Straightner straightner= new Straightner("curl",7000);
straightner.brand="vega";
System.out.println("Type="+straightner.type);
System.out.println("Brand="+straightner.brand);
System.out.println("Price="+straightner.price);
System.out.println("color="+straightner.color);
Straightner straightner= new Straightner("crimp",2000);
straightner1.brand="philiphs";
straightner1.color="blue";
System.out.println("Type="+straightner1.type);
System.out.println("Brand="+straightner1.brand);
System.out.println("Price="+straightner1.price);
System.out.println("color="+straightner1.color);

}
}