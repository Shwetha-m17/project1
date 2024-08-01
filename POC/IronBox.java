class IronBox{
	String type="STeam IronBox";
	String compname="USHA";
	String colour="blue";
	String quantity="750W";
public IronBox()
{
	System.out.println("created IronBox");
	System.out.println("--------------------------------------");
}
public static void main(String[] args)
{
IronBox ironBox=new IronBox();
System.out.println(" ironBox TYpe"+ironBox.type);
System.out.println(" ironBox name"+ironBox.compname);
System.out.println(" ironBox colour"+ironBox.colour);
System.out.println("ironBox quantity"+ironBox.quantity);
ironBox.type="intravenous";
ironBox.compname="antiallergic";
ironBox.colour="red";
ironBox.quantity="Wood";
System.out.println(" ironBox TYpe"+ironBox.type);
System.out.println(" ironBox name"+ironBox.compname);
System.out.println(" ironBox colour"+ironBox.colour);
System.out.println("ironBox quantity"+ironBox.quantity);

IronBox ironBox1=new IronBox();
System.out.println(" ironBox TYpe"+ironBox1.type);
System.out.println(" ironBox name"+ironBox1.compname);
System.out.println(" ironBox colour"+ironBox1.colour);
System.out.println("ironBox quantity"+ironBox1.quantity);
ironBox1.type="intravenous";
ironBox1.compname="antiallergic";
ironBox1.colour="red";
ironBox1.quantity="Wood";
System.out.println(" ironBox TYpe"+ironBox1.type);
System.out.println(" ironBox name"+ironBox1.compname);
System.out.println(" ironBox colour"+ironBox1.colour);
System.out.println("ironBox quantity"+ironBox1.quantity);
IronBox ironBox2=new IronBox();
System.out.println(" ironBox TYpe"+ironBox2.type);
System.out.println(" ironBox name"+ironBox2.compname);
System.out.println(" ironBox colour"+ironBox2.colour);
System.out.println("ironBox quantity"+ironBox2.quantity);
ironBox2.type="intravenous";
ironBox2.compname="antiallergic";
ironBox2.colour="red";
ironBox2.quantity="Wood";
System.out.println(" ironBox TYpe"+ironBox2.type);
System.out.println(" ironBox name"+ironBox2.compname);
System.out.println(" ironBox colour"+ironBox2.colour);
System.out.println("ironBox quantity"+ironBox2.quantity);
}
}
