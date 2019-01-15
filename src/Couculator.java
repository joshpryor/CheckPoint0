import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Couculator implements  ActionListener{
	JFrame window = new JFrame("couculator");
	JPanel panal = new JPanel();
	JButton multiply = new JButton();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton devide = new JButton();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
public static void main(String[] args) {
	Couculator calc = new Couculator();
	calc.code();
	
	
	
}


void code() {
	window.add(panal);
	window.setVisible(true);
	window.pack();
	add.addActionListener(this);
	multiply.addActionListener(this);
	subtract.addActionListener(this);
	devide.addActionListener(this);
	panal.add(add);
	panal.add(multiply);
	panal.add(subtract);
	panal.add(devide);
	
	
	
	
}
void mult() {
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String once = text1.getText();
	String twice = text2.getText();
	int one = Integer.parseInt(once);
	int two = Integer.parseInt(twice);
	if (e.getSource() == add) {
		int answerAdd = one + two ;
	}
	else if (e.getSource() == multiply) {
		int answerMult = one * two ;
	}
	else if (e.getSource() == subtract) {
		int answerSub = one - two ;
	}
	else if (e.getSource() == devide) {
		int answerSub = one / two ;
	}
}


}

