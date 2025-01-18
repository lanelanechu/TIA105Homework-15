package work7.random_number;
/*
 * 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 
 * (請使用append功能讓每次執行結果都能被保存起來)
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("/Users/ryuryu4211/Desktop/TibaMe/Java/TIA105__Workspace/TIA105Homework-15/src/work7/random_number/Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 1; i <= 10; i++) {
				pw.append((int)(Math.random() * 1000) + 1 + " ");
			}
			pw.append("\n");
			
			pw.close();
			bw.close();
			fw.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
