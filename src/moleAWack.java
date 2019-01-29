import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class moleAWack implements ActionListener {
JFrame window = new JFrame( );
JPanel panal = new JPanel();
JButton start = new JButton("start");
	public static void main(String[] args)         {
		moleAWack mole = new moleAWack();
		mole.code1();
		//mole.code();
		
		//mole.speak("jackie,do  I  have a question?");
	}
	void code1(){
		start.addActionListener(this);
		panal.add(start);
		window.add(panal);
		window.setVisible(true);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.pack();
	}
	
	void code() {
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		Random bobTheRandom = new Random();
		 int bobbyTheIntRandom = bobTheRandom.nextInt(24);
		
		
		
		for (int i = 0; i < 24; i+=1) {
			JButton button = new JButton();
			panal.add(button);
			if (i == bobbyTheIntRandom) {
				button.setText("mole");
			}
			button.addActionListener(this);
		}
		
		
		window.setVisible(true);
		window.add(panal);
		
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		window.setSize(300, 500);							//set size
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
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (start == e.getSource()) {
			code();
		}
		
		
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.getText() ==  "mole") {
			speak("oof");
		}
		else {
			speak("not oof");

		}
		
	}
	
	
	
	
}
