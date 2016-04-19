package edu.iit.cs445.s2016.srigg;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGen {

	private static AtomicInteger nID = new AtomicInteger();
	
	public static int newID()
	{
		return nID.getAndIncrement();
	}
}
