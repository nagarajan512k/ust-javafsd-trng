package com.ust;

public class Thismethod {
static int x=1;
private int y=3;
public void method1(int x)
{
	Thismethod t=new Thismethod();
	this.x=2;
	y=4;
	
	System.out.println("Test.x:"+Thismethod.x);
	System.out.println("t.x:"+t.x);
	System.out.println("t.y:"+t.y);
	System.out.println("y:"+y);
}

public static void main(String args[]) {
	Thismethod t=new Thismethod();
	t.method1(5);
}
}
