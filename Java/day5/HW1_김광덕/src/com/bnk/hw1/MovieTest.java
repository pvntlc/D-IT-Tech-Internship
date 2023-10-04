package com.bnk.hw1;


import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		int number;
		MovieMgrl mm = MovieMgrlImpl.getInstance();
		// TODO Auto-generated method stub

		while (true) {
			System.out.println("<<< 영화 관리 프로그램 >>>");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.print("원하는 번호를 선택하세요.");

			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();

			if (number == 1) {
				// title, director, grade, genre, summary
				System.out.println("영화 제목을 입력하세요.");
				String title = sc.next();
				System.out.println("영화 감독을 입력하세요.");
				String director = sc.next();
				System.out.println("등급을 입력하세요.");
				int grade = sc.nextInt();
				System.out.println("영화 장르을 입력하세요.");
				String genre = sc.next();
				System.out.println("영화 요약을 입력하세요.");
				String summary = sc.next();
				mm.add(new Movie(title, director, grade, genre, summary));
			} else if (number == 2) {
				for (Movie m : mm.search()) {
					System.out.println(m);
				}
			} else if (number == 3) {
				System.out.println("영화 제목을 입력하세요.");
				String title1 = sc.next();
				System.out.println(mm.search(title1));
				;
			} else if (number == 4) {
				System.out.println("영화 장르룰 입력하세요.");
				String genre = sc.next();
				for (Movie m : mm.searchGenre(genre)) {
					System.out.println(m);
				}

			} else if (number == 5) {
				System.out.println("삭제할 영화 제목을 입력하세요.");
				String subject = sc.next();
				mm.delete(subject);
			} else if (number == 0) {
				break;
			} else {
				break;
			}
		}

	}

}
