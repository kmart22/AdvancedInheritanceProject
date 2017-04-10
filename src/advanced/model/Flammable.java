package advanced.model;
/**
 * 
 * @author Kaden Martinsen
 * @author Dylan Robson
 * @author Braeden Moffat
 *
 */


public interface Flammable 
{
	public boolean isFlammable();
	public boolean isFlameRetardant();
	public boolean isDrenchedInLighterFluid();
	
	public int flammability = 0;
	public int setFlammabilityLevel(int level);
	public int getFlammabilityLevel();
}
