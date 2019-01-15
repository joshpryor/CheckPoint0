import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class SensitiveKeyboard implements KeyListener {
JFrame window = new JFrame("ouch");
JPanel panal = new JPanel();
public static void main(String[] args) {
	
	//1. Make a program that says “ouch” every time a key is pressed. You can use the speak() method below.
	//if (keyPressed == true) {
	SensitiveKeyboard board = new SensitiveKeyboard();
	board.code();
	
	
	/*board. */    
	


}



static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
void code() {
	window.setVisible(true);
	window.add(panal);
	
	//panal.getKeyListeners();
	//panal.action(evt, what)
	window.addKeyListener(this);
	window.pack();
window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
}



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

}



@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("key pressed");
	speak("ouch");
}



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



}