package Charactor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Dog{
	public int x ;
	public int y;
	public int health=260;
	public static int high=85;
	
	public Dog() {
		
	}
	
	public Dog(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void jump(JPanel page) {
		this.y -= high;
		page.repaint();
		//--- fall ---
		Timer timer =new Timer(580,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					y += high;
					page.repaint();
			}
		});
		timer.setRepeats(false);
		timer.start();
	}
	
	public BufferedImage getImage() {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("img\\dog.png"));
			return image;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}
}