package thursdaylab;

public class AccountLab implements Comparable <AccountLab> {

	int id,acc;
	String name;
	
	@Override
	public String toString() {
		return "Details [Id = "+ id + ", Account no = "+ acc + ", Name = "+ name + "]";
	}
	
	
	public AccountLab (int id,int acc, String name)
	{
		super();
		this.id=id;
		this.acc=acc;
		this.name=name;
	}
	
	@Override
	public int compareTo (AccountLab o)
	{
		if (id==o.id)
			return 0;
		else if (id<o.id) //To print Id in descending order
			return 1;
		else 
			return -1;
	} 

}
