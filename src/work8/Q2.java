package work8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {
	public static void main(String[] args) {
		List<Train> train = new ArrayList<>();
		train.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		train.add(new Train(118, "自強", "高雄", "台北", 500));
		train.add(new Train(1288, "區間", "新竹", "基隆", 400));
		train.add(new Train(122, "自強", "台中", "花蓮", 600));
		train.add(new Train(1222, "區間", "樹林", "七堵", 300));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		requirement1(train);
		System.out.println("=".repeat(50));
		requirement2(train);
		System.out.println("=".repeat(50));
		requirement3(train);
	}
	
	// 請寫一隻程式,能印出不重複的Train物件
	public static void requirement1(List<Train> train) {
		Set<Train> trainSet = new HashSet<>(train);
		setIteration(trainSet);
		
	}
	
	// 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
	public static void requirement2(List<Train> train) {
		Collections.sort(train);
		listIteration(train);
	}
	
	// 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
	public static void requirement3(List<Train> train) {
		Set<Train> trainSet = new TreeSet<>(train);
		setIteration(trainSet);
	}
	
	public static void setIteration(Set<Train> trainSet) {
		// 使用迭代器
		Iterator iter = trainSet.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		// 使用foreach
		for (Train ele : trainSet)
			System.out.println(ele);
		System.out.println();
	}
	
	public static void listIteration(List<Train> trainList) {
		// 使用迭代器
		Iterator iter = trainList.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		// 使用for
		for (int i = 0; i < trainList.size(); i++)
			System.out.println(trainList.get(i));
		System.out.println();
		
		// 使用foreach
		for (Train ele : trainList)
			System.out.println(ele);
		System.out.println();
	}
}
