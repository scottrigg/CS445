package srigg.Delectable.objects;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGen {

	private static AtomicInteger nID = new AtomicInteger();
	
	public static int newID()
	{
		return nID.getAndIncrement();
	}
}
