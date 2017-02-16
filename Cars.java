import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Cars
{
	
	public static int numberofcars(String file)
	{
	int numbveh=0;
	try
	{
		File vehFile=new File(file);
		Scanner scan=new Scanner(vehFile);
		while(scan.hasNext())
		{
			scan.nextLine();
			numbveh++;
		}
	}
	catch(IOException ioe)
	{
		System.out.println("The file cannot be read.");
	}
	return numbveh;
	}
	
	public static Vehicle[] arrayofAwards(String file)
	{
	Vehicle [] veh=new Vehicle[numberofcars(file)];
	try
	{
		File vehFile1=new File(file);
		Scanner scan1=new Scanner(vehFile1);
		for(int i=0;i<veh.length;i++)
		{
			String str=scan1.next();
			StringTokenizer str1=new StringTokenizer(str,":");
			String price=str1.nextToken();
			int rprice=Integer.parseInt(price);
			String type=str1.nextToken();
			String drive=str1.nextToken();
			veh[i]=new Vehicle(rprice,type,drive);
		}
	}
	catch(IOException ioe){
		System.out.println("The file cannot be read.");
	}
	return veh;
	}
}