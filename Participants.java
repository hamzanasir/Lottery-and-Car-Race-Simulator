public class Participants
{
	String firstname;
	String lastname;
	int ssn;
	int lotterynumber;
	static int peopleid=0;
	int personid;
	Vehicle v=null;
	
public Participants()
{
	firstname="";
	lastname="";
	ssn=0;
	lotterynumber=-1;
	peopleid++;
	personid=peopleid;
}

public Participants(String fn, String ln, int sn, int lon )
{
	firstname=fn;
	lastname=ln;
	ssn=sn;
	lotterynumber=lon;
	peopleid++;
	personid=peopleid;
}

public static int getpeopleid()
{
	return peopleid;
}

public int getpersonid()
{
	return personid;
}

public String getfirstname()
{
	return firstname;
}

public String getlastname()
{
	return lastname;
}

public int getssn()
{
	return ssn;
}
public int getlotterynumber()
{
	return lotterynumber;
}

public Vehicle getVehicle()
	{
		return v;
	}



public void setfirstname(String fn)
{
	firstname=fn;
}

public void setlastname(String ln)
{
	lastname=ln;
}

public void setssn(int sn)
{
	ssn=sn;
}

public void setlotterynumber(int lon)
{
	lotterynumber=lon;
}

public void setpeopleid(int poi)
{
	peopleid=poi;
}

public void setpersonid(int pi)
{
	personid=pi;
}
public void setVehicle(Vehicle t)
	{
		v=t;
	}
	
public String toString()
{
	String output;
	output="Name: "+firstname+" "+lastname+" SSN: "+ssn+" Lotterynumber: "+lotterynumber;
	return output;
}
}