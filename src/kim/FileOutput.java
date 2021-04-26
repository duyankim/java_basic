package computing.kim;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileOutput {
	static File file = new File("C:\\Users\\USER\\Desktop\\out.txt");
	static BufferedWriter bw = null;
	static FileWriter fw = null;
	static Calendar cal = Calendar.getInstance();
	
	public static void fileWrite(String str) throws IOException {
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(str);
		bw.close();
	}
	
	public static void writeDate() throws IOException {
		SimpleDateFormat date = new SimpleDateFormat("YYMMdd");
		String currentDate = date.format(cal.getTime());
		
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(currentDate + ",");
		bw.close();
	}
	
	public static void writeTime() throws IOException {
		SimpleDateFormat time = new SimpleDateFormat("HHmm");
		String currentTime = time.format(cal.getTime());
		
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(currentTime + ",");
		bw.close();
	}
}
