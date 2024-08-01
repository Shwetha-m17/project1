class Mirror{
	String type="concave mirrors";
	String price="400rupee";
	String colour="COPPER MIRROR";
	String quality="high";
public Mirror()
{
	System.out.println("created Mirror");
	System.out.println("--------------------------------------");
}
public static void main(String[] args)
{
Mirror mirror=new Mirror();
System.out.println(" mirror TYpe"+mirror.type);
System.out.println("mirror name"+mirror.price);
System.out.println(" mirror colour"+mirror.colour);
System.out.println("mirror quantity"+mirror.quality);
mirror.type="intravenous";
mirror.price="antiallergic";
mirror.colour="red";
mirror.quality="Wood";
System.out.println(" mirror TYpe"+mirror.type);
System.out.println("mirror name"+mirror.price);
System.out.println(" mirror colour"+mirror.colour);
System.out.println("mirror quantity"+mirror.quality);

Mirror mirror1=new Mirror();
System.out.println(" mirror TYpe"+mirror1.type);
System.out.println("mirror name"+mirror1.price);
System.out.println(" mirror colour"+mirror1.colour);
System.out.println("mirror quantity"+mirror1.quality);
mirror1.type="intravenous";
mirror1.price="antiallergic";
mirror1.colour="red";
mirror1.quality="Wood";
System.out.println(" mirror TYpe"+mirror1.type);
System.out.println("mirror name"+mirror1.price);
System.out.println(" mirror colour"+mirror1.colour);
System.out.println("mirror quantity"+mirror1.quality);
Mirror mirror2=new Mirror();
System.out.println(" mirror TYpe"+mirror2.type);
System.out.println("mirror name"+mirror2.price);
System.out.println(" mirror colour"+mirror2.colour);
System.out.println("mirror quantity"+mirror2.quality);
mirror2.type="intravenous";
mirror2.price="antiallergic";
mirror2.colour="red";
mirror2.quality="Wood";
System.out.println(" mirror TYpe"+mirror2.type);
System.out.println("mirror name"+mirror2.price);
System.out.println(" mirror colour"+mirror2.colour);
System.out.println("mirror quantity"+mirror2.quality);
}
}
