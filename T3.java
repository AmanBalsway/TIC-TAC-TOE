import javax.swing.*;
import java.awt.event.*;
public class T3 implements ActionListener{
	JFrame JF;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	JLabel jl;;
	int ck=1;
	String S1="X";
	String S2="0";	
	void b2(){

			jb1.setEnabled(false);
			jb2.setEnabled(false);
			jb3.setEnabled(false);
			jb4.setEnabled(false);
			jb5.setEnabled(false);
			jb6.setEnabled(false);
			jb7.setEnabled(false);
			jb8.setEnabled(false);
			jb9.setEnabled(false);
		}
			
		
	T3(){
		JF = new JFrame("TIC TAC TOE GAME");
		JF.setSize(500,500);
	
		jb1 = new JButton(" ");
		jb1.setBounds(150,150,50,50);
		jb1.addActionListener(this);
		JF.add(jb1);

		jb2 = new JButton(" ");
		jb2.setBounds(200,150,50,50);
		jb2.addActionListener(this);
		JF.add(jb2);

		jb3 = new JButton(" ");
		jb3.setBounds(250,150,50,50);
		jb3.addActionListener(this);
		JF.add(jb3);

		jb4 = new JButton(" ");
		jb4.setBounds(150,200,50,50);
		jb4.addActionListener(this);
		JF.add(jb4);

		jb5 = new JButton(" ");
		jb5.setBounds(200,200,50,50);
		jb5.addActionListener(this);
		JF.add(jb5);

		jb6 = new JButton(" ");
		jb6.setBounds(250,200,50,50);
		jb6.addActionListener(this);
		JF.add(jb6);

		jb7 = new JButton(" ");
		jb7.setBounds(150,250,50,50);
		jb7.addActionListener(this);
		JF.add(jb7);

		jb8 = new JButton(" ");
		jb8.setBounds(200,250,50,50);
		jb8.addActionListener(this);
		JF.add(jb8);

		jb9 = new JButton(" ");
		jb9.setBounds(250,250,50,50);
		jb9.addActionListener(this);
		JF.add(jb9);

		jb10 = new JButton("Restart ");
		jb10.setBounds(170,350,100,50);
		jb10.addActionListener(this);
		JF.add(jb10);
		
		jl = new JLabel();
		jl.setBounds(150,300,450,50);
		JF.add(jl);

		JF.setLayout(null);
		JF.setVisible(true);

		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==jb1){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb1.setText("X");
				
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb1.setText("0");
			}
			jb1.setEnabled(false);
				ck++;
		}
		if(e.getSource()==jb2){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb2.setText("X");
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb2.setText("0");
			}
			jb2.setEnabled(false);
			ck++;
		}
		if(e.getSource()==jb3){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb3.setText("X");
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb3.setText("0");
			}ck++;
			jb3.setEnabled(false);
		}
		if(e.getSource()==jb4){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb4.setText("X");
				//ck++;
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb4.setText("0");
			}
			jb4.setEnabled(false);
			ck++;
		}
		if(e.getSource()==jb5){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb5.setText("X");
				//ck++;
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb5.setText("0");
			}
			ck++;
			jb5.setEnabled(false);
		}
		if(e.getSource()==jb6){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb6.setText("X");
				//ck++;
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb6.setText("0");
			}
			jb6.setEnabled(false);
			ck++;
		}
		if(e.getSource()==jb7){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb7.setText("X");
				//ck++;
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb7.setText("0");
			}
			jb7.setEnabled(false);
			ck++;
		}
		if(e.getSource()==jb8){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb8.setText("X");
				//ck++;
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb8.setText("0");
			}
			jb8.setEnabled(false);
			ck++;
		}
		if(e.getSource()==jb9){
			if((ck==1)||(ck==3)||(ck==5)||(ck==7)||(ck==9)){
				jb9.setText("X");
				//ck++;
			}
			else if((ck==2)||(ck==4)||(ck==6)||(ck==8)){
				jb9.setText("0");
			}
			jb9.setEnabled(false);
			ck++;
		}

		if((ck==6)||(ck==8)||(ck==10)){
			if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb3.getText() == S1){
				jl.setText(" 1st Player win ");
				b2();
			}
			if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() == S1){
				jl.setText(" 1st Player win ");b2();
			}
			if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() == S1){
				jl.setText(" 1st Player win ");b2();
			}
			if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText() == S1){
				jl.setText(" 1st Player win ");b2();
			}
			if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() == S1){
				jl.setText(" 1st Player win ");b2();
			}
			if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() == S1){
				jl.setText(" 1st Player win ");b2();
			}
			if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() == S1){
				jl.setText(" 1st Player win ");b2();
			}
			if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() == S1){
				jl.setText(" 1st Player win ");b2();
			}
		}
		else if((ck==7)||(ck==9)){
			if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb3.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
			if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
			if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
			 if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
			 if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
			if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
			if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
			if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() == S2){
				jl.setText("2nd Player win ");b2();
			}
		}
		if(e.getSource()==jb10){
			jb1.setText(" ");
			jb2.setText(" ");
			jb3.setText(" ");
			jb4.setText(" ");
			jb5.setText(" ");
			jb6.setText(" ");
			jb7.setText(" ");
			jb8.setText(" ");
			jb9.setText(" ");
                  		jl.setText("");

			jb1.setEnabled(true);
			jb2.setEnabled(true);
			jb3.setEnabled(true);
			jb4.setEnabled(true);
			jb5.setEnabled(true);
			jb6.setEnabled(true);
			jb7.setEnabled(true);
			jb8.setEnabled(true);
			jb9.setEnabled(true);
			ck=1;
		}
	}
	public static void main(String args[]){
		System.out.println("1st player turn");
		new T3();
	}
}