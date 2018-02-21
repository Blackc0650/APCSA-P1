package labs.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.xml.bind.DatatypeConverter;

public class AutoSignature {
	private Date date = new Date();
	//TODO: Fix this and the hex converter it does not work correctly
	private static String name = "43616d65726f6e20426c61636b";
	@SuppressWarnings("deprecation")
	private final String textDate = new DateFormatSymbols().getMonths()[date.getMonth()] + " " + date.getDate() + " " + Calendar.getInstance().get(Calendar.YEAR);
	private final String className = "Advanced Placement Computer Science A";
	private final String lab = this.getClass().getName();
	private final String[] arrayFormat = {name,textDate,className,lab};
	private JFileChooser jFileChooser;
	private static File f;
	public static void main(String[] args) throws UnsupportedEncodingException {
		AutoSignature autoSignature = new AutoSignature();
		name = new String((byte[])DatatypeConverter.parseHexBinary(name),"UTF-8");
		try {
			autoSignature.addComment(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(1);
	}
	public AutoSignature() {
		String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath().replace("bin/", "");
		jFileChooser = new JFileChooser(path);
		jFileChooser.setVisible(true);
		jFileChooser.showOpenDialog(new JFrame());
		f = jFileChooser.getSelectedFile();
	}
	private void addComment(File f) throws IOException {
		if(f != null) {
			if(f.canRead() && f.canWrite()) {
				ArrayList<String> data = insertCommentData();
				BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
				String nextLine;
				while((nextLine = bufferedReader.readLine()) != null) {
					data.add(nextLine);
				}
				bufferedReader.close();
				FileWriter fileWriter = new FileWriter(f);
				for(String s : data) {
					for(char c : s.toCharArray()) {
						fileWriter.write(c);
					}
					fileWriter.write('\n');
				}
				fileWriter.close();
			}
			else {
				System.err.println("Could not open the file or write to the file!");
			}
		}
		else {
			System.out.println("No file was selected!");
		}
	}
	private ArrayList<String> insertCommentData() {
		ArrayList<String> data = new ArrayList<String>();
		for(String s : arrayFormat) {
			data.add("//" + s);
		}
		return data;
	}
}
