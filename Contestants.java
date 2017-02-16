import java.io.File;
import java.io.IOException;
import java.util.*;
public class Contestants
{
	
public static int numberofparticipants(String file)
{
	int numbofp=0;
	try{
	File contfile=new File(file);
	Scanner scan=new Scanner(contfile);
	while(scan.hasNext())
	{
		scan.nextLine();
		numbofp++;
	}
	}
	catch(IOException ioe){
		System.out.println("The file cannot be read.");
	}
	return numbofp;
}

public static Participants[] arrayofContestants(String file)
{
	Participants [] person=new Participants[numberofparticipants(file)];
	try{
	File contfile=new File(file);
	Scanner scan=new Scanner(contfile);
	for(int i=0;i<person.length;i++)
	{
		String str=scan.nextLine();
		StringTokenizer str1=new StringTokenizer(str,"!");
		String firstname=str1.nextToken();
		String lastname=str1.nextToken();
		String ssn=str1.nextToken();
		int ssn1=Integer.parseInt(ssn);
		String tokennumber=str1.nextToken();
		int tokennumber1=Integer.parseInt(tokennumber);
		person[i]=new Participants(firstname,lastname,ssn1,tokennumber1);
	}
	}
	catch(IOException ioe){
		System.out.println("The file cannot be read.");
	}
	return person;
}
	
}