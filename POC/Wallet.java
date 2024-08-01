class Wallet{
	String type="travel wallet";
	double price=1000;
	String colour="brown";
	String quality="Good";
public Wallet()
{
	System.out.println("created Wallet");
	System.out.println("--------------------------------------");
}
public static void main(String[] args)
{
Wallet wallet=new Wallet();
System.out.println(" wallet TYpe"+wallet.type);
System.out.println("wallet name"+wallet.price);
System.out.println(" wallet colour"+wallet.colour);
System.out.println("wallet quantity"+wallet.quality);
wallet.type="intravenous";
wallet.price=100;
wallet.colour="red";
wallet.quality="Wood";
System.out.println(" wallet TYpe"+wallet.type);
System.out.println("wallet name"+wallet.name);
System.out.println(" wallet colour"+wallet.colour);
System.out.println("wallet quantity"+wallet.quality);
Wallet wallet1=new Wallet();
System.out.println(" wallet TYpe"+wallet1.type);
System.out.println("wallet name"+wallet1.price);
System.out.println(" wallet colour"+wallet1.colour);
System.out.println("wallet quantity"+wallet1.quality);
wallet1.type="intravenous";
wallet1.price=100;
wallet1.colour="red";
wallet1.quality="Wood";
System.out.println(" wallet TYpe"+wallet1.type);
System.out.println("wallet name"+wallet1.price);
System.out.println(" wallet colour"+wallet1.colour);
System.out.println("wallet quantity"+wallet1.quality);
Wallet wallet2=new Wallet();
System.out.println(" wallet TYpe"+wallet2.type);
System.out.println("wallet name"+wallet2.price);
System.out.println(" wallet colour"+wallet2.colour);
System.out.println("wallet quantity"+wallet2.quality);
wallet2.type="intravenous";
wallet2.price=100;
wallet2.colour="red";
wallet2.quality="Wood";
System.out.println(" wallet TYpe"+wallet2.type);
System.out.println("wallet name"+wallet2.price);
System.out.println(" wallet colour"+wallet2.colour);
System.out.println("wallet quantity"+wallet2.quality);
}}