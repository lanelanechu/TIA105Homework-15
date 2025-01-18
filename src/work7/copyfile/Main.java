package work7.copyfile;
/*
 * 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
 * 呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案
 */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		File source = new File("/Users/ryuryu4211/Desktop/TibaMe/Java/TIA105__Workspace/TIA105Homework-15/src/work7/copyfile/source.txt");
		File target = new File("/Users/ryuryu4211/Desktop/TibaMe/Java/TIA105__Workspace/TIA105Homework-15/src/work7/copyfile/target.txt");
		copyFile(source, target);
	}
	
	public static void copyFile(File source, File target) {
		try {
			FileReader fr = new FileReader(source);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(target);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			String str;
			while ((str = br.readLine()) != null) {
				pw.println(str);
			}
			
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
