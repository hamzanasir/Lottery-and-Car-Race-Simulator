import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class LotteryAndRaceSimulator
{
public static void main(String[]args)
{
	Vehicle[] veh=Cars.arrayofAwards("awards.txt");
	Participants[] person=Contestants.arrayofContestants("participants.txt");
	
	int lotterynumber=0;
	for(int a=0; a<veh.length;)
	{
	   lotterynumber=(int)(1+Math.random()*(50));
			
			
    for(int i=0; i<person.length;i++)
	{
	   if(lotterynumber==person[i].getlotterynumber() && person[i].getVehicle()==null)
				{
					for(int d=0; d<person.length; d++)
					{
						if(person[i].getssn()==person[d].getssn() && person[d].getVehicle()!=null && i!=d)
						{
							System.out.println("Participant "+person[i].getfirstname()+" "+person[i].getlastname()+" is a cheater!");
							d=person.length;
							i=person.length;
						}
						else if(person[i].getssn()==person[d].getssn() && person[d].getVehicle()==null)
						{
							person[i].setVehicle(veh[a]);
							veh[a].setParticipant(person[i]);
							a++;
							d=person.length;
							i=person.length;
						}
					}
				}
			}
		}
		System.out.println("Cheaters: ");
		for(int o=0;o<person.length;o++){
			if(person[o].getVehicle()!=null){
			for(int v=0;v<person.length;v++){
				if(person[o].getssn()==person[v].getssn() && o!=v &&person[v].getVehicle()!=null){
					System.out.println(""+person[o].getfirstname()+" "+person[o].getlastname());
				}
				
			}
			}
		}
		
	//prints
	for(int s=0;s<person.length;s++)
	{
		if(person[s].getVehicle()!=null)
		{
			System.out.println(""+person[s].getfirstname()+" "+person[s].getlastname()+" won! His award is a "+person[s].getVehicle().toString());
		}
	}
	System.out.println("\nPeople who lost: ");
	
	for(int e=0;e<person.length;e++)
	{
		if(person[e].getVehicle()==null)
		{
			System.out.println(""+person[e].getfirstname()+" "+person[e].getlastname());
		}
	}
	
	//Race
	
	double acceleration=0.0;
	for(int g=0;g<veh.length;g++)
	{
		acceleration=(int)(1+Math.random()*(20));
		
		veh[g].setacceleration(acceleration);
		
		veh[g].setdistance(50000.0);
		veh[g].timetaken();
		veh[g].finalvelocity();
		//g++;
		
	}
	
	
	for(int h=0;h<veh.length;h++){
		
		for(int w=0;w<veh.length;w++)
		{
			if(veh[h].getacceleration()==veh[w].getacceleration()&&h!=w)
			{
				
				acceleration=(int)(1+Math.random()*(20));
				veh[h].setacceleration(acceleration);
				
				veh[h].setdistance(50000.0);
				veh[h].timetaken();
				veh[h].finalvelocity();
				
				//w=-1;
				
				
			}
		}	
		
	}
	
	//winner
	double min=1000000.0;
	int carpos=0;
	for(int q=0;q<veh.length;q++)
	{
		if(veh[q].gettime()<min)
		{
			min=veh[q].gettime();
			carpos=q;
		}
	}
	System.out.println("The winner of the race is: "+veh[carpos].getParticipant().getfirstname()+" "+veh[carpos].getParticipant().getlastname());
    System.out.println("Their car's acceleration was: "+veh[carpos].getacceleration()+" The id of the vehicle is: "+veh[carpos].getcurrentid()+" The time it took was: "+veh[carpos].gettime()+" with a final velocity of: "+veh[carpos].getvelocity());
	
	    //places
		min=100000.0;
		carpos=0;
		Vehicle[] place=new Vehicle[veh.length];
		for(int l=0; l<place.length; l++)
		{
			for(int k=0; k<veh.length; k++)
			{
				if(veh[k].gettime()<min)
				{
					min=veh[k].gettime();
					carpos=k;
				}
			}
			place[l]=veh[carpos];
			veh[carpos].settime(100000.0);
			min=100000.0;
		}
		System.out.println("\nThe order at the finish line from the first to the last is: ");
		for(int q=0; q<place.length; q++)
		{
			System.out.println("Car ID is "+place[q].getcurrentid()+" finished with an acceleration of "+place[q].getacceleration());
		}

		}
}