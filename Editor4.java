import java.awt.Color;

//This action transforms the colored Thor image into a black and white Thor image.
//Implement the Editor4.java program, and test it. Sit back, watch, and enjoy.

public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color [][] targetImage = Runigram.grayScaled(sourceImage);
		
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);

	}
}
