import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class P25
{
	public static void main(String[] args)
	{

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Rectangle box = new Rectangle(0,0, 10, 30);
		frame.setBounds(box);
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		box.translate(100,100);
		frame.setBounds(box);
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
	}
}
