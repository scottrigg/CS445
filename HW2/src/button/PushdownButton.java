/**
 * @author Scott Rigg
 */
package button;
import lightbulb.LightbulbInt;
public class PushdownButton {

	
	private LightbulbInt lbulb;
	public PushdownButton(LightbulbInt lb)
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
