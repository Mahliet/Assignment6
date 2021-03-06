
public abstract class Beverage
{
	private String name;
	private TYPE type;
	private SIZE size;
	private final double BASE_PRICE=2.0;
	private final double SIZE_PRICE=1.0;
	
	public Beverage(String name, TYPE type, SIZE size)
	{
		this.name= name;
		this.type=type;
		this.size=size;
	}
	public abstract double calcPrice();
	
	public String toString()
	{
		 return name +", " +size;
	}
	
	public boolean equals(Beverage b)
	{
		 if (name.equals(b.getName()) && type==b.getType() && size==b.getSize()) 
		  	{
              return true;
		  	}
         else 
      		{
              return false;
      		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public TYPE getType()
	{
		return type;
	}
	
	public SIZE getSize()
	{
		return size;
	}
	
	public double getBasePrice()
	{
		return BASE_PRICE;
	}
	
	public double getSizePrice()
	{
		return SIZE_PRICE;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setType(TYPE type)
	{
		this.type=type;
	}
	
	public void setSize(SIZE size)
	{
		this.size=size;
	}
	public boolean equals(Alcohol alco) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	public boolean equals(Coffee coff) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean equals(Smoothie smo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
