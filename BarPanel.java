import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class BarPanel extends Panel{
	public BarPanel() {
		//Create controlpanel and textfield_ChVolDisplay
		ControlPanel BarPanel_ControlPanel = new ControlPanel();
		JTextField BarPanel_TextField = new JTextField("Ch 35 Vol 45");


		//Add to this BarPanel panel
		this.add(BarPanel_TextField);
		this.add(BarPanel_ControlPanel);
		


	}
}
