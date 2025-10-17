import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class ControlPanel extends JPanel {
	public ControlPanel() {		
		
		//create a On/Of button and add to the power panel 
		JButton button_OnOff  = new JButton("On/Off");
		

		
		
		//create two adjust panels and add to the layout of this control Panel
		AdjustPanel p01_AdjustPanel = new AdjustPanel("Ch");
		AdjustPanel p02_AdjustPanel = new AdjustPanel("Vol");
		this.add(p01_AdjustPanel);
		this.add(p02_AdjustPanel);
		this.add(button_OnOff);



	}
}