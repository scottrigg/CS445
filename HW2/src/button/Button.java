/**
 * 
 * @author Scott Rigg
 *
 */
package button;
import lightbulb.Lightbulb;
public class Button {

	private Lightbulb lbulb;
	public Button(Lightbulb lb)
	{
		lbulb = lb;
	}
	
	public void switchOn()
	{
		System.out.println("Button switched to ON");
		lbulb.on();
	}
	
	public void switchOff()
	{
		System.out.println("Button switched to OFF");
		lbulb.off();
	}
	
	
}
