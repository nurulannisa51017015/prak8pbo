/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

	import java.awt.*;
	
	/**
	*
	* @author ASUS
	*/
	public class Mobil extends Panel {
	Mobil(){
	setBackground(Color.WHITE);
	}
	public void paint(Graphics g){
	
	g.setColor(Color.yellow);
	g.fillRect(100, 200, 400, 200);
	g.setColor(Color.red);
	g.fillRect(500, 290, 140, 110);
	
	g.setColor(Color.red);
	g.fillRoundRect(200, 360, 100, 100, 100, 100);
	g.fillRoundRect(400, 360, 100, 100, 100, 100);
	g.setColor(Color.cyan);
	g.drawRoundRect(200, 360, 100, 100, 100, 100);
	g.drawRoundRect(400, 360, 100, 100, 100, 100);
	g.drawRoundRect(199, 359, 102, 102, 102, 102);
	g.drawRoundRect(399, 359, 102, 102, 102, 102);
	g.drawRoundRect(198, 358, 104, 104, 104, 104);
	g.drawRoundRect(398, 358, 104, 104, 104, 104);
	
	g.setColor(Color.black);
	Font f = new Font("Helvetica", Font.BOLD,30);
	FontMetrics fm = getFontMetrics(f);
	g.setFont(f);
	
	String S ="ini mobil dan nama saya stefany";
	
	g.drawString(S, 110, 500);
	}
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
	// TODO code application logic here
	Frame f = new Frame("Testing graphics panel");
	Mobil gp = new Mobil();
	f.add(gp);
	f.setSize(900,900);
	f.setVisible(true);
	}
	
	}

