/**
 * @author Scott Rigg
 */
package button;
import lightbulb.Lightbulb;
public class PushdownButton {

	
	private Lightbulb lbulb;
	public PushdownButton(Lightbulb lb)
	{
		lbulb = lb;
	}
	
	private boolean lf = false;
	
	public void PushButton()
	{
		if(lf==false)
		{
			System.out.println("Button toggled");
			lbulb.on();
			lf = true;
		}
		else
		{
			System.out.println("Button toggled");
			lbulb.off();
			lf=false;
		}
	}
}
