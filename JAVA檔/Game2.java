import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game2 implements ActionListener{
	JFrame jf_main = new JFrame(); 
	JFrame  jf_win = new JFrame();
	JFrame  jf_fail = new JFrame();
	JLabel bg1;
	String iconPath_2 = "images/HOME.png";
	//jf_main的HOME鍵
	ImageIcon icon_HOME = new ImageIcon(iconPath_2);
	JButton jb_home = new JButton(icon_HOME);
	//jf_win的HOME鍵
	ImageIcon icon_HOME2 = new ImageIcon(iconPath_2);
	JButton jb_home2 = new JButton(icon_HOME2);
	//jf_fail的HOME鍵
	ImageIcon icon_HOME3 = new ImageIcon(iconPath_2);
	JButton jb_home3 = new JButton(icon_HOME3);
	//作答區空格
	String iconPath_3 = "images/空.png";
	ImageIcon[] icon_answer = new ImageIcon[30];
	JLabel answer[] = new JLabel[30];
	//鍵盤
	String[] iconPath_4 = {"images/白_Q.png", "images/白_W.png", "images/白_E.png", "images/白_R.png", "images/白_T.png", "images/白_Y.png", "images/白_U.png", "images/白_I.png", "images/白_O.png",
						   "images/白_P.png", "images/白_A.png", "images/白_S.png", "images/白_D.png", "images/白_F.png", "images/白_G.png", "images/白_H.png","images/白_J.png", "images/白_K.png",
						   "images/白_L.png", "images/白_Z.png", "images/白_X.png", "images/白_C.png", "images/白_V.png", "images/白_B.png", "images/白_N.png", "images/白_M.png", "images/刪除鍵.png",
						   "images/ENTER.png"};
	JButton jb_keyboard[]=new JButton[28];
	//輸入後
	String[] iconPath_5 = {"images/藍_Q.png", "images/藍_W.png", "images/藍_E.png", "images/藍_R.png", "images/藍_T.png", "images/藍_Y.png", "images/藍_U.png", "images/藍_I.png", "images/藍_O.png",
						   "images/藍_P.png", "images/藍_A.png", "images/藍_S.png", "images/藍_D.png", "images/藍_F.png", "images/藍_G.png", "images/藍_H.png", "images/藍_J.png", "images/藍_K.png",
						   "images/藍_L.png", "images/藍_Z.png", "images/藍_X.png", "images/藍_C.png", "images/藍_V.png", "images/藍_B.png", "images/藍_N.png", "images/藍_M.png"};
	//字對位置對
	String[] iconPath_6 = {"images/綠_Q.png", "images/綠_W.png", "images/綠_E.png", "images/綠_R.png", "images/綠_T.png", "images/綠_Y.png", "images/綠_U.png", "images/綠_I.png", "images/綠_O.png",
						   "images/綠_P.png", "images/綠_A.png", "images/綠_S.png", "images/綠_D.png", "images/綠_F.png", "images/綠_G.png", "images/綠_H.png", "images/綠_J.png", "images/綠_K.png",
						   "images/綠_L.png", "images/綠_Z.png", "images/綠_X.png", "images/綠_C.png", "images/綠_V.png", "images/綠_B.png", "images/綠_N.png", "images/綠_M.png"};
	//字對位置錯
	String[] iconPath_7 = {"images/黃_Q.png", "images/黃_W.png", "images/黃_E.png", "images/黃_R.png", "images/黃_T.png", "images/黃_Y.png", "images/黃_U.png", "images/黃_I.png", "images/黃_O.png",
						   "images/黃_P.png", "images/黃_A.png", "images/黃_S.png", "images/黃_D.png", "images/黃_F.png", "images/黃_G.png", "images/黃_H.png", "images/黃_J.png", "images/黃_K.png",
						   "images/黃_L.png", "images/黃_Z.png", "images/黃_X.png", "images/黃_C.png", "images/黃_V.png", "images/黃_B.png", "images/黃_N.png", "images/黃_M.png"};
	//字錯
	String[] iconPath_8 = {"images/灰_Q.png", "images/灰_W.png", "images/灰_E.png", "images/灰_R.png", "images/灰_T.png", "images/灰_Y.png", "images/灰_U.png", "images/灰_I.png", "images/灰_O.png",
						   "images/灰_P.png", "images/灰_A.png", "images/灰_S.png", "images/灰_D.png", "images/灰_F.png", "images/灰_G.png", "images/灰_H.png", "images/灰_J.png", "images/灰_K.png",
						   "images/灰_L.png", "images/灰_Z.png", "images/灰_X.png", "images/灰_C.png", "images/灰_V.png", "images/灰_B.png", "images/灰_N.png", "images/灰_M.png"};
	
	//下一關按鈕
	String iconPath_next = "images/下一關.png";
	ImageIcon icon_next = new ImageIcon(iconPath_next);
	JButton jb_next = new JButton(icon_next);
	//在玩一次按鈕
	String iconPath_again = "images/再玩一次.png";
	ImageIcon icon_again = new ImageIcon(iconPath_again);
	JButton jb_again = new JButton(icon_again);
	
	int index = 0;
	int[] keyin = new int[5];
	int[] word = {11, 4, 10, 14, 2};//正確單字STAGE
	
	public Game2() {
		//遊戲視窗
		jf_main.setVisible(true);
		jf_main.setSize(410,680);
		jf_main.setLocation(450,10);
		jf_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_main.setTitle("WORD POP");
		
		//關卡背景
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		String iconPath_1 = "images/第二關.png";
		ImageIcon icon_g1 = new ImageIcon(iconPath_1);
		JLabel bg1 = new JLabel(icon_g1);
		bg1.setBounds(0, 0, 400, 650);
		bg1.setVisible(true);
		jp1.add(bg1);
		
		//HOME鍵
		jb_home.setBorderPainted(false);//去掉邊框
		jb_home.setBounds(5, 5, 40, 40);
		jb_home.addActionListener(this);
		bg1.add(jb_home);
		
		
		//作答區
		for(int i=0;i<30;i++) {
			icon_answer[i] = new ImageIcon(iconPath_3);
			answer[i] = new JLabel(icon_answer[i]);
			int j = i%5;
			if(i<5) {//第一次
				answer[i].setBounds(70+j*54, 65, 50, 50);
			}else if(i<10) {//第二次
				answer[i].setBounds(70+j*54, 125, 50, 50);
			}else if(i<15) {//第三次
				answer[i].setBounds(70+j*54, 185, 50, 50);
			}else if(i<20) {//第四次
				answer[i].setBounds(70+j*54, 245, 50, 50);
			}else if(i<25) {//第五次
				answer[i].setBounds(70+j*54, 305, 50, 50);
			}else if(i<30) {//第六次
				answer[i].setBounds(70+j*54, 365, 50, 50);
			}
			bg1.add(answer[i]);
		}
		
		//鍵盤按鈕
		ImageIcon[] icon_keyboard = new ImageIcon[28];
		int k = 0;
		for(int i=0;i<28;i++) {
			icon_keyboard[i] = new ImageIcon(iconPath_4[i]);
			jb_keyboard[i] = new JButton(icon_keyboard[i]);
			jb_keyboard[i].setBorderPainted(false);//去掉邊框
			if(i<=9) {//第一排
				jb_keyboard[i].setBounds(5+k*39, 423, 35, 53);
				if(k==9) {
					k=0;
				}else {
					k++;
				}
			}else if(i<=18) {//第二排
				jb_keyboard[i].setBounds(23+k*39, 479, 35, 53);
				if(k==8) {
					k=0;
				}else {
					k++;
				}
			}else if(i<26){//第三排
				jb_keyboard[i].setBounds(25+k*39, 535, 35, 53);
				k++;
			}else if(i==26) {//刪除鍵
				jb_keyboard[i].setBounds(25+k*39, 535, 94, 53);
			}else if(i==27) {//ENTER鍵
				jb_keyboard[i].setBounds(150, 591, 95, 53);
			}
			jb_keyboard[i].addActionListener(this);
			bg1.add(jb_keyboard[i]);
		}
		jf_main.add(jp1);
		
		//成功視窗
		jf_win.setVisible(false);
		jf_win.setSize(410,680);
		jf_win.setLocation(450,10);
		jf_win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_win.setTitle("WORD POP");
		
		//成功背景
		JPanel jp_win = new JPanel();
		jp_win.setLayout(null);
		String iconPath_win = "images/成功.png";
		ImageIcon icon_win = new ImageIcon(iconPath_win);
		JLabel jl_win = new JLabel(icon_win);
		jl_win.setBounds(0, 0, 400, 650);
		jp_win.add(jl_win);
		
		//HOME鍵
		jb_home2.setBorderPainted(false);//去掉邊框
		jb_home2.setBounds(5, 5, 40, 40);
		jb_home2.addActionListener(this);
		jl_win.add(jb_home2);
		
		//下一關按鈕
		jb_next.setBorderPainted(false);//去掉邊框
		jb_next.setBounds(80, 450, 250, 83);
		jb_next.addActionListener(this);
		jl_win.add(jb_next);
		
		jf_win.add(jp_win);
		
		//失敗視窗
		jf_fail.setVisible(false);
		jf_fail.setSize(410,680);
		jf_fail.setLocation(450,10);
		jf_fail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_fail.setTitle("WORD POP");
		
		//背景
		JPanel jp_fail = new JPanel();
		jp_fail.setLayout(null);
		String iconPath_fail = "images/失敗.png";
		ImageIcon icon_fail = new ImageIcon(iconPath_fail);
		JLabel jl_fail = new JLabel(icon_fail);
		jl_fail.setBounds(0, 0, 400, 650);
		jp_fail.add(jl_fail);
		
		//HOME鍵
		jb_home3.setBorderPainted(false);//去掉邊框
		jb_home3.setBounds(5, 5, 40, 40);
		jb_home3.addActionListener(this);
		jl_fail.add(jb_home3);
		
		//再玩一次按鈕
		jb_again.setBorderPainted(false);//去掉邊框
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
		 if(evt.getSource()==jb_home) {//jf_main的HOME鍵
			 jf_main.dispose();
			 new HomePage();
		 }
		 if(evt.getSource()==jb_home2) {//jf_win的HOME鍵
			 jf_win.dispose();
			 new HomePage();
		 }
		 if(evt.getSource()==jb_home3) {//jf_fail的HOME鍵
			 jf_fail.dispose();
			 new HomePage();
		 }
		if(evt.getSource()==jb_next) {//下一關
			jf_win.dispose();
			new Game3();
		}
		if(evt.getSource()==jb_again) {//再玩一次
			jf_fail.dispose();
			new Game2();
		}
		if(evt.getSource()==jb_keyboard[26]) {//刪除
			index--;
			answer[index].setIcon(icon_answer[index]);
		}else if(evt.getSource()==jb_keyboard[27]) {//ENTER
			int correct = 0;
			for(int i=0;i<5;i++) {//keyin第i個
				if(keyin[i]==word[i]) {//字對位置對，綠色字
					answer[index-5+i].setIcon(new ImageIcon(iconPath_6[keyin[i]]));
					correct++;
					if(correct==5) {
						jf_win.setVisible(true);
						jf_main.dispose();
					}
				}else{//keyin[i]!=word[i]，位置錯
					boolean haveWord = false;
					for(int a=0;a<5;a++) {
						if(keyin[i]==word[a]) {//字對，黃色字
							answer[index-5+i].setIcon(new ImageIcon(iconPath_7[keyin[i]]));
							haveWord = true;
						}
					}
					if(haveWord==false) {//字錯，灰色字
						answer[index-5+i].setIcon(new ImageIcon(iconPath_8[keyin[i]]));
					}
					if(index==30) {
						jf_fail.setVisible(true);
						jf_main.dispose();
					}
				}
			}
			correct = 0;
		}else {//輸入
			for(int i=0;i<26;i++) {
				if(evt.getSource()==jb_keyboard[i]) {
					answer[index].setIcon(new ImageIcon(iconPath_5[i]));
					keyin[index%5]=i;//紀錄輸入的字母
					index++;
				}
			}
		 }
	}
}
