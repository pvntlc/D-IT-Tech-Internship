package com.bnk.java.excep;

import java.io.*;

class InputFile {
	FileReader fis;

	InputFile(String filename) throws FileNotFoundException {
		fis = new FileReader("C:\\BNK\\work_java\\day5\\src\\com\\bnk\\java\\excep\\data.txt");
	}

	void readLine() {
		String s;
		BufferedReader buf = new BufferedReader(fis);
		try {
			while ((s = buf.readLine()) != null)
				System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] a) throws IOException {

		InputFile inputFile = new InputFile("data.txt");
		inputFile.readLine();
		System.out.println("Program End...");
	}
}
