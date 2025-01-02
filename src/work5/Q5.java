package work5;
/*
 * 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
 * genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
 * 與數字的亂數組合,如圖:
 */
public class Q5 {
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：\n" + genAuthCode());
	}
	
	public static String genAuthCode() {
		String res = "";
		String collection = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		while (res.length() < 8) {
			res += collection.charAt((int) (Math.random() * collection.length()));		
		}
		return res;
	}
}
