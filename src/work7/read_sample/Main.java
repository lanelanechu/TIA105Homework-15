package work7.read_sample;
/*
 * 請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
 * Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String path = "/Users/ryuryu4211/Desktop/TibaMe/Java/TIA105__Workspace/TIA105Homework-15/src/work7/read_sample/Sample.txt";
		File inputFile = new File(path);
		
		try {
			System.out.println(inputFile.getName() + "檔案共有" + getBytes(inputFile) + "個位元組," + getChars(path) + "個字元," + getLines(path) + "列資料");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static long getBytes(File file) {
		return file.length();
	}
	
	public static int getChars(String path) throws IOException {
		FileReader fr = new FileReader(path);
		int res = 0;
		
		while (fr.read() != -1)
			res++;
		
		fr.close();
		return res;
	}
	
	public static int getLines(String path) throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		int res = 0;
		
		while (br.readLine() != null)
			res++;
		
		br.close();
		fr.close();
		return res;
	}
	
	
}
