import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) {
		//Call a method TelevisionComponents
		this.TelevisionComponents();

		//set JFrame
		this.setTitle("My Tevision");
		this.setSize(700,400);
		this.setVisible(true);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	public void TelevisionComponents() {
		//create abutton_TelevisionScreen and panal_TelevisionButtonBar
		JButton abutton_TelevisionScreen = new JButton();
		BarPanel panal_TelevisionButtonBar = new BarPanel(); 
		
		//Add to this Television
		this.setLayout(new BorderLayout());
		this.add(abutton_TelevisionScreen,BorderLayout.CENTER);
		this.add(panal_TelevisionButtonBar,BorderLayout.SOUTH);

	}
}