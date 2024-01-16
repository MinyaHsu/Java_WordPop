import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game2 implements ActionListener{
	JFrame jf_main = new JFrame(); 
	JFrame  jf_win = new JFrame();
	JFrame  jf_fail = new JFrame();
	JLabel bg1;
	String iconPath_2 = "images/HOME.png";
	//jf_main��HOME��
	ImageIcon icon_HOME = new ImageIcon(iconPath_2);
	JButton jb_home = new JButton(icon_HOME);
	//jf_win��HOME��
	ImageIcon icon_HOME2 = new ImageIcon(iconPath_2);
	JButton jb_home2 = new JButton(icon_HOME2);
	//jf_fail��HOME��
	ImageIcon icon_HOME3 = new ImageIcon(iconPath_2);
	JButton jb_home3 = new JButton(icon_HOME3);
	//�@���ϪŮ�
	String iconPath_3 = "images/��.png";
	ImageIcon[] icon_answer = new ImageIcon[30];
	JLabel answer[] = new JLabel[30];
	//��L
	String[] iconPath_4 = {"images/��_Q.png", "images/��_W.png", "images/��_E.png", "images/��_R.png", "images/��_T.png", "images/��_Y.png", "images/��_U.png", "images/��_I.png", "images/��_O.png",
						   "images/��_P.png", "images/��_A.png", "images/��_S.png", "images/��_D.png", "images/��_F.png", "images/��_G.png", "images/��_H.png","images/��_J.png", "images/��_K.png",
						   "images/��_L.png", "images/��_Z.png", "images/��_X.png", "images/��_C.png", "images/��_V.png", "images/��_B.png", "images/��_N.png", "images/��_M.png", "images/�R����.png",
						   "images/ENTER.png"};
	JButton jb_keyboard[]=new JButton[28];
	//��J��
	String[] iconPath_5 = {"images/��_Q.png", "images/��_W.png", "images/��_E.png", "images/��_R.png", "images/��_T.png", "images/��_Y.png", "images/��_U.png", "images/��_I.png", "images/��_O.png",
						   "images/��_P.png", "images/��_A.png", "images/��_S.png", "images/��_D.png", "images/��_F.png", "images/��_G.png", "images/��_H.png", "images/��_J.png", "images/��_K.png",
						   "images/��_L.png", "images/��_Z.png", "images/��_X.png", "images/��_C.png", "images/��_V.png", "images/��_B.png", "images/��_N.png", "images/��_M.png"};
	//�r���m��
	String[] iconPath_6 = {"images/��_Q.png", "images/��_W.png", "images/��_E.png", "images/��_R.png", "images/��_T.png", "images/��_Y.png", "images/��_U.png", "images/��_I.png", "images/��_O.png",
						   "images/��_P.png", "images/��_A.png", "images/��_S.png", "images/��_D.png", "images/��_F.png", "images/��_G.png", "images/��_H.png", "images/��_J.png", "images/��_K.png",
						   "images/��_L.png", "images/��_Z.png", "images/��_X.png", "images/��_C.png", "images/��_V.png", "images/��_B.png", "images/��_N.png", "images/��_M.png"};
	//�r���m��
	String[] iconPath_7 = {"images/��_Q.png", "images/��_W.png", "images/��_E.png", "images/��_R.png", "images/��_T.png", "images/��_Y.png", "images/��_U.png", "images/��_I.png", "images/��_O.png",
						   "images/��_P.png", "images/��_A.png", "images/��_S.png", "images/��_D.png", "images/��_F.png", "images/��_G.png", "images/��_H.png", "images/��_J.png", "images/��_K.png",
						   "images/��_L.png", "images/��_Z.png", "images/��_X.png", "images/��_C.png", "images/��_V.png", "images/��_B.png", "images/��_N.png", "images/��_M.png"};
	//�r��
	String[] iconPath_8 = {"images/��_Q.png", "images/��_W.png", "images/��_E.png", "images/��_R.png", "images/��_T.png", "images/��_Y.png", "images/��_U.png", "images/��_I.png", "images/��_O.png",
						   "images/��_P.png", "images/��_A.png", "images/��_S.png", "images/��_D.png", "images/��_F.png", "images/��_G.png", "images/��_H.png", "images/��_J.png", "images/��_K.png",
						   "images/��_L.png", "images/��_Z.png", "images/��_X.png", "images/��_C.png", "images/��_V.png", "images/��_B.png", "images/��_N.png", "images/��_M.png"};
	
	//�U�@�����s
	String iconPath_next = "images/�U�@��.png";
	ImageIcon icon_next = new ImageIcon(iconPath_next);
	JButton jb_next = new JButton(icon_next);
	//�b���@�����s
	String iconPath_again = "images/�A���@��.png";
	ImageIcon icon_again = new ImageIcon(iconPath_again);
	JButton jb_again = new JButton(icon_again);
	
	int index = 0;
	int[] keyin = new int[5];
	int[] word = {11, 4, 10, 14, 2};//���T��rSTAGE
	
	public Game2() {
		//�C������
		jf_main.setVisible(true);
		jf_main.setSize(410,680);
		jf_main.setLocation(450,10);
		jf_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_main.setTitle("WORD POP");
		
		//���d�I��
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		String iconPath_1 = "images/�ĤG��.png";
		ImageIcon icon_g1 = new ImageIcon(iconPath_1);
		JLabel bg1 = new JLabel(icon_g1);
		bg1.setBounds(0, 0, 400, 650);
		bg1.setVisible(true);
		jp1.add(bg1);
		
		//HOME��
		jb_home.setBorderPainted(false);//�h�����
		jb_home.setBounds(5, 5, 40, 40);
		jb_home.addActionListener(this);
		bg1.add(jb_home);
		
		
		//�@����
		for(int i=0;i<30;i++) {
			icon_answer[i] = new ImageIcon(iconPath_3);
			answer[i] = new JLabel(icon_answer[i]);
			int j = i%5;
			if(i<5) {//�Ĥ@��
				answer[i].setBounds(70+j*54, 65, 50, 50);
			}else if(i<10) {//�ĤG��
				answer[i].setBounds(70+j*54, 125, 50, 50);
			}else if(i<15) {//�ĤT��
				answer[i].setBounds(70+j*54, 185, 50, 50);
			}else if(i<20) {//�ĥ|��
				answer[i].setBounds(70+j*54, 245, 50, 50);
			}else if(i<25) {//�Ĥ���
				answer[i].setBounds(70+j*54, 305, 50, 50);
			}else if(i<30) {//�Ĥ���
				answer[i].setBounds(70+j*54, 365, 50, 50);
			}
			bg1.add(answer[i]);
		}
		
		//��L���s
		ImageIcon[] icon_keyboard = new ImageIcon[28];
		int k = 0;
		for(int i=0;i<28;i++) {
			icon_keyboard[i] = new ImageIcon(iconPath_4[i]);
			jb_keyboard[i] = new JButton(icon_keyboard[i]);
			jb_keyboard[i].setBorderPainted(false);//�h�����
			if(i<=9) {//�Ĥ@��
				jb_keyboard[i].setBounds(5+k*39, 423, 35, 53);
				if(k==9) {
					k=0;
				}else {
					k++;
				}
			}else if(i<=18) {//�ĤG��
				jb_keyboard[i].setBounds(23+k*39, 479, 35, 53);
				if(k==8) {
					k=0;
				}else {
					k++;
				}
			}else if(i<26){//�ĤT��
				jb_keyboard[i].setBounds(25+k*39, 535, 35, 53);
				k++;
			}else if(i==26) {//�R����
				jb_keyboard[i].setBounds(25+k*39, 535, 94, 53);
			}else if(i==27) {//ENTER��
				jb_keyboard[i].setBounds(150, 591, 95, 53);
			}
			jb_keyboard[i].addActionListener(this);
			bg1.add(jb_keyboard[i]);
		}
		jf_main.add(jp1);
		
		//���\����
		jf_win.setVisible(false);
		jf_win.setSize(410,680);
		jf_win.setLocation(450,10);
		jf_win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_win.setTitle("WORD POP");
		
		//���\�I��
		JPanel jp_win = new JPanel();
		jp_win.setLayout(null);
		String iconPath_win = "images/���\.png";
		ImageIcon icon_win = new ImageIcon(iconPath_win);
		JLabel jl_win = new JLabel(icon_win);
		jl_win.setBounds(0, 0, 400, 650);
		jp_win.add(jl_win);
		
		//HOME��
		jb_home2.setBorderPainted(false);//�h�����
		jb_home2.setBounds(5, 5, 40, 40);
		jb_home2.addActionListener(this);
		jl_win.add(jb_home2);
		
		//�U�@�����s
		jb_next.setBorderPainted(false);//�h�����
		jb_next.setBounds(80, 450, 250, 83);
		jb_next.addActionListener(this);
		jl_win.add(jb_next);
		
		jf_win.add(jp_win);
		
		//���ѵ���
		jf_fail.setVisible(false);
		jf_fail.setSize(410,680);
		jf_fail.setLocation(450,10);
		jf_fail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_fail.setTitle("WORD POP");
		
		//�I��
		JPanel jp_fail = new JPanel();
		jp_fail.setLayout(null);
		String iconPath_fail = "images/����.png";
		ImageIcon icon_fail = new ImageIcon(iconPath_fail);
		JLabel jl_fail = new JLabel(icon_fail);
		jl_fail.setBounds(0, 0, 400, 650);
		jp_fail.add(jl_fail);
		
		//HOME��
		jb_home3.setBorderPainted(false);//�h�����
		jb_home3.setBounds(5, 5, 40, 40);
		jb_home3.addActionListener(this);
		jl_fail.add(jb_home3);
		
		//�A���@�����s
		jb_again.setBorderPainted(false);//�h�����
		jb_again.setBounds(80, 450, 250, 85);
		jb_again.addActionListener(this);
		jl_fail.add(jb_again);
						
		jf_fail.add(jp_fail);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game2 g2 = new Game2();
	}

	public void actionPerformed(ActionEvent evt) {
		 if(evt.getSource()==jb_home) {//jf_main��HOME��
			 jf_main.dispose();
			 new HomePage();
		 }
		 if(evt.getSource()==jb_home2) {//jf_win��HOME��
			 jf_win.dispose();
			 new HomePage();
		 }
		 if(evt.getSource()==jb_home3) {//jf_fail��HOME��
			 jf_fail.dispose();
			 new HomePage();
		 }
		if(evt.getSource()==jb_next) {//�U�@��
			jf_win.dispose();
			new Game3();
		}
		if(evt.getSource()==jb_again) {//�A���@��
			jf_fail.dispose();
			new Game2();
		}
		if(evt.getSource()==jb_keyboard[26]) {//�R��
			index--;
			answer[index].setIcon(icon_answer[index]);
		}else if(evt.getSource()==jb_keyboard[27]) {//ENTER
			int correct = 0;
			for(int i=0;i<5;i++) {//keyin��i��
				if(keyin[i]==word[i]) {//�r���m��A���r
					answer[index-5+i].setIcon(new ImageIcon(iconPath_6[keyin[i]]));
					correct++;
					if(correct==5) {
						jf_win.setVisible(true);
						jf_main.dispose();
					}
				}else{//keyin[i]!=word[i]�A��m��
					boolean haveWord = false;
					for(int a=0;a<5;a++) {
						if(keyin[i]==word[a]) {//�r��A����r
							answer[index-5+i].setIcon(new ImageIcon(iconPath_7[keyin[i]]));
							haveWord = true;
						}
					}
					if(haveWord==false) {//�r���A�Ǧ�r
						answer[index-5+i].setIcon(new ImageIcon(iconPath_8[keyin[i]]));
					}
					if(index==30) {
						jf_fail.setVisible(true);
						jf_main.dispose();
					}
				}
			}
			correct = 0;
		}else {//��J
			for(int i=0;i<26;i++) {
				if(evt.getSource()==jb_keyboard[i]) {
					answer[index].setIcon(new ImageIcon(iconPath_5[i]));
					keyin[index%5]=i;//������J���r��
					index++;
				}
			}
		 }
	}
}
