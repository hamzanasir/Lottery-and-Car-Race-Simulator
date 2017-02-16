public class Vehicle
{
 int price;
 String type;
 String drive;
 int currentid;
 static int id;
 Participants p=null;
 
double distance=0.0;
double velocity=0.0;
double acceleration=0.0;
double time=0.0;
 
 public Vehicle()
 {
	 price=0;
	 type="Any";
	 drive="Any";
	 id++;
	 currentid=id;
 }
 
 public Vehicle(int p,String t,String d)
 {
	 price=p;
	 type=t;
	 drive=d;
	 id++;
	 currentid=id;
 }
 
 public int getprice()
 {
	 return price;
 }
 
 public String gettype()
 {
	 return type;
 }
 
 public String getdrive()
 {
	 return drive;
 }
 
 public static int getid()
 {
	 return id;
 }
 
 public int getcurrentid()
 {
	 return currentid;
 }
 
 public Participants getParticipant()
	{
		return p;
	}
	
 public double getdistance()
	{
		return distance;
	}
 public double getvelocity()
	{
		return velocity;
	}
 public double getacceleration()
	{
		return acceleration;
	}
 public double gettime()
	{
		return time;
	}
	
 
 public void setprice(int p)
 {
	 price=p;
 }
 
 public void settype(String t)
 {
	 type=t;
 }
 
 public void setdrive(String r)
 {
	 drive=r;
 }
 
 public void setcurrentid(int x)
 {
	 currentid=x;
 }
 
 public void setid(int y)
 {
	 id=y;
 }
 public void setParticipant(Participants n)
	{
		p=n;
	}
	
 public void setdistance(double r)
	{
		distance=r;
	}
 public void setvelocity(double v)
	{
		velocity=v;
	}
 public void setacceleration(double a)
	{
		acceleration=a;
	}
 public void settime(double u)
	{
		time=u; 
	}
public void timetaken()
	{
		time=Math.sqrt(2*distance/acceleration);
	}
	public void finalvelocity()
	{
		velocity=acceleration*time;
	}
 public String toString()
 {
	 String output;
	 output="$"+price+" "+type+" which is a "+drive+" drive.";
	 return output;
 }
}