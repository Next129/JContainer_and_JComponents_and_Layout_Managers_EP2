import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class AdjustPanel extends JPanel{

	public AdjustPanel(String centerText) {
		//create three buttons: Less, center text, and more 
		JButton button_Less = new JButton("<<");
		JButton button_Center = new JButton(centerText);
		JButton button_More = new JButton(">>");


		//Add to this AdjustPanel panel
		
		this.add(button_Less);
		this.add(button_Center);
		this.add(button_More);


	}
}
