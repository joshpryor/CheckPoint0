import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class moleAWack {
JFrame window = new JFrame( );
JPanel panal = new JPanel();

	public static void main(String[] args)    /* implements */    {
		moleAWack mole = new moleAWack();
		mole.code();
		mole.speak("anamel crackers");
	}
	void code() {
		
		window.setSize(300, 500);
		for (int i = 1; i < 25; i+=1) {
			JButton button = new JButton();
		window.setVisible(true);
		window.add(panal);
		panal.add(button);
		
		}
	}
	void speak(String words) {
    try {
        Runtime.getRuntime().exec("say " + words).waitFor();
   } catch (Exception e) {
        e.printStackTrace();
   }
}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)  + " moles per second.");
	        
	}
	
	
	
	
}
