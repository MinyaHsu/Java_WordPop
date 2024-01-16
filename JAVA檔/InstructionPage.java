import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InstructionPage extends JFrame implements ActionListener{
	
	String iconPath_2 = "images/�}�l�C��.png";
	ImageIcon icon_start = new ImageIcon(iconPath_2);
	JButton jb_start = new JButton(icon_start);
	String iconPath_3 = "images/HOME.png";
	ImageIcon icon_HOME = new ImageIcon(iconPath_3);
	JButton jb_home = new JButton(icon_HOME);
	
	public InstructionPage() {
		this.setVisible(true);
		this.setSize(410,680);
		this.setLocation(450,10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("WORD POP");
		
		//�������I��
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		String iconPath_1 = "images/������.png";
		ImageIcon icon_IP = new ImageIcon(iconPath_1);
		JLabel bg1 = new JLabel(icon_IP);
		bg1.setBounds(0, 0, 400, 650);
		jp1.add(bg1);
		
		//�}�l�C�����s
		jb_start.setBorderPainted(false);//�h�����
		jb_start.setBounds(80, 480, 250, 89);
		jb_start.addActionListener(this);
		bg1.add(jb_start);
		
		//HOME��
		jb_home.setBorderPainted(false);//�h�����
		jb_home.setBounds(5, 5, 40, 40);
		jb_home.addActionListener(this);
		bg1.add(jb_home);
		
		this.add(jp1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstructionPage IP = new InstructionPage();
	}
	
	public void actionPerformed(ActionEvent evt) {
		 if(evt.getSource()==jb_home) {
			 this.dispose();
			 new HomePage();
		 }
		 if(evt.getSource()==jb_start) {
			 this.dispose();
			 new Game1();
		 }
	}
}
