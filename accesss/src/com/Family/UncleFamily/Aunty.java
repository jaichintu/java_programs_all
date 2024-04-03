package com.Family.UncleFamily;

import com.Family.NewFamily.*;

public class Aunty extends Father {
	public static void main(String[] args) {
		Father a1 = new Aunty();
//		a1.atm();
//		a1.car();
//		a1.bike();
		a1.cycle();
		
		Aunty f1=(Aunty) a1;
		f1.carkey();
		f1.bike();
	}
	public void carkey()
	{
		System.out.println("carkey ");
	}
}
