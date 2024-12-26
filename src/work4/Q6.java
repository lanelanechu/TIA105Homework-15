package work4;

public class Q6 {
	public static void main(String[] args) {
		int[][] data = {{10, 35, 40, 100, 90, 85, 75, 70},
						{37, 75, 77, 89, 64, 75, 70, 95},
						{100, 70, 79, 90, 75, 70, 79, 90},
						{77, 95, 70, 89, 60, 75, 85, 89},
						{98, 70, 89, 90, 75, 90, 89, 90},
						{90, 80, 100, 75, 50, 20, 99, 75}};
		
		int[] records = checkHighScores(data);
		
		printHighScoreTimes(records);
	
	}
	
	public static int[] checkHighScores(int[][] data) {
		int maxi, current;
		int[] res = new int[8];
		
		for (int i = 0; i < data.length; i++) {
			maxi = data[i][0];
			current = 0;
			for (int j = 1; j < data[i].length; j++) {
				if (data[i][j] > maxi) {
					current = j;
					maxi = data[i][j];
				}				
			}
			res[current]++;
		}
		return res;
	}
	
	public static void printHighScoreTimes(int[] records) {
		for (int i = 0; i < records.length; i++)
			System.out.println((i + 1) + "號： " + records[i] + "次");
	}
}
