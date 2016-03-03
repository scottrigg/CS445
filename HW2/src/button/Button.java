/**
 * 
 * @author Scott Rigg
 *
 */
package button;
import lightbulb.LightbulbInt;
public class Button {

	private LightbulbInt lbulbi;
	public Button(LightbulbInt lb)
	{
		lbulbi = lb;
	}
	
	public void switchOn()
	{
		System.out.println("Button switched to ON");
		lbulbi.on();
	}
	
	public void switchOff()
	{
		System.out.println("Button switched to OFF");
		lbulbi.off();
	}
	
	
}
