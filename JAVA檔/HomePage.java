import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame implements ActionListener{
	
	String iconPath_2 = "images/�C������.png";
	ImageIcon icon_instruction = new ImageIcon(iconPath_2);
	JButton jb_instruction = new JButton(icon_instruction);
	String iconPath_3 = "images/�}�l�C��.png";
	ImageIcon icon_start = new ImageIcon(iconPath_3);
	JButton jb_start = new JButton(icon_start);
	
	public HomePage() {
		this.setVisible(true);
		this.setSize(410,680);
		this.setLocation(450,10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("WORD POP");
		
		//�����I��
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		String iconPath_1 = "images/�����I��.png";
		ImageIcon icon_hp = new ImageIcon(iconPath_1);
		JLabel bg1 = new JLabel(icon_hp);
		bg1.setBounds(0, 0, 400, 650);
		jp1.add(bg1);
		
		//�C���������s
		jb_instruction.setBorderPainted(false);//�h�����
		jb_instruction.setBounds(80, 390, 250, 89);
		jb_instruction.addActionListener(this);
		bg1.add(jb_instruction);
		
		//�}�l�C�����s
		jb_start.setBorderPainted(false);//�h�����
		jb_start.setBounds(80, 480, 250, 89);
		jb_start.addActionListener(this);
		bg1.add(jb_start);
		
		this.add(jp1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage HP = new HomePage();
	}
	public void actionPerformed(ActionEvent evt) {
		 if(evt.getSource()==jb_instruction) {
			 this.dispose();
			 new InstructionPage();
		 }
		 if(evt.getSource()==jb_start) {
			 this.dispose();
			 new Game1();
		 }
	}
}
