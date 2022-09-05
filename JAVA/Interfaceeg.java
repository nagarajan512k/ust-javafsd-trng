package com.ust1;

interface Vehicle{
	public abstract String getColor();
	public abstract String getEngineType();
	public static final int x=4;
}

abstract public class Interfaceeg implements Vehicle{
	public String getColor()
	{
		return "Green";
	}
/**	public String getEngineType() {
		return "Manual";
	}*/

}
