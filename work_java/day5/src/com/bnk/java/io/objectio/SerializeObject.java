package com.bnk.java.io.objectio;

import java.io.*;

public class SerializeObject {
	public static void main(String args[]) {
		Customer c = new Customer();
		c.name = "홍길동";
		c.address = "서울";
		c.age = 20;

		try {
			FileOutputStream f = new FileOutputStream("Data.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(c);
			System.out.println(" 파일이 생성되었습니다");
			s.close();
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
