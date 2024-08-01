class Injection{
	String type;
	String name;
	String colour;
	String quantity;
public Injection()
{
	System.out.println("created Injection");
	System.out.println("--------------------------------------");
}
public static void main(String[] args)
{
Injection injection=new Injection();
injection.type="intravenous";
injection.name="antiallergic";
injection.colour="red";
injection.quantity="Wood";
System.out.println(" Injection TYpe"+injection.type);
System.out.println(" Injection name"+injection.name);
System.out.println(" Injection colour"+injection.colour);
System.out.println(" Injection quantity"+injection.quantity);
Injection injection1=new Injection();
injection1.type="intravenous";
injection1.name="antibotic";
injection1.colour="yellow";
injection1.quantity="Wood";
System.out.println(" Injection TYpe"+injection1.type);
System.out.println(" Injection name"+injection1.name);
System.out.println(" Injection colour"+injection1.colour);
System.out.println(" Injection quantity"+injection1.quantity);
Injection injection2=new Injection();
injection2.type="intramuscular";
injection2.name="high";
injection2.colour="loud";
injection2.quantity="10ml";
System.out.println(" Injection TYpe"+injection2.type);
System.out.println(" Injection name"+injection2.name);
System.out.println(" Injection colour"+injection2.colour);
System.out.println(" Injection quantity"+injection2.quantity);
Injection injection3=new Injection();
injection3.type="subcutaneous";
injection3.name="gastritis";
injection3.colour="yellow";
injection3.quantity="10ml";
System.out.println(" Injection TYpe"+injection3.type);
System.out.println(" Injection name"+injection3.name);
System.out.println(" Injection colour"+injection3.colour);
System.out.println(" Injection quantity"+injection3.quantity);
Injection injection4=new Injection();
injection4.type="intradermal";
injection4.name="gastritis";
injection4.colour="white";
injection4.quantity="40ml";
System.out.println(" Injection TYpe"+injection4.type);
System.out.println(" Injection name"+injection4.name);
System.out.println(" Injection colour"+injection4.colour);
System.out.println(" Injection quantity"+injection4.quantity);
Injection injection5=new Injection();
injection5.type="intraosseous";
injection5.name="antibiotic ";
injection5.colour="red";
injection5.quantity="10ml";
System.out.println(" Injection TYpe"+injection5.type);
System.out.println(" Injection name"+injection5.name);
System.out.println(" Injection colour"+injection5.colour);
System.out.println(" Injection quantity"+injection5.quantity);
Injection injection6=new Injection();
injection6.type="intramuscular";
injection6.name="antispasmotic";
injection6.colour="blue";
injection6.quantity="10ml";
System.out.println(" Injection TYpe"+injection6.type);
System.out.println(" Injection name"+injection6.name);
System.out.println(" Injection colour"+injection6.colour);
System.out.println(" Injection quantity"+injection6.quantity);
}}