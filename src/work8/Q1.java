package work8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q1 {
	public static void main(String[] args) {
		Collection<Object> col = new ArrayList<>();
		
		col.add(new Integer(100));
		col.add(new Double(3.14));
		col.add(new Long(21L));
		col.add(new Short("100"));
		col.add(new Double(5.1));
		col.add("Kitty");
		col.add(new Integer(100));
		col.add(new Object());
		col.add("Snoopy");
		col.add(new BigInteger("1000"));
		
		iteration(col);
		removeNumber(col);
		
	}
	
	// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
	public static void iteration(Collection<Object> col) {
		// 使用Iterator
		Iterator iter = col.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println();
		
		// 使用傳統for
		for (int i = 0; i < col.size(); i++)
			System.out.println(((ArrayList<Object>) col).get(i));
		System.out.println();
		
		// 使用foreach
		for (Object ele : col)
			System.out.println(ele);
		System.out.println("=".repeat(30));
	}
	
	// 移除不是java.lang.Number相關的物件
	// 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
	public static void removeNumber(Collection<Object> col) {
//		int i = 0;
//		while (i < col.size()) {
//			Object current = ((ArrayList<Object>) col).get(i);
//			if (!(current instanceof Number)) {
//				col.remove(current);
//			} else {
//				i++;
//			}
//		}

		col.removeIf(ele -> !(ele instanceof Number));
		iteration(col);
	}
}
