import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class actionlistener{
	public static void main(String[] args) {
		JButton b = new JButton("text");
		b.addActionListener(e->System.out.println("hello"));
	}


}
