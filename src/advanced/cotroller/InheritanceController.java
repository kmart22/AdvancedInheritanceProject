package advanced.cotroller;

import java.util.ArrayList;

import advanced.model.*;



public class InheritanceController 
{
	Dog cutestDogInTheWorld;
	Dog fieryPokemonDoggo;
	ArrayList<Dog> pupperList = new ArrayList<Dog>();
	
	public InheritanceController()
	{
		cutestDogInTheWorld = new Ridgeback();
		fieryPokemonDoggo = new Arcanine();
		
		pupperList.add(cutestDogInTheWorld);
		pupperList.add(fieryPokemonDoggo);
	}
	
	public void start() 
	{
		
	}
	
	
	
}
