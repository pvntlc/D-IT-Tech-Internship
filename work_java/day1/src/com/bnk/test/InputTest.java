package com.bnk.test;

import java.io.IOException;
import java.util.Scanner;

/*
 * 2023.08.28
 */
public class InputTest {

	public static void main(String[] args) throws IOException {
//		System.out.println((char) System.in.read());
		Scanner sc = new Scanner(System.in);
		int msg = sc.nextInt(); // nextLine()은 한줄, next()는 공백까지.
		System.out.println(msg);
		
	}

}
