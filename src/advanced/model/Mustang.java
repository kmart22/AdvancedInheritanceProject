package advanced.model;

public class Mustang extends Car
{
	public Mustang (String name, int speed)
	{
		flammability = 10;
	}
	
	
	public boolean isFlammable()
	{
		return false;
	}
	
	
	public boolean isFlameRetardant()
	{
		return true;
	}
	
	
	public boolean isDrenchedInLighterFluid()
	{
		return true;
	}
	
	
	public int setFlammabilityLevel(int level)
	{
		this.flammability = level;
	}
	
	
	public int getFlammabilityLevel()
	{
		return flammability;
	}
}
