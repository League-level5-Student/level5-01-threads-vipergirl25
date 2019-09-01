import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.jointheleague.graphical.robot.Robot;

public class testingthreads {
	public static void main(String[] args) {
		Robot rob = new Robot();
		Robot dos = new Robot();
		Thread r1 = new Thread(()->{ 
			rob.moveTo(800, 800);
		rob.move(300);
	});
		Thread r2 = new Thread(()-> {
			dos.moveTo(400, 400);
		dos.move(400);
		});
		r1.start();r2.start();
		try {
			FileReader fr = new FileReader("src/dictionary.txt");
			int c = fr.read();
			while(c==-1) {
				System.out.println((char)(c));
				c = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
}
}
