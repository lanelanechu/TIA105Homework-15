package work7.object;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		File targetDir = new File("/Users/ryuryu4211/Desktop/TibaMe/Java/TIA105__Workspace/TIA105Homework-15/src/work7/object/Data");
		targetDir.mkdir();
		File targetFile = new File("/Users/ryuryu4211/Desktop/TibaMe/Java/TIA105__Workspace/TIA105Homework-15/src/work7/object/Data/Object.ser");

		Object[] pets = new Object[4];
		pets[0] = new Cat("Kitty");
		pets[1] = new Dog("Frank");
		pets[2] = new Dog("Henry");
		pets[3] = new Cat("Maggie");
		
		// 輸出
		FileOutputStream fos = new FileOutputStream(targetFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for (int i = 0; i < pets.length; i++) {
			oos.writeObject(pets[i]);
		}
		oos.close();
		fos.close();
		
		// 輸入
		FileInputStream fis = new FileInputStream(targetFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while (true) {
				Object current = ois.readObject();
				if (current instanceof Cat cat) {
					cat.speak();
				} else if (current instanceof Dog dog) {
					dog.speak();
				}
			}		
		} catch (EOFException e) {
		}	
		ois.close();
		fis.close();
	}
}
