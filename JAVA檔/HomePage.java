import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame implements ActionListener{
	
	String iconPath_2 = "images/遊戲說明.png";
	ImageIcon icon_instruction = new ImageIcon(iconPath_2);
	JButton jb_instruction = new JButton(icon_instruction);
	String iconPath_3 = "images/開始遊戲.png";
	ImageIcon icon_start = new ImageIcon(iconPath_3);
	JButton jb_start = new JButton(icon_start);
	
	public HomePage() {
		this.setVisible(true);
		this.setSize(410,680);
		this.setLocation(450,10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("WORD POP");
		
		//首頁背景
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		String iconPath_1 = "images/首頁背景.png";
		ImageIcon icon_hp = new ImageIcon(iconPath_1);
		JLabel bg1 = new JLabel(icon_hp);
		bg1.setBounds(0, 0, 400, 650);
		jp1.add(bg1);
		
		//遊戲說明按鈕
		jb_instruction.setBorderPainted(false);//去掉邊框
		jb_instruction.setBounds(80, 390, 250, 89);
		jb_instruction.addActionListener(this);
		bg1.add(jb_instruction);
		
		//開始遊戲按鈕
		jb_start.setBorderPainted(false);//去掉邊框
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
