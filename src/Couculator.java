import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Couculator implements  ActionListener{
	JFrame window = new JFrame("couculator");
	JPanel panal = new JPanel();
	JButton multiply = new JButton("multiply");
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton devide = new JButton("devide");
	JTextField text1 = new JTextField(12);
	JTextField text2 = new JTextField(12);
	JLabel lable1 = new JLabel();
	//JLabel lable2 = new JLabel();
	//JLabel lable3 = new JLabel();
	//JLabel lable4 = new JLabel();
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
	panal.add(text1);
	panal.add(text2);
	panal.add(lable1);
/*	panal.add(lable2);
	panal.add(lable3);
	panal.add(lable4);
	*/
	window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	window.pack();
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
		double answerAdd = one + two ;
		String anserAdd = String.valueOf(answerAdd);
		lable1.setText(anserAdd);
	}
	else if (e.getSource() == multiply) {
		double answerMult = one * two ;
		String anserMultiply = String.valueOf(answerMult);
		lable1.setText(anserMultiply);
	}
	else if (e.getSource() == subtract) {
		double answerSub = one - two ;
		String anserSub = String.valueOf(answerSub);
		lable1.setText(anserSub);
	}
	else if (e.getSource() == devide) {
		double answerDivide = one / two ;
		String anserDivide = String.valueOf(answerDivide);
		lable1.setText(anserDivide);
	}
}


}

